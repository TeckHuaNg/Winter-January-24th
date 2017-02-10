/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wjan24;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Michael
 */
public abstract class Employee {
    private String fname, lname, sin;
    private LocalDate dateOfBirth;
    private int employeeNum;
    private static int nextEmployeeNum = 10001;

    public Employee(String first, String last, String sin, LocalDate dob){
    
        fname = first;
        lname = last;
        this.sin = sin;
        setBirthday(dob);
        employeeNum = nextEmployeeNum;
        
        nextEmployeeNum++; //Increment so the next employee has a different number
}

    public int getEmployeeNum() {
        return employeeNum;
    }
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getSin() {
        return sin;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
/**
 * This method will return the employee's first and last name
 * @return 
 */    
public String toString(){
    return fname +" "+lname;
}    

/**
 * This method will validate the new Employee is 15-90 years old
 * @param birthday 
 */    
public void setBirthday(LocalDate birthday){
    LocalDate today = LocalDate.now();
    int age = Period.between(birthday, today).getYears();
    
    if(age>=15 && age<=90)
        dateOfBirth = birthday;
    else 
        throw new IllegalArgumentException("Employees must be 15-90 years old");
    
}    

public abstract PayCheque getPayCheque();



}
