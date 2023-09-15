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
    String[] signalNames = { "bottleAtPos1GUI", "bottleLeftPos5GUI", "tableAlignedWithSensorGUI",
            "bottleAtPos5GUI", "capOnBottleAtPos1GUI", "bottleAtPos4GUI",
            "gripperZAxisLoweredGUI", "gripperZAxisLiftedGUI", "gripperTurnHomePosGUI",
            "gripperTurnFinalPosGUI", "bottleAtPos2GUI", "dosUnitEvacGUI", "dosUnitFilledGUI" };

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
        // imageLabels.get("canisterTop.png").setVisible(true);
        // imageLabels.get("tableAlign.png").setVisible(true);
        // imageLabels.get("bottlePos1.png").setVisible(true);
        // imageLabels.get("bottleLeaving.png").setVisible(true);
        // imageLabels.get("bottlePos2.png").setVisible(true);
        // imageLabels.get("fullyLowered.png").setVisible(true);
        // imageLabels.get("bottlePos4.png").setVisible(true);
        // imageLabels.get("conveyorOff.png").setVisible(true);

        messageLabels = new HashMap<>();
        for (String name : messageNames) {
            JLabel tempLabel = new JLabel(name);
            tempLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
            int index = Arrays.asList(messageNames).indexOf(name);
            int[] location = messageLocations[index];
            tempLabel.setBounds(location[0], location[1], 200, 50);
            messageLabels.put(name, tempLabel);
            guiPanel.add(tempLabel);
        }
        // messageLabels.get("gripperDown").setText("Lowering Gripper");
        // messageLabels.get("gripperTurning").setText("Twisting Gripper");
        // messageLabels.get("gripCap").setText("Gripping Cap");
        // messageLabels.get("gripBottle").setText("Clamping Bottle");
        // messageLabels.get("valveInjector").setText("Injector Valve On");
        // messageLabels.get("valveInlet").setText("Inlet Valve On");
        // messageLabels.get("movingCanister").setText("Lowering Canister");
        // messageLabels.get("gripperTurn").setText("Gripper Init");


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
                                case "motConveyorOnOffGUItrue":
                                    System.out.println("motConveyorOnOfftrue");
                                    imageLabels.get("conveyorOn.png").setVisible(true);
                                    break;
                                case "motConveyorOnOffGUIfalse":
                                    System.out.println("motConveyorOnOfffalse");
                                    imageLabels.get("conveyorOn.png").setVisible(false);
                                    break;
                                case "rotaryTableTriggerGUItrue":
                                    System.out.println("rotaryTableTriggertrue");
                                    imageLabels.get("tableRotation.png").setVisible(true);
                                    break;
                                case "rotaryTableTriggerGUIfalse":
                                    System.out.println("rotaryTableTriggerfalse");
                                    imageLabels.get("tableRotation.png").setVisible(false);
                                    break;
                                case "cylPos5ZaxisExtendGUItrue":
                                    System.out.println("cylPos5ZaxisExtendtrue");
                                    messageLabels.get("gripperDown").setText("Lowering Gripper");
                                    break;
                                case "cylPos5ZaxisExtendGUIfalse":
                                    System.out.println("cylPos5ZaxisExtendfalse");
                                    messageLabels.get("gripperDown").setText("Raising Gripper");
                                    break;
                                case "gripperTurnRetractGUItrue":
                                    System.out.println("gripperTurnRetracttrue");
                                    messageLabels.get("gripperTurning").setText("Untwisting Gripper");
                                    break;
                                case "gripperTurnRetractGUIfalse":
                                    System.out.println("gripperTurnRetractfalse");
                                    // noop
                                    break;
                                case "gripperTurnExtendGUItrue":
                                    System.out.println("gripperTurnExtendtrue");
                                    messageLabels.get("gripperTurning").setText("Twisting Gripper");
                                    break;
                                case "gripperTurnExtendGUIfalse":
                                    System.out.println("gripperTurnExtendfalse");
                                    // noop
                                    break;
                                case "capGripperPos5ExtendGUItrue":
                                    System.out.println("capGripperPos5Extendtrue");
                                    messageLabels.get("gripCap").setText("Gripping Cap");
                                    break;
                                case "capGripperPos5ExtendGUIfalse":
                                    System.out.println("capGripperPos5Extendfalse");
                                    messageLabels.get("gripCap").setText("Released Cap");
                                    break;
                                case "cylClampBottleExtendGUItrue":
                                    System.out.println("cylClampBottleExtendtrue");
                                    messageLabels.get("gripBottle").setText("Clamping Bottle");
                                    break;
                                case "cylClampBottleExtendGUIfalse":
                                    System.out.println("cylClampBottleExtendfalse");
                                    messageLabels.get("gripBottle").setText("Released Bottle");
                                    break;
                                case "valveInjectorOnOffGUItrue":
                                    System.out.println("valveInjectorOnOfftrue");
                                    messageLabels.get("valveInjector").setText("Injector Valve On");
                                    break;
                                case "valveInjectorOnOffGUIfalse":
                                    System.out.println("valveInjectorOnOfffalse");
                                    messageLabels.get("valveInjector").setText("Injector Valve Off");
                                    break;
                                case "valveInletOnOffGUItrue":
                                    System.out.println("valveInletOnOfftrue");
                                    messageLabels.get("valveInlet").setText("Inlet Valve On");
                                    break;
                                case "valveInletOnOffGUIfalse":
                                    System.out.println("valveInletOnOfffalse");
                                    messageLabels.get("valveInlet").setText("Inlet Valve Off");
                                    break;
                                case "dosUnitValveRetractGUItrue":
                                    System.out.println("dosUnitValveRetracttrue");
                                    messageLabels.get("movingCanister").setText("Raising Canister");
                                    break;
                                case "dosUnitValveRetractGUIfalse":
                                    System.out.println("dosUnitValveRetractfalse");
                                    // noop
                                    break;
                                case "dosUnitValveExtendGUItrue":
                                    System.out.println("dosUnitValveExtendtrue");
                                    messageLabels.get("movingCanister").setText("Lowering Canister");
                                    break;
                                case "dosUnitValveExtendGUIfalse":
                                    System.out.println("dosUnitValveExtendfalse");
                                    // noop
                                    break;
                                case "bottleAtPos1GUItrue":
                                    imageLabels.get("bottlePos1.png").setVisible(true);
                                    break;
                                case "bottleAtPos1GUIfalse":
                                    imageLabels.get("bottlePos1.png").setVisible(false);
                                    break;
                                case "bottleLeftPos5GUItrue":
                                    imageLabels.get("bottleLeaving.png").setVisible(true);
                                    break;
                                case "bottleLeftPos5GUIfalse":
                                    imageLabels.get("bottleLeaving.png").setVisible(false);
                                    break;
                                case "tableAlignedWithSensorGUItrue":
                                    imageLabels.get("tableAlign.png").setVisible(true);
                                    imageLabels.get("tableUnalign.png").setVisible(false);
                                    break;
                                case "tableAlignedWithSensorGUIfalse":
                                    imageLabels.get("tableUnalign.png").setVisible(true);
                                    imageLabels.get("tableAlign.png").setVisible(false);
                                    break;
                                case "bottleAtPos5GUItrue":
                                    imageLabels.get("bottlePos5.png").setVisible(true);
                                    break;
                                case "bottleAtPos5GUIfalse":
                                    imageLabels.get("bottlePos5.png").setVisible(false);
                                    break;
                                case "capOnBottleAtPos1GUItrue":
                                    imageLabels.get("capPos1.png").setVisible(true);
                                    break;
                                case "capOnBottleAtPos1GUIfalse":
                                    imageLabels.get("capPos1.png").setVisible(false);
                                    break;
                                case "bottleAtPos4GUItrue":
                                    imageLabels.get("bottlePos4.png").setVisible(true);
                                    break;
                                case "bottleAtPos4GUIfalse":
                                    imageLabels.get("bottlePos4.png").setVisible(false);
                                    break;
                                case "gripperZAxisLoweredGUItrue":
                                    imageLabels.get("fullyLowered.png").setVisible(true);
                                    break;
                                case "gripperZAxisLoweredGUIfalse":
                                    imageLabels.get("fullyLowered.png").setVisible(false);
                                    break;
                                case "gripperZAxisLiftedGUItrue":
                                    imageLabels.get("fullyRaised.png").setVisible(true);
                                    break;
                                case "gripperZAxisLiftedGUIfalse":
                                    imageLabels.get("fullyRaised.png").setVisible(false);
                                    break;
                                case "gripperTurnHomePosGUItrue":
                                    messageLabels.get("gripperTurn").setText("Gripper Init");
                                    break;
                                case "gripperTurnHomePosGUIfalse":
                                    messageLabels.get("gripperTurn").setText("");
                                    break;
                                case "gripperTurnFinalPosGUItrue":
                                    messageLabels.get("gripperTurn").setText("Gripper Final");
                                    break;
                                case "gripperTurnFinalPosGUIfalse":
                                    messageLabels.get("gripperTurn").setText("");
                                    break;
                                case "bottleAtPos2GUItrue":
                                    imageLabels.get("bottlePos2.png").setVisible(true);
                                    break;
                                case "bottleAtPos2GUIfalse":
                                    imageLabels.get("bottlePos2.png").setVisible(false);
                                    break;
                                case "dosUnitEvacGUItrue":
                                    imageLabels.get("canisterBottom.png").setVisible(true);
                                    break;
                                case "dosUnitEvacGUIfalse":
                                    imageLabels.get("canisterBottom.png").setVisible(false);
                                    break;
                                case "dosUnitFilledGUItrue":
                                    imageLabels.get("canisterTop.png").setVisible(true);
                                    break;
                                case "dosUnitFilledGUIfalse":
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