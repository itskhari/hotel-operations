package com.pluralsight;

import java.util.Scanner;

public class HotelOperations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n Employee Payroll Entry");

        System.out.print("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Hourly Pay: ");
        double payRate = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = sc.nextDouble();
        sc.nextLine();

        Employee worker = new Employee(employeeID, name, department, payRate, hoursWorked);

        System.out.println("\n Payroll Summary");
        System.out.println("Employee: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Pay Rate: $" + worker.getPayRate());
        System.out.println("Hours Worked: " + worker.getHoursWorked());
        System.out.println("Regular Hours: " + worker.getRegularHours());
        System.out.println("Overtime Hours: " + worker.getOvertimeHours());
        System.out.println("Total Pay: $" + String.format("%.2f", worker.getTotalPay()));

        System.out.println("\n Create A Reservation");

        System.out.print("Enter Your Room Type (King/Double): ");
        String roomType = sc.nextLine().trim();

        System.out.print("Enter the Number of Nights you'd like to stay: ");
        int nights = sc.nextInt();
        sc.nextLine();

        System.out.print("Is the a weekend stay? (true/false): ");
        boolean weekend = sc.nextBoolean();

        Reservations res = new Reservations(roomType, nights, weekend);

        System.out.println("\n Reservation Summary:");
        System.out.println("Room Type: " + res.getRoomType());
        System.out.println("Price Per Night: $" + res.getPrice());
        System.out.println("Weekend Stay: " + res.isWeekend());
        System.out.println("Total Cost: $" + res.getResTotal());


    }
}
