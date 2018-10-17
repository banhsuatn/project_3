package com.vhviet.demo.model;

public class Item {
    public static final int TYPE_BUTTON = 1;
    public static final int TYPE_LABEL = 2;
    public static final int TYPE_TEXTFIELD = 3;

    private int id;
    private String name;
    private String text;
    private int x;
    private int y;
    private int w;
    private int h;
    private int idType;
    private int idWindows;
    private int idScreenDevice;
    private int idFunction = -1;

    public Item() {
    }

    public Item(int id, String name, String text, int x, int y,
                int w, int h, int idType, int idWindows, int idScreenDevice, int idFunction) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.idType = idType;
        this.idWindows = idWindows;
        this.idScreenDevice = idScreenDevice;
        this.idFunction = idFunction;
    }

    public int getIdFunction() {
        return idFunction;
    }

    public void setIdFunction(int idFunction) {
        this.idFunction = idFunction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdWindows() {
        return idWindows;
    }

    public void setIdWindows(int idWindows) {
        this.idWindows = idWindows;
    }

    public int getIdScreenDevice() {
        return idScreenDevice;
    }

    public void setIdScreenDevice(int idScreenDevice) {
        this.idScreenDevice = idScreenDevice;
    }
}
