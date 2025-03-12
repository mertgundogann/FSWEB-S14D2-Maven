package org.example.model;

import org.example.model.enums.PaintColor;



public class Carpet {
    private int width;
    private PaintColor color;
    private int height;


    public Carpet(int width, PaintColor color, int height) {
        this.width = width;
        this.color = color;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
