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
public class CommissionEmployee extends Employee{

    private double commissionRate, monthlySales;
    
    public CommissionEmployee(String first, String last, String sin, LocalDate dob, double comRate){
        super(first, last, sin, dob);
        
        monthlySales = 0;
        setCommissionRate(comRate);
    }
    
    /**
     * This method will return the commission amount earned
     */
    public double getCommissionAmount(){
        return commissionRate / 100 * monthlySales;
    }
    
    /**
     * This validate the commission rate is between 0-100%
     * @return 
     */
    public void setCommissionRate(double comRate){
        if(comRate > 0 && comRate < 100)
            commissionRate = comRate;
        else
            throw new IllegalArgumentException("The commission must be 0-99");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getMonthlySales() {
        return monthlySales;
    }
    
    public void recordSales(double salesAmount){
        if(salesAmount >= 0)
            this.monthlySales = salesAmount;
        else
            throw new IllegalArgumentException("Sales amount must be greater than 0");
    }
    
    protected void resetMonthlySales(){
        monthlySales = 0;
    }
    @Override
    public PayCheque getPayCheque() {
        
        double amount = getCommissionAmount();
        
        PayCheque newPayCheque = new PayCheque(super.toString(), amount);
        
        monthlySales = 0;
        
        return newPayCheque;
        
    }
    
}
