/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17w3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Sean
 */
public class Employee {
    private String firstName, lastName;
    private int sin;
    private LocalDate dob;  
    public Employee(String fn, String ln, int ssin, LocalDate date)
    {
        firstName = fn;
        lastName = ln;
        sin = ssin;
        setBirthday(date);
    }
    /*
    
    */
    public String tostring ()
    {
        return firstName +"  "+ lastName ;
    } //end of tostring
    
    /**
     * 
     * @param today
     * @ this method will validate that the employee is 15-90 years old and set the dob instance var 
     */
    
    public void setBirthday (LocalDate date)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(date, today).getYears();
        
        if ( age < 15)
            throw new IllegalArgumentException("Age does not fit criteria to work at this job: you are to young");
           
        else if (age > 90 )    
            throw new IllegalArgumentException("Age does not fit criteria to work at this job: you are too old");
        else
            this.dob = date;
    }

/*
    Getters are below  right click insert code select getter then all
    */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSin() {
        return sin;
    }

    public LocalDate getDob() {
        return dob;
    }
    
}
