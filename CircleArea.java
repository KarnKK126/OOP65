/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_karn;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println(area);
    }
    
}
