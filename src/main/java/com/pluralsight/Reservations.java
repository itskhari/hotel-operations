package com.pluralsight;

public class Reservations {
    private String roomType;
    private double price;
    private int nights;
    private boolean weekend;

    public Reservations(String roomType, int nights, boolean weekend) {
        this.roomType = roomType;
        this.nights = nights;
        this.weekend = weekend;

        setPrice();
    }
    private void setPrice() {
        if (roomType.equals("King")) {
            price = 139.00;
        } else if (roomType.equals("Double")) {
            price = 124.00;
        }
        if (weekend) {
            price = price * 1.10;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getResTotal() {
        return price * nights;
    }
}


