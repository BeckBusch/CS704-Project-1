import javax.net.ServerSocketFactory;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.xml.transform.Templates;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ABSGUI {
    HashMap<String, signalSender> signalSendersMap;
    String[] signalNames = { "bottleAtPos1", "bottleLeftPos5", "tableAlignedWithSensor",
            "bottleAtPos5", "capOnBottleAtPos1", "bottleAtPos4",
            "gripperZAxisLowered", "gripperZAxisLifted", "gripperTurnHomePos",
            "gripperTurnFinalPos", "bottleAtPos2", "dosUnitEvac", "dosUnitFilled" };

    HashMap<String, JLabel> imageLabels;
    String[] imageNames = { "canisterBottom.png", "tableRotation.png", "conveyorOn.png",
            "conveyorOff.png", "tableAlign.png", "tableUnalign.png", "bottleLeaving.png",
            "bottlePos5.png", "bottlePos1.png", "capPos1.png", "canisterTop.png",
            "fullyRaised.png", "bottlePos4.png", "fullyLowered.png", "bottlePos2.png" };

    HashMap<String, JLabel> messageLabels;
    String[] messageNames = { "gripperTurn", "gripperDown", "gripperTurning", "gripCap",
            "gripBottle", "valveInjector", "valveInlet", "movingCanister" };
    int[][] messageLocations = { { 1150, 20 }, { 1150, 60 }, { 1150, 100 }, { 1150, 140 }, { 1150, 180 }, { 700, 100 },
            { 700, 140 }, { 700, 180 } };

    public static JFrame windowFrame;

    public static void main(String[] args) throws IOException {
        // ServerListener server = new ServerListener();
        // server.start();
        ABSGUI daGUI = new ABSGUI();
    }

    public ABSGUI() throws IOException {
        ServerListener server = new ServerListener();
        server.start();

        // signalSendersMap = new HashMap<String, signalSender>();
        // int start = 4018;

        // for (String name : signalNames) {
        // signalSender tempSender = new signalSender(start);

        // tempSender.setState(false);
        // tempSender.start();

        // signalSendersMap.put(name, tempSender);
        // start += 1;
        // }

        guiGenerator();
    }

    public void guiGenerator() {
        windowFrame = new JFrame();
        windowFrame.setLayout(null);
        windowFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        windowFrame.setSize(new Dimension(1400, 850));

        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(5, 5, 1300, 105);
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        int xPos = 190;
        int yPos = 5;

        JLabel warningLabel = new JLabel("Buttons Disabled");
        warningLabel.setBounds(10, 10, 180, 45);
        warningLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        buttonPanel.add(warningLabel);

        for (String name : signalNames) {
            JToggleButton tempButton = new JToggleButton(name);
            tempButton.setFont(new Font("Verdana", Font.PLAIN, 12));
            tempButton.setBounds(xPos, yPos, 180, 45);
            tempButton.setActionCommand(name);
            tempButton.addItemListener(new ButtonClickListener());
            tempButton.setEnabled(false);

            buttonPanel.add(tempButton);

            xPos += 185;
            if (xPos > 1200) {
                xPos = 5;
                yPos += 50;
            }
        }
        windowFrame.add(buttonPanel);

        JPanel guiPanel = new JPanel(null);
        guiPanel.setBounds(5, 115, 1375, 690);
        guiPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        imageLabels = new HashMap<String, JLabel>();
        for (String name : imageNames) {
            JLabel tempLabel = new JLabel(new ImageIcon(getClass().getResource("images/" + name)));
            tempLabel.setBounds(0, 0, tempLabel.getPreferredSize().width, tempLabel.getPreferredSize().height);
            tempLabel.setVisible(false);
            imageLabels.put(name, tempLabel);
            guiPanel.add(tempLabel);
        }
        imageLabels.get("conveyorOff.png").setVisible(true);

        messageLabels = new HashMap<>();
        for (String name : messageNames) {
            JLabel tempLabel = new JLabel(name);
            tempLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
            int index = Arrays.asList(messageNames).indexOf(name);
            int[] location = messageLocations[index];
            tempLabel.setBounds(location[0], location[1], 200, 50);
            guiPanel.add(tempLabel);
        }

        JLabel backgroundLabel = new JLabel(new ImageIcon(getClass().getResource("images/" + "Background.png")));
        backgroundLabel.setBounds(0, 0, backgroundLabel.getPreferredSize().width,
                backgroundLabel.getPreferredSize().height);
        guiPanel.add(backgroundLabel);

        windowFrame.add(guiPanel);

        windowFrame.setVisible(true);
    }

    private class ButtonClickListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            JToggleButton sourceButton = (JToggleButton) e.getSource();
            String buttonName = sourceButton.getText();

            int state = e.getStateChange();

            if (state == ItemEvent.SELECTED) {
                signalSendersMap.get(buttonName).setState(true);
            } else {
                signalSendersMap.get(buttonName).setState(false);
            }

        }
    }

    class ServerListener extends Thread {
        private ServerSocket serverSocket;

        ServerListener() throws IOException {
            serverSocket = ServerSocketFactory.getDefault().createServerSocket(4015);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    final Socket socketToClient = serverSocket.accept();
                    ClientHandler clientHandler = new ClientHandler(socketToClient);
                    clientHandler.start();
                } catch (IOException e) {
                    System.out.println("socket fail");
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    class ClientHandler extends Thread {
        private Socket socket;
        BufferedReader br;

        ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }

        @Override
        public void run() {
            String line, inputName, inputStatus, switcher;
            Pattern statusPattern = Pattern.compile("(?:\\\"status\\\":)(.*?)(?:,\\\"{1})",
                    Pattern.CASE_INSENSITIVE);
            Pattern namePattern = Pattern.compile("(?:\\\"name\\\":\\\")(.*?)(?:\\\"{1})",
                    Pattern.CASE_INSENSITIVE);

            while (true) {
                try {
                    while ((line = br.readLine()) != null) {
                        Matcher statusMatcher = statusPattern.matcher(line);
                        Matcher nameMatcher = namePattern.matcher(line);

                        if (statusMatcher.find() && nameMatcher.find()) {
                            inputName = nameMatcher.group(1);
                            inputStatus = statusMatcher.group(1);

                            switcher = inputName + inputStatus;
                             System.out.println(switcher);

                            switch (switcher) {
                                case "motConveyorOnOfftrue":
                                    System.out.println("motConveyorOnOfftrue");
                                    imageLabels.get("conveyorOn.png").setVisible(true);
                                    break;
                                case "motConveyorOnOfffalse":
                                    System.out.println("motConveyorOnOfffalse");
                                    imageLabels.get("conveyorOn.png").setVisible(false);
                                    break;
                                case "rotaryTableTriggertrue":
                                    System.out.println("rotaryTableTriggertrue");
                                    imageLabels.get("tableRotation.png").setVisible(true);
                                    break;
                                case "rotaryTableTriggerfalse":
                                    System.out.println("rotaryTableTriggerfalse");
                                    imageLabels.get("tableRotation.png").setVisible(false);
                                    break;
                                case "cylPos5ZaxisExtendtrue":
                                    System.out.println("cylPos5ZaxisExtendtrue");
                                    messageLabels.get("gripperDown").setText("Lowering Gripper");
                                    break;
                                case "cylPos5ZaxisExtendfalse":
                                    System.out.println("cylPos5ZaxisExtendfalse");
                                    messageLabels.get("gripperDown").setText("Raising Gripper");
                                    break;
                                case "gripperTurnRetracttrue":
                                    System.out.println("gripperTurnRetracttrue");
                                    messageLabels.get("gripperTurn").setText("Untwisting Gripper");
                                    break;
                                case "gripperTurnRetractfalse":
                                    System.out.println("gripperTurnRetractfalse");
                                    // noop
                                    break;
                                case "gripperTurnExtendtrue":
                                    System.out.println("gripperTurnExtendtrue");
                                    messageLabels.get("gripperTurn").setText("Twisting Gripper");
                                    break;
                                case "gripperTurnExtendfalse":
                                    System.out.println("gripperTurnExtendfalse");
                                    // noop
                                    break;
                                case "capGripperPos5Extendtrue":
                                    System.out.println("capGripperPos5Extendtrue");
                                    messageLabels.get("gripCap").setText("Gripping Cap");
                                    break;
                                case "capGripperPos5Extendfalse":
                                    System.out.println("capGripperPos5Extendfalse");
                                    messageLabels.get("gripCap").setText("Released Cap");
                                    break;
                                case "cylClampBottleExtendtrue":
                                    System.out.println("cylClampBottleExtendtrue");
                                    messageLabels.get("gripBottle").setText("Clamping Bottle");
                                    break;
                                case "cylClampBottleExtendfalse":
                                    System.out.println("cylClampBottleExtendfalse");
                                    messageLabels.get("gripBottle").setText("Released Bottle");
                                    break;
                                case "valveInjectorOnOfftrue":
                                    System.out.println("valveInjectorOnOfftrue");
                                    messageLabels.get("valveInjector").setText("Injector Valve On");
                                    break;
                                case "valveInjectorOnOfffalse":
                                    System.out.println("valveInjectorOnOfffalse");
                                    messageLabels.get("valveInjector").setText("Injector Valve Off");
                                    break;
                                case "valveInletOnOfftrue":
                                    System.out.println("valveInletOnOfftrue");
                                    messageLabels.get("valveInlet").setText("Inlet Valve On");
                                    break;
                                case "valveInletOnOfffalse":
                                    System.out.println("valveInletOnOfffalse");
                                    messageLabels.get("valveInlet").setText("Inlet Valve Off");
                                    break;
                                case "dosUnitValveRetracttrue":
                                    System.out.println("dosUnitValveRetracttrue");
                                    messageLabels.get("movingCanister").setText("Raising Canister");
                                    break;
                                case "dosUnitValveRetractfalse":
                                    System.out.println("dosUnitValveRetractfalse");
                                    // noop
                                    break;
                                case "dosUnitValveExtendtrue":
                                    System.out.println("dosUnitValveExtendtrue");
                                    messageLabels.get("movingCanister").setText("Lowering Canister");
                                    break;
                                case "dosUnitValveExtendfalse":
                                    System.out.println("dosUnitValveExtendfalse");
                                    // noop
                                    break;
                                case "bottleAtPos1true":
                                    imageLabels.get("bottlePos1.png").setVisible(true);
                                    break;
                                case "bottleAtPos1false":
                                    imageLabels.get("bottlePos1.png").setVisible(false);
                                    break;
                                case "bottleLeftPos5true":
                                    imageLabels.get("bottleLeaving.png").setVisible(true);
                                    break;
                                case "bottleLeftPos5false":
                                    imageLabels.get("bottleLeaving.png").setVisible(false);
                                    break;
                                case "tableAlignedWithSensortrue":
                                    imageLabels.get("tableAlign.png").setVisible(true);
                                    imageLabels.get("tableUnalign.png").setVisible(false);
                                    break;
                                case "tableAlignedWithSensorfalse":
                                    imageLabels.get("tableUnalign.png").setVisible(true);
                                    imageLabels.get("tableAlign.png").setVisible(false);
                                    break;
                                case "bottleAtPos5true":
                                    imageLabels.get("bottlePos5.png").setVisible(true);
                                    break;
                                case "bottleAtPos5false":
                                    imageLabels.get("bottlePos5.png").setVisible(false);
                                    break;
                                case "capOnBottleAtPos1true":
                                    imageLabels.get("capPos1.png").setVisible(true);
                                    break;
                                case "capOnBottleAtPos1false":
                                    imageLabels.get("capPos1.png").setVisible(false);
                                    break;
                                case "bottleAtPos4true":
                                    imageLabels.get("bottlePos4.png").setVisible(true);
                                    break;
                                case "bottleAtPos4false":
                                    imageLabels.get("bottlePos4.png").setVisible(false);
                                    break;
                                case "gripperZAxisLoweredtrue":
                                    imageLabels.get("fullyLowered.png").setVisible(true);
                                    break;
                                case "gripperZAxisLoweredfalse":
                                    imageLabels.get("fullyLowered.png").setVisible(false);
                                    break;
                                case "gripperZAxisLiftedtrue":
                                    imageLabels.get("fullyRaised.png").setVisible(true);
                                    break;
                                case "gripperZAxisLiftedfalse":
                                    imageLabels.get("fullyRaised.png").setVisible(false);
                                    break;
                                case "gripperTurnHomePostrue":
                                    messageLabels.get("gripperTurn").setText("Gripper Init");
                                    break;
                                case "gripperTurnHomePosfalse":
                                    messageLabels.get("gripperTurn").setText("");
                                    break;
                                case "gripperTurnFinalPostrue":
                                    messageLabels.get("gripperTurn").setText("Gripper Final");
                                    break;
                                case "gripperTurnFinalPosfalse":
                                    messageLabels.get("gripperTurn").setText("");
                                    break;
                                case "bottleAtPos2true":
                                    imageLabels.get("bottlePos2.png").setVisible(true);
                                    break;
                                case "bottleAtPos2false":
                                    imageLabels.get("bottlePos2.png").setVisible(false);
                                    break;
                                case "dosUnitEvactrue":
                                    imageLabels.get("canisterBottom.png").setVisible(true);
                                    break;
                                case "dosUnitEvacfalse":
                                    imageLabels.get("canisterBottom.png").setVisible(false);
                                    break;
                                case "dosUnitFilledtrue":
                                    imageLabels.get("canisterTop.png").setVisible(true);
                                    break;
                                case "dosUnitFilledfalse":
                                    imageLabels.get("canisterTop.png").setVisible(false);
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("fail1");
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    class signalSender extends Thread {
        ObjectOutputStream outputStream;
        boolean state;

        signalSender(int port) {
            try {
                outputStream = new ObjectOutputStream(new Socket("127.0.0.1", port).getOutputStream());
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        public void setState(boolean state) {
            this.state = state;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    outputStream.writeObject(new Object[] { state });
                    Thread.sleep(100);
                }
            } catch (IOException | InterruptedException aa) {
                System.out.println(aa.getMessage());
            }
        }
    }

    // int Typed Signal Sender
    class intSignalSender extends Thread {
        ObjectOutputStream outputStream;
        int outgoingValue;

        intSignalSender(int port) {
            try {
                outputStream = new ObjectOutputStream(new Socket("127.0.0.1", port).getOutputStream());
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        void setOutgoingInt(int number) {
            this.outgoingValue = number;
        }

        @Override
        public void run() {
            try {
                outputStream.writeObject(new Object[] { true, outgoingValue });
                Thread.sleep(100);
                outputStream.writeObject(new Object[] { false, outgoingValue });
            } catch (IOException | InterruptedException aa) {
                System.out.println(aa.getMessage());
            }
        }
    }

    // String Typed Signal Sender
    class stringSignalSender extends Thread {
        ObjectOutputStream outputStream;
        String outgoingValue;

        stringSignalSender(int port) {
            try {
                outputStream = new ObjectOutputStream(new Socket("127.0.0.1", port).getOutputStream());
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        void setOutgoingString(String value) {
            this.outgoingValue = value;
        }

        @Override
        public void run() {
            try {
                outputStream.writeObject(new Object[] { true, outgoingValue });
                Thread.sleep(100);
                outputStream.writeObject(new Object[] { false, outgoingValue });
            } catch (IOException | InterruptedException aa) {
                System.out.println(aa.getMessage());
            }
        }
    }

}

// Sender Usage Example
// signalSender send1 = new signalSender(4007);
// send1.start();

// stringSignalSender send2 = new stringSignalSender(4008);
// send2.setOutgoingString("apple");
// send2.start();

// intSignalSender send3 = new intSignalSender(4009);
// send3.setOutgoingInt(5);
// send3.start();