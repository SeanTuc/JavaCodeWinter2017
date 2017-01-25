/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17w3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Sean
 */
public class w17w3_2 {

public static void main (String[] args)
{
    Employee employee1 = new Employee("Fred","Flintstone ", 1234, LocalDate.of(1998, Month.MARCH, 14));
    System.out.printf ("employee1 is %s%n",employee1);
    System.out.printf("The employee was born %s, that was a %s%n", employee1.getDob(), employee1.getDob().getDayOfWeek());

    Employee employee2 = new Employee("Fred","Flintstone", 1234, LocalDate.of(1992, Month.AUGUST, 21));
    System.out.printf ("employee2 is %s%n",employee2);
    System.out.printf("The employee was born %s, that was a %s%n", employee2.getDob(), employee2.getDob().getDayOfWeek());

}


    
}
