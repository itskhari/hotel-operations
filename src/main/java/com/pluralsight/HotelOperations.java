package com.pluralsight;

import java.util.Scanner;

public class HotelOperations {
    public static void main(String[] args) {
        Employee e = new Employee(1, "John", "Front Desk", 20, 0);

        e.punchIn();
        e.punchOut(20);

        System.out.println("Hours worked: " + e.getHoursWorked());
    }
}
