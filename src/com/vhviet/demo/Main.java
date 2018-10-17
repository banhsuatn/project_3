package com.vhviet.demo;

import com.vhviet.demo.model.Item;
import com.vhviet.demo.model.ScreenWindow;
import com.vhviet.demo.view.Gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1,"button","submit",0,0,3,1,Item.TYPE_BUTTON,1,1,1));
        items.add(new Item(2,"txt","Label",4,0,3,1,Item.TYPE_LABEL,1,1,1));
        items.add(new Item(3,"tf","textfield",8,0,3,1,Item.TYPE_TEXTFIELD,1,1,1));
        items.add(new Item(4,"button","label2",12,0,3,1,Item.TYPE_LABEL,1,1,1));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Gui gui = new Gui(0,0,items,new ScreenWindow(80,25));
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gui.setUndecorated(true);
        gui.setVisible(true);
    }
}
