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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseMonthlySalary;
    public BasePlusCommissionEmployee(String first, String last, String sin, LocalDate dob, double comRate, double base){
        super(first, last, sin, dob, comRate);
        
        setBaseSalary(base);
}
    
/**
 * This method will validate that the base is greater than 0 and set the baseMonthlySalary
 * @param baseSalary 
 */    
public void setBaseSalary(double base){
    if(base > 0 )
        baseMonthlySalary = base;
    else
        throw new IllegalArgumentException("Base monthly salary must be greater than 0");
}   


/**
 * This method will calculate the monthly pay and return a new PayCheque object
 * @return 
 */
public PayCheque getPayCheque(){
    double payment = super.getCommissionAmount() + baseMonthlySalary;
    
    PayCheque newPay = new PayCheque(super.toString(), payment);
    
    super.resetMonthlySales();
    
    return newPay;
}
}//end of class
