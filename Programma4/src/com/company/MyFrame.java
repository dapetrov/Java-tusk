package com.company;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame(MyPanel panel){
        panel.setBackground(Color.WHITE);
        this.panel = panel;
        add(panel);
        setBounds(500,500,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
