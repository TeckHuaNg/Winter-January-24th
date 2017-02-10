/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wjan24;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Michael
 */
public class WJan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyEmployee tex = new HourlyEmployee("John", "Rex", "200342584", LocalDate.of(1999,Month.MAY, 15), 27.33);
        
        System.out.println("The Employee is: " + tex.toString());
        System.out.printf("%n%s was born on a %s", tex.getFname(), tex.getDateOfBirth().getDayOfWeek());
        
        System.out.printf("%s has an employee number of %d%n",tex,tex.getEmployeeNum() );
        
        tex.addHoursWorked(8);
        tex.addHoursWorked(14);
        
        System.out.printf("The first pay cheque is: %s",tex.getPayCheque().toString());
        
        CommissionEmployee emp2 = new CommissionEmployee("Frank", "Sinatra","2233", LocalDate.of(1998, Month.MARCH,3),5);
        emp2.recordSales(23445);
        emp2.recordSales(23333);
        
        BasePlusCommissionEmployee emp3 = new BasePlusCommissionEmployee("Arita", "Job", "12345",
                                                  LocalDate.of(1997, Month.MARCH, 25),13, 2000);
        emp3.recordSales(23445);
        emp3.recordSales(2223);
        System.out.printf("%nThe next paycheque is: %s%n", emp3.getPayCheque().toString());
       // Employee employee2 = new Employee("Fred", "Flintstone","2002348999", LocalDate.of(1980, Month.MARCH, 31));
        //System.out.printf("%s has an employee number of %d%n",employee2,employee2.getEmployeeNum() );
    }
    
}
