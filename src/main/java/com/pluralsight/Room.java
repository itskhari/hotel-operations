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
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void checkIn() {
        occupied = true;
        dirty = true;
    }
    public void checkOut() {
        occupied = false;
        dirty = true;
    }
    public void cleanRoom() {
        dirty = false;
    }


}
