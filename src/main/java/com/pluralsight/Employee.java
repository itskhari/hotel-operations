package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeID, startTime;
    private String name, department;
    private double payRate, hoursWorked;
    private boolean isClockedIn;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {

        return employeeID;
    }

    public String getName() {

        return name;
    }

    public String getDepartment() {

        return department;
    }

    public double getPayRate() {

        return payRate;
    }

    public double getHoursWorked() {

        return hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    public double getRegularHours() {

        return Math.min(hoursWorked, 40);
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }
    public void punchIn(int time) {
        if (!isClockedIn) {
            startTime = time;
            isClockedIn = true;
        }
    }
    public void punchOut(int time) {
        if (isClockedIn) {
            int hours = time - startTime;
            hoursWorked += hours;
            isClockedIn = false;
        }
    }
    public void punchIn() {
        if (!isClockedIn) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            startTime = hour;
            isClockedIn = true;
        }
    }

    public void punchOut() {
        if (isClockedIn) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int hours = hour - startTime;
            hoursWorked += hours;
            isClockedIn = false;
        }
    }
}
