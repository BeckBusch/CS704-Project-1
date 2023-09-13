import systemGUIs.posGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ABSGUI {
    JFrame windowFrame;

    public static void main(String[] args) {
        intSignalSender send1 = new intSignalSender(4007);
        send1.setOutgoingInt(5);
        send1.start();

        while (send1.isAlive()) {
        }

        System.out.println("done");
        // ABSGUI mainWindow = new ABSGUI();
    }

    public ABSGUI() {
        posGUI purchaseOrderGui = new posGUI();
        ConveyorVisual converyorGUI = new ConveyorVisual();

        windowFrame = new JFrame();
        windowFrame.setLayout(null);
        windowFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        windowFrame.setSize(new Dimension(1920, 1080));
        purchaseOrderGui.guiFrame.setBounds(0, 0, 480, 800);
        purchaseOrderGui.guiFrame.setBorder(BorderFactory.createLineBorder(Color.black));
        windowFrame.add(purchaseOrderGui.guiFrame);
        converyorGUI.f.setBounds(480, 0, 1000, 1000);
        windowFrame.add(converyorGUI.f);

        windowFrame.setVisible(true);
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

// Sender Usage Example
//    signalSender send1 = new signalSender(4007);
//    send1.start();

//    stringSignalSender send2 = new stringSignalSender(4008);
//    send2.setOutgoingString("apple");
//    send2.start();

//    intSignalSender send3 = new intSignalSender(4009);
//    send3.setOutgoingInt(5);
//    send3.start();