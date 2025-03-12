package org.example.model;

import org.example.model.enums.LampType;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wal4;
    private Ceiling ceiling;
    private Bed bed;
    private LampType lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Carpet carpet, LampType lamp, Wardrobe wardrobe, Bed bed, Ceiling ceiling, Wall wal4, Wall wall3, String name, Wall wall1, Wall wall2) {
        this.carpet = carpet;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wal4 = wal4;
        this.wall3 = wall3;
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public LampType getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWal4() {
        return wal4;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall1() {
        return wall1;
    }

    public String getName() {
        return name;
    }
}
