package com.vhviet.demo.model;

import java.awt.*;

public class ScreenWindow {
    //80 - 25
    private int scaleW;
    private int scaleH;

    public ScreenWindow(int w, int h) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.scaleW = screenSize.width / w;
        this.scaleH = screenSize.height / h;
    }

    public int getScaleW() {
        return scaleW;
    }

    public int getScaleH() {
        return scaleH;
    }
}
