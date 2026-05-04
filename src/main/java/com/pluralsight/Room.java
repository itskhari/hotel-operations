package com.pluralsight;

public class Room {
    private int bedNum;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int bedNum, double price, boolean occupied, boolean dirty, boolean available) {
        this.bedNum = bedNum;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getBedNum() {
        return bedNum;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}
