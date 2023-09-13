import javax.net.ServerSocketFactory;
import javax.swing.*;
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
import java.util.HashMap;
import java.util.Map;

public class ABSGUI {
    HashMap<String, signalSender> signalSenders;
    String[] signalNames = { "bottleAtPos1", "bottleLeftPos5", "tableAlignedWithSensor",
            "bottleAtPos5", "capOnBottleAtPos1", "bottleAtPos4",
            "gripperZAxisLowered", "gripperZAxisLifted", "gripperTurnHomePos",
            "gripperTurnFinalPos", "bottleAtPos2", "dosUnitEvac", "dosUnitFilled" };

    public static JFrame windowFrame;

    public static void main(String[] args) {
        ABSGUI daGUI = new ABSGUI();

    }

    public ABSGUI() {
        signalSenders = new HashMap<String, signalSender>();
        int start = 4018;

        for (String name : signalNames) {
            signalSender tempSender = new signalSender(start);

            signalSenders.put(name, tempSender);
            start += 1;
        }

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

        for (String name : signalNames) {
            JToggleButton tempButton = new JToggleButton(name);
            tempButton.setFont(new Font("Verdana", Font.PLAIN, 12));
            tempButton.setBounds(xPos, yPos, 180, 45);
            tempButton.setActionCommand(name);
            tempButton.addActionListener(new ButtonClickListener());

            buttonPanel.add(tempButton);

            xPos += 185;
            if (xPos > 1200) {
                xPos = 5;
                yPos += 50;
            }
        }
        windowFrame.add(buttonPanel);

        windowFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = e.getSource();
            String buttonName = sourceButton.getText();
            signalSender sendMe

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
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        BufferedReader br;

        ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }

        @Override
        public void run() {
            String line, inputName, inputStatus, switcher;
            Pattern statusPattern = Pattern.compile("(?:\\\"value\\\":\\\")(.*?)(?:\\\"{1})",
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

                            switcher = inputName + inputName;

                            switch (switcher) {
                                case "motConveyorOnOfftrue":
                                    // noop
                                    break;
                                case "motConveyorOnOfffalse":
                                    // noop
                                    break;
                                case "rotaryTableTriggertrue":
                                    // noop
                                    break;
                                case "rotaryTableTriggerfalse":
                                    // noop
                                    break;
                                case "cylPos5ZaxisExtendtrue":
                                    // noop
                                    break;
                                case "cylPos5ZaxisExtendfalse":
                                    // noop
                                    break;
                                case "gripperTurnRetracttrue":
                                    // noop
                                    break;
                                case "gripperTurnRetractfalse":
                                    // noop
                                    break;
                                case "gripperTurnExtendtrue":
                                    // noop
                                    break;
                                case "gripperTurnExtendfalse":
                                    // noop
                                    break;
                                case "capGripperPos5Extendtrue":
                                    // noop
                                    break;
                                case "capGripperPos5Extendfalse":
                                    // noop
                                    break;
                                case "cylClampBottleExtendtrue":
                                    // noop
                                    break;
                                case "cylClampBottleExtendfalse":
                                    // noop
                                    break;
                                case "valveInjectorOnOfftrue":
                                    // noop
                                    break;
                                case "valveInjectorOnOfffalse":
                                    // noop
                                    break;
                                case "valveInletOnOfftrue":
                                    // noop
                                    break;
                                case "valveInletOnOfffalse":
                                    // noop
                                    break;
                                case "dosUnitValveRetracttrue":
                                    // noop
                                    break;
                                case "dosUnitValveRetractfalse":
                                    // noop
                                    break;
                                case "dosUnitValveExtendtrue":
                                    // noop
                                    break;
                                case "dosUnitValveExtendfalse":
                                    // noop
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    class signalSender extends Thread {
        ObjectOutputStream outputStream;

        signalSender(int port) {
            try {
                outputStream = new ObjectOutputStream(new Socket("127.0.0.1", port).getOutputStream());
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
        

        @Override
        public void run() {
            try {
                outputStream.writeObject(new Object[] { true });
                Thread.sleep(100);
                outputStream.writeObject(new Object[] { false });
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