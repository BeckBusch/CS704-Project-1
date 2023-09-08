import systemGUIs.posGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ABSGUI {
    JFrame windowFrame;

    public static void main(String[] args) {
        ABSGUI mainWindow = new ABSGUI();
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
