/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wjan24;

import java.time.LocalDate;

/**
 *
 * @author Michael
 */
public class HourlyEmployee extends Employee{

    private double minimumWage = 11.45;
    private double payRate;
    private int hoursWorked;
    
    public HourlyEmployee(String first, String last, String sin, LocalDate dob, double payRate){
        super(first, last, sin ,dob); //calls the constructor of the parent class
        setPayRate(payRate);
    }
    
    public void setPayRate(double payRate){
        if(payRate >= minimumWage)
            this.payRate = payRate;
        else
            throw new IllegalArgumentException("You cheap-o, minimum wage is $11.45");
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    
    /**
     * This will add hours worked for an employee
     * @param hoursWorked 
     */
    public void addHoursWorked(float hoursWorked){
        if (hoursWorked >= 0 && hoursWorked <= 14)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("Hours worked must be 0-14 for 1 day");
    }
    
    
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * payRate;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount);
        
        hoursWorked = 0;
        return newPayCheque;
    }
    
}
