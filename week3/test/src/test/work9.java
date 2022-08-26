/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.*;
/**
 *
 * @author User
 */
public class work9 {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salary = tube.nextDouble();
        if (salary > 50000){
            System.out.println(salary * 0.1);
        }else{
            System.out.println(salary * 0.05);
        }
    }
}
