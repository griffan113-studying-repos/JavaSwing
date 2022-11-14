package com.javaswing;

import javax.swing.*;

public class Dialog extends JFrame {
    private JPanel contentPane;
    private JButton showMsgBtn;
    private JLabel msgLabel;

    public Dialog() {
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Dialog");

        showMsgBtn.addActionListener(e -> {
            onClick();
        });
    }

    public void onClick() {
        msgLabel.setText("Olá, mundo!");
    }
}
