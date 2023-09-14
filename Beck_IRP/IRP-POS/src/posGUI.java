//  704 IRP POS GUI
//  Beck Busch
//  This is a GUI for the purchase ordering system
//  

// == Imports ==
import javax.net.ServerSocketFactory;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// == GUI Class ==
public class posGUI {
    Integer xGrid = 24;
    Integer yGrid = 32 + 8;
    Integer dimUnit = 20;
    ArrayList<String> Order;
    String[] LiquidList = { "Cola", "Tonic", "Soda", "Juice" };
    HashMap<String, Integer> PriceList = new HashMap<String, Integer>();
    HashMap<String, String> AccountList = new HashMap<String, String>();
    HashMap<String, Integer> UserOrder = new HashMap<String, Integer>();
    Integer UserQuantity;

    volatile static ObjectOutputStream sO;

    JFrame guiFrame;
    JPanel scrollItemsHolder, orderPanel, authPanel, submitPanel;
    JTextField usernameField, quantitySelectionField;
    JPasswordField passwordField;
    JComboBox<String> liquidSelectionCombo;
    JLabel priceLabel, remainingLabel;
    public static JTextArea responseArea;
    JSlider quantitySlider;

    stringSignalSender sender = new stringSignalSender(4007);

    // == Main Method ==
    public static void main(String[] args) throws IOException {
        ServerListener server = new ServerListener();
        server.start();
        posGUI POSGUI = new posGUI();
    }

    // == GUI Class Constructor ==
    public posGUI() {
        PriceList.put("Cola", 110);
        PriceList.put("Tonic", 70);
        PriceList.put("Soda", 50);
        PriceList.put("Juice", 90);

        AccountList.put("admin", "admin");
        AccountList.put("UOA", "ecse");
        AccountList.put("bottles", "plant");
        AccountList.put("system", "j");
        AccountList.put("group", "7");

        UserQuantity = 0;

        generateGUI();
    }

    // == GUI Generator ==
    public void generateGUI() {
        // ---- GUI JFrame ----
        guiFrame = new JFrame();
        guiFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        guiFrame.setLayout(null);
        guiFrame.setSize((int) (dimUnit * (xGrid + 0.7)), yGrid * (dimUnit + 1));

        // ---- Title Panel ----
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setBounds(0, 0, dimUnit * xGrid, dimUnit * 3);
        titlePanel.setBackground(Color.pink);
        JLabel titleLabel = new JLabel("Bottle Ordering System");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(dimUnit * 2, 0, dimUnit * (xGrid - 4), dimUnit * 3);
        titleLabel.setFont(new Font("Verdana", Font.PLAIN, 32));
        titlePanel.add(titleLabel);
        // JButton helpButton = new JButton(new ImageIcon("help.png"));
        // helpButton.setBounds(dimUnit*(xGrid-2), dimUnit, dimUnit, dimUnit);
        // helpButton.setActionCommand("help");
        // helpButton.addActionListener(new ButtonClickListener());
        // titlePanel.add(helpButton);

        // ---- Auth Panel ----
        authPanel = new JPanel();
        authPanel.setLayout(null);
        authPanel.setBounds(dimUnit * 2, dimUnit * 4, dimUnit * (xGrid - 4), dimUnit * 6);
        authPanel.setBackground(Color.cyan);
        // -- Auth Label --
        JLabel authLabel = new JLabel("User Authentication");
        authLabel.setHorizontalAlignment(JLabel.CENTER);
        authLabel.setFont(new Font("Verdana", Font.PLAIN, 32));
        authLabel.setBounds(0, 0, dimUnit * 16, dimUnit * 2);
        authPanel.add(authLabel);
        // -- Username Label --
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Verdana", Font.PLAIN, 21));
        usernameLabel.setBounds(0, dimUnit * 2, dimUnit * 6, dimUnit * 2);
        authPanel.add(usernameLabel);
        // -- Password Label --
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 21));
        passwordLabel.setBounds(0, dimUnit * 4, dimUnit * 6, dimUnit * 2);
        authPanel.add(passwordLabel);
        // -- Username Input --
        usernameField = new JTextField();
        usernameField.setBounds(dimUnit * 6, dimUnit * 2, dimUnit * 10, dimUnit * 2);
        authPanel.add(usernameField);
        // -- Password Input --
        passwordField = new JPasswordField();
        passwordField.setBounds(dimUnit * 6, dimUnit * 4, dimUnit * 10, dimUnit * 2);
        authPanel.add(passwordField);
        // -- Submit Button --
        JButton loginButton = new JButton("Login", null);
        loginButton.setFont(new Font("Verdana", Font.PLAIN, 17));
        loginButton.setBounds(dimUnit * 16, 0, dimUnit * 4, dimUnit * 6);
        loginButton.setActionCommand("login");
        loginButton.addActionListener(new ButtonClickListener());
        authPanel.add(loginButton);

        // ---- Ordering Panel ----
        orderPanel = new JPanel();
        orderPanel.setVisible(false);
        orderPanel.setLayout(null);
        orderPanel.setBounds(dimUnit * 1, dimUnit * 11, dimUnit * (xGrid - 2), dimUnit * 16);
        orderPanel.setBackground(Color.yellow);
        // -- Order Title
        JLabel orderTitle = new JLabel("Purchase Order");
        orderTitle.setHorizontalAlignment(JLabel.CENTER);
        orderTitle.setBounds(0, 0, dimUnit * (xGrid - 4), dimUnit * 2);
        orderTitle.setFont(new Font("Verdana", Font.PLAIN, 28));
        orderPanel.add(orderTitle);
        // -- New Label --
        JLabel newLabel = new JLabel("New Liquid:");
        newLabel.setHorizontalAlignment(JLabel.CENTER);
        newLabel.setBounds(dimUnit * 0, dimUnit * 3, dimUnit * 5, dimUnit * 2);
        newLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        orderPanel.add(newLabel);
        // -- Liquid Selector Combo --
        liquidSelectionCombo = new JComboBox<String>(LiquidList);
        liquidSelectionCombo.setBounds(dimUnit * 5, dimUnit * 3, dimUnit * 3, dimUnit * 2);
        orderPanel.add(liquidSelectionCombo);
        // -- Proportion Label --
        JLabel proportionLabel = new JLabel("Proportion:");
        proportionLabel.setHorizontalAlignment(JLabel.RIGHT);
        proportionLabel.setBounds(dimUnit * 9, dimUnit * 3, dimUnit * 7, dimUnit * 1);
        proportionLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        orderPanel.add(proportionLabel);
        // -- Proportion Label --
        remainingLabel = new JLabel("(100% Remaining)");
        remainingLabel.setHorizontalAlignment(JLabel.CENTER);
        remainingLabel.setBounds(dimUnit * 9, dimUnit * 4, dimUnit * 7, dimUnit * 1);
        remainingLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        orderPanel.add(remainingLabel);
        // -- Quantity Selector Field --
        quantitySelectionField = new JTextField();
        quantitySelectionField.setBounds(dimUnit * 16, dimUnit * 3, dimUnit * 2, dimUnit * 2);
        orderPanel.add(quantitySelectionField);
        // -- Add item button --
        JButton addItemButton = new JButton("Add", null);
        addItemButton.setFont(new Font("Verdana", Font.PLAIN, 12));
        addItemButton.setBounds(dimUnit * 19, dimUnit * 3, dimUnit * 3, dimUnit * 2);
        addItemButton.setActionCommand("add");
        addItemButton.addActionListener(new ButtonClickListener());
        orderPanel.add(addItemButton);

        // -- Items Scroll Panel
        scrollItemsHolder = new JPanel();
        scrollItemsHolder.setBackground(Color.green);
        scrollItemsHolder.setLayout(null);
        scrollItemsHolder.setPreferredSize(new Dimension(dimUnit * (xGrid - 5), dimUnit * 2));
        JScrollPane itemsScroll = new JScrollPane(scrollItemsHolder);
        itemsScroll.setBounds(dimUnit, dimUnit * 6, dimUnit * 20, dimUnit * 6);
        orderPanel.add(itemsScroll);

        // -- Quantity selection for real this time -- sits at 13y
        JLabel sliderLabel = new JLabel("Quantity:");
        sliderLabel.setHorizontalAlignment(JLabel.RIGHT);
        sliderLabel.setBounds(dimUnit * 0, dimUnit * 13, dimUnit * 4, dimUnit * 1);
        sliderLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        orderPanel.add(sliderLabel);
        quantitySlider = new JSlider(JSlider.HORIZONTAL, 0, 16, 0);
        quantitySlider.setBounds(dimUnit * 5, dimUnit * 13, dimUnit * 16, dimUnit * 2);
        quantitySlider.addChangeListener(new SliderChangeListener());
        quantitySlider.setMajorTickSpacing(4);
        quantitySlider.setMinorTickSpacing(1);
        quantitySlider.setPaintTicks(true);
        quantitySlider.setPaintLabels(true);
        orderPanel.add(quantitySlider);

        // ---- Submit Order Panel ----
        submitPanel = new JPanel();
        submitPanel.setLayout(null);
        submitPanel.setBounds(dimUnit * 2, dimUnit * 28, dimUnit * (xGrid - 4), dimUnit * 3);
        submitPanel.setBackground(Color.green);
        JLabel totalLabel = new JLabel("Total:");
        totalLabel.setHorizontalAlignment(JLabel.CENTER);
        totalLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
        totalLabel.setBounds(0, 0, dimUnit * 4, dimUnit * 3);
        submitPanel.add(totalLabel);
        priceLabel = new JLabel("");
        priceLabel.setHorizontalAlignment(JLabel.CENTER);
        priceLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
        priceLabel.setBounds(dimUnit * 4, 0, dimUnit * 5, dimUnit * 3);
        submitPanel.add(priceLabel);
        JButton submitButton = new JButton("Submit", null);
        submitButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        submitButton.setBounds(dimUnit * 10, 0, dimUnit * 5, dimUnit * 3);
        submitButton.setActionCommand("submit");
        submitButton.addActionListener(new ButtonClickListener());
        submitPanel.add(submitButton);
        JButton resetButton = new JButton("Reset", null);
        resetButton.setFont(new Font("Verdana", Font.PLAIN, 14));
        resetButton.setBounds(dimUnit * 16, 0, dimUnit * 4, dimUnit * 3);
        resetButton.setActionCommand("reset");
        resetButton.addActionListener(new ButtonClickListener());
        submitPanel.add(resetButton);

        // ---- Response Panel ----
        JPanel responsePanel = new JPanel();
        responsePanel.setLayout(null);
        responsePanel.setBounds(dimUnit * 1, dimUnit * (yGrid - 8), dimUnit * (xGrid - 2), dimUnit * 8);
        responsePanel.setBackground(Color.gray);
        // -- Response Header --
        JLabel responseLabel = new JLabel("System Response:");
        // responseLabel.setHorizontalAlignment(JLabel.CENTER);
        responseLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
        responseLabel.setBounds(0, 0, dimUnit * (xGrid - 2), dimUnit * 2);
        responsePanel.add(responseLabel);
        // -- Response Content --
        responseArea = new JTextArea("no responce received");
        responseArea.setEditable(false);
        responseArea.setBounds((int) (dimUnit * 0.5), (int) (dimUnit * 2), dimUnit * (xGrid - 3),
                (int) (dimUnit * 5.5));
        responseArea.setBackground(Color.gray);
        responsePanel.add(responseArea);

        // ---- Final Steps ----
        guiFrame.add(titlePanel);
        guiFrame.add(authPanel);
        guiFrame.add(orderPanel);
        guiFrame.add(submitPanel);
        guiFrame.add(responsePanel);
        guiFrame.setVisible(true);

        // Testing stuff
        // char[] testing = { '7' };
        // authUser("group", testing);
        // UserOrder.put("Cola", 50);
        // UserOrder.put("Tonic", 30);
        // UserOrder.put("Soda", 15);
        // UserOrder.put("Juice", 5);
        // updateOrderPanel();
    }

    // ---- Add Item Method ----
    private void updateOrderPanel() {

        // Clear Items Panel
        scrollItemsHolder.removeAll();
        scrollItemsHolder.setPreferredSize(new Dimension(dimUnit * (xGrid - 5), dimUnit * 6));

        // -- Temp Panel --
        JPanel tempPanel = new JPanel();
        tempPanel.setBounds(0, 0, dimUnit * (xGrid - 4), dimUnit * 6); // (int)(dimUnit * 1.5) * UserOrder.size());
        tempPanel.setLayout(null);

        Integer i = 0;
        Integer totalPrice = 0;
        Integer totalUsed = 0;

        for (Map.Entry<String, Integer> itemPair : UserOrder.entrySet()) {

            // -- Temp Name Label --
            JLabel tempName = new JLabel("Liquid " + Integer.toString(i + 1) + ": " + itemPair.getKey());
            tempName.setHorizontalAlignment(JLabel.CENTER);
            tempName.setFont(new Font("Verdana", Font.PLAIN, 12));
            tempName.setBounds(0, (int) (dimUnit * 1.5) * i, dimUnit * 6, (int) (dimUnit * 1.5));
            tempPanel.add(tempName);
            // -- Temp Quantity Label --
            JLabel tempQuantity = new JLabel("Proportion: " + Integer.toString(itemPair.getValue()) + "%");
            tempQuantity.setHorizontalAlignment(JLabel.CENTER);
            tempQuantity.setFont(new Font("Verdana", Font.PLAIN, 12));
            tempQuantity.setBounds(dimUnit * 7, (int) (dimUnit * 1.5) * i, dimUnit * 6, (int) (dimUnit * 1.5));
            tempPanel.add(tempQuantity);
            totalUsed += itemPair.getValue();
            // -- Temp Price Label --
            JLabel tempPrice = new JLabel(
                    "Price: $"
                            + Integer.toString((int) (PriceList.get(itemPair.getKey()) * itemPair.getValue() * 0.01)));
            tempPrice.setHorizontalAlignment(JLabel.CENTER);
            tempPrice.setFont(new Font("Verdana", Font.PLAIN, 12));
            tempPrice.setBounds(dimUnit * 13, (int) (dimUnit * 1.5) * i, dimUnit * 6, (int) (dimUnit * 1.5));
            tempPanel.add(tempPrice);

            totalPrice += (int) (PriceList.get(itemPair.getKey()) * itemPair.getValue() * 0.01);

            i += 1;
        }

        // Add temp panel to items holder
        scrollItemsHolder.add(tempPanel);

        remainingLabel.setText("(" + Integer.toString(100 - totalUsed) + "% Remaining)");

        priceLabel.setText("$" + Integer.toString(totalPrice * UserQuantity));

        SwingUtilities.updateComponentTreeUI(guiFrame);
    }

    private void authUser(String name, char[] pass) {
        String password = String.valueOf(pass);

        if (AccountList.get(name) == null) {
            responseArea.insert("Invalid Username." + "\n", 0);
            return;
        } else if (AccountList.get(name).equals(password)) {
            responseArea.insert("Login Successful." + "\n", 0);

            orderPanel.setVisible(true);

            for (Component i : authPanel.getComponents()) {
                i.setEnabled(false);
            }

            SwingUtilities.updateComponentTreeUI(guiFrame);
        } else {
            responseArea.insert("Incorrect Password." + "\n", 0);
            return;
        }
    }

    private void submitOrder() {
        String[] items = new String[] { "Cola", "Tonic", "Soda", "Juice" };
        String[] outputArray = new String[items.length + 1];

        outputArray[0] = Integer.toString(UserQuantity);

        int i = 1;

        for (String string : items) {
            if (UserOrder.get(string) != null) {
                outputArray[i] = Integer.toString(UserOrder.get(string));
            } else {
                outputArray[i] = Integer.toString(0);
            }

            i += 1;
        }

        for (Component componentI : orderPanel.getComponents()) {
        componentI.setEnabled(false);
        }
        for (Component componentI : submitPanel.getComponents()) {
        componentI.setEnabled(false);
        }

        SwingUtilities.updateComponentTreeUI(guiFrame);

        System.out.println(Arrays.toString(outputArray)); // PRINTER

        sender.setOutgoingString(String.join(",", outputArray));
        sender.start();

    }

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

    private class SliderChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            // JSlider source = (JSlider)e.getSource();

            if (!quantitySlider.getValueIsAdjusting()) {

                int tempQuantity = (int) quantitySlider.getValue();
                UserQuantity = tempQuantity;
                // SwingUtilities.updateComponentTreeUI(submitPanel);
                updateOrderPanel();
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("login")) {
                System.out.println("LOGIN pressed");
                // System.out.println(usernameField.getText()); // PRINT
                // System.out.println(passwordField.getPassword()); // PRINT

                authUser(usernameField.getText(), passwordField.getPassword());

            } else if (command.equals("add")) {
                System.out.println("ADD pressed"); // PRINTER
                String additionalItem = liquidSelectionCombo.getSelectedItem().toString();
                Integer additionalQuantity;

                try {
                    additionalQuantity = Integer.parseInt(quantitySelectionField.getText());
                } catch (NumberFormatException exc) {
                    responseArea.insert("Please enter a proportion using only numerical values." + "\n", 0);
                    return;
                }

                System.out.println("Added " + additionalItem + " quantity " + Integer.toString(additionalQuantity)); // PRINTER

                UserOrder.put(additionalItem, additionalQuantity);

                updateOrderPanel();

            } else if (command.equals("submit")) {
                System.out.println("SUBMIT pressed"); // PRINTER

                Integer totalProportions = 0;

                for (Map.Entry<String, Integer> itemPair : UserOrder.entrySet()) {
                    totalProportions += itemPair.getValue();
                }

                if (totalProportions != 100) {
                    responseArea.insert("Proportions must add to 100%" + "\n", 0);
                    return;

                } else if (UserQuantity == 0) {
                    responseArea.insert("Order Quantity must be more than 0" + "\n", 0);
                    return;

                } else {
                    submitOrder();
                }

            } else if (command.equals("reset")) {
                System.out.println("RESET pressed"); // PRINTER

                UserOrder.clear();

                updateOrderPanel();
            }
        }
    }

    static class ServerListener extends Thread {

        private ServerSocket serverSocket;

        ServerListener() throws IOException {
            serverSocket = ServerSocketFactory.getDefault().createServerSocket(4011);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    final Socket socketToClient = serverSocket.accept();
                    System.out.println("check"); // PRINTER
                    ClientHandler clientHandler = new ClientHandler(socketToClient);
                    clientHandler.start();
                } catch (IOException e) {
                    System.out.println("failure in ssocket server"); // PRINTER
                    e.printStackTrace();
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
            String line;
            String inputMessage;
            while (true) {
                try {
                    while ((line = br.readLine()) != null) {
                        Pattern pattern = Pattern.compile("(?:\\\"value\\\":\\\")(.*?)(?:\\\"{1})",
                                Pattern.CASE_INSENSITIVE);
                        Matcher matcher = pattern.matcher(line);
                        System.out.println(line); // PRINTER
                        if (matcher.find()) {
                            inputMessage = matcher.group(1);
                            responseArea.insert(inputMessage + "\n", 0);
                        }
                    }

                } catch (IOException e) {
                    System.out.println("faileru in buffer"); // PRINTER
                    e.printStackTrace();

                }
            }

        }
    }

}
