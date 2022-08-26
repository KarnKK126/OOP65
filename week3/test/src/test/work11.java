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
public class work11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input yout money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase : ");
        char txt = sc.next().charAt(0);
        double total = 0;
        if(txt == 'A' || txt == 'C'){
            total = money + (money * 0.015);
            System.out.println(total);
        }else if(txt == 'B'){
            total = money + (money * 0.02);
        }else if(txt == 'X'){
            total = money + (money * 0.05);
        }
        System.out.println("Your total money in ine year = " + (int)total);
    }
}
