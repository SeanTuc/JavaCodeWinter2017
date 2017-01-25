/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17w3;

import java.time.LocalDate;

/**
 *
 * @author Sean
 */
public class employee {
    private String firstName, lastName;
    private int sin;
    private LocalDate dob;  
    public employee(String fn, String ln, int ssin, LocalDate date)
    {
        firstName = fn;
        lastName = ln;
        sin = ssin;
        dob = setBirthday(date);
    }
    /*
    
    */
    public String tostring ()
    {
        return firstName +" "+ lastName ;
    } //end of tostring
    
    /**
     * 
     * @param today
     * @ this method will validate that the employee is 15-90 years old and set the dob instance var 
     */
    
    public LocalDate setBirthday (LocalDate date)
    {
        LocalDate today = LocalDate.now();
        int age = 
        
        if ((dob.getDayOfYear()- today.getDayOfYear()) < 15)
            throw new IllegalArgumentException("Age does not fit criteria to work at this job");
           
        else if (dob.getDayOfYear() - today.getDayOfYear() > 90 )    
            throw new IllegalArgumentException("Age does not fit criteria to work at this job");
        else    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
