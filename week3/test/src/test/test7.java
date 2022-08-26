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
public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        if (Math.abs(n1 - n2) < 0.001 ){
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
    }
}
