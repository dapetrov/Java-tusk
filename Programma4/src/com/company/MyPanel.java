package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    JTextField field;
    ArrayList<Rabotnik> list;
    JTextField textField = new JTextField(10);

    JList jlist;
    JButton addPeopleMon;
    JButton addPeopleWat;
    JButton raschetPO;
    public MyPanel(){
        DefaultListModel listModel = new DefaultListModel();
        jlist = new JList(listModel);
        list = new ArrayList<>();
        addPeopleMon = new JButton("addMon");
        field = new JTextField("                 ");
        field.requestFocus(true);
        addPeopleMon.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String a =field.getText().trim();
                 list.add(new RabotnikMonth(a));
                 listModel.addElement(a);
                 field.setText("");
                 field.requestFocus(true);
             }
        });
        addPeopleWat = new JButton("addWat");
        addPeopleWat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a =field.getText().trim();
                list.add(new RabotnikWatch(a));
                listModel.addElement(a);
                field.setText("");
                field.requestFocus(true);
            }
        });
        jlist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                int index = jlist.locationToIndex(event.getPoint());
                String result = JOptionPane.showInputDialog( list.get(index).diol(), "");
                int x = Integer.parseInt(result);
                textField.setText(String.valueOf(list.get(index).raschet(x)));
            }
        });
        raschetPO = new JButton("Расчёт по отделу");
        raschetPO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int summa=0;
                for(int i =0;i<list.size();i++){
                    summa+=list.get(i).zarab();
                }
                textField.setText(String.valueOf(summa));
            }
        });
        add(field);
        add(addPeopleMon);
        add(addPeopleWat);
        add(new JScrollPane(jlist));
        add(textField);
        add(raschetPO);
    }
}
