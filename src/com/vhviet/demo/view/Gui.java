package com.vhviet.demo.view;

import com.vhviet.demo.model.Function;
import com.vhviet.demo.model.Item;
import com.vhviet.demo.model.ScreenWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.util.ArrayList;

public class Gui extends JFrame {

    private JPanel jPanel;
    private ScreenWindow screenWindow;

    public Gui(int w, int h, ArrayList<Item> items, ScreenWindow screenWindow){
        this.screenWindow = screenWindow;
        initGui(w,h);
        initComponents(items);
    }

    private void initGui(int w, int h){
        setLayout(new CardLayout());
        setSize(w,h);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents(ArrayList<Item> items){
        jPanel = new JPanel();
        jPanel.setLayout(null);
        add(jPanel);
        for (Item item: items){
            switch (item.getIdType()){
                case Item.TYPE_BUTTON:
                    JButton jButton = new JButton(item.getText());
                    jButton.setBounds(item.getX()*screenWindow.getScaleW(),item.getY()*screenWindow.getScaleH(),
                            item.getW()*screenWindow.getScaleW(),item.getH()*screenWindow.getScaleH());
                    jButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                new Statement(new Function(),"login",
                                        new Object[]{"vhviet",123123}).execute();
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                        }
                    });
                    jPanel.add(jButton);
                    break;
                case Item.TYPE_LABEL:
                    JLabel jLabel = new JLabel(item.getText());
                    jLabel.setBounds(item.getX()*screenWindow.getScaleW(),item.getY()*screenWindow.getScaleH(),
                            item.getW()*screenWindow.getScaleW(),item.getH()*screenWindow.getScaleH());
                    jPanel.add(jLabel);
                    break;
                case Item.TYPE_TEXTFIELD:
                    JTextField jTextField = new JTextField(item.getText());
                    jTextField.setBounds(item.getX()*screenWindow.getScaleW(),item.getY()*screenWindow.getScaleH(),
                            item.getW()*screenWindow.getScaleW(),item.getH()*screenWindow.getScaleH());
                    jPanel.add(jTextField);
                    break;
                default:
                    break;
            }
        }
    }
}
