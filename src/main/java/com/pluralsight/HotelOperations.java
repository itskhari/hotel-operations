package com.pluralsight;

import java.util.Scanner;

public class HotelOperations {
    public static void main(String[] args) {
        Employee e = new Employee(1, "John", "Front Desk", 20.00, 37);

        e.punchIn(9);   // 9 AM
        e.punchOut(17); // 5 PM

        System.out.println("Hours worked: " + e.getHoursWorked()); // 8
        System.out.println("Regular hours: " + e.getRegularHours()); // 8
        System.out.println("Overtime hours: " + e.getOvertimeHours()); // 0
    }
}
