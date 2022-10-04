/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorSample extends JFrame {
    private JFrame fr;
    private JPanel pn1, pn2;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, plus, min, mul, div, equal, clear;
    private JTextField txt;
    
    public CalculatorSample(){
        fr = new JFrame("Calculator");
        pn1 = new JPanel();
        pn2 = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt = new JTextField();
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        plus = new JButton("+");
        min = new JButton("-");
        div = new JButton("/");
        mul = new JButton("x");
        equal = new JButton("=");
        clear = new JButton("c");
        pn1.setLayout(new GridLayout(4, 4));
        pn2.setLayout(new GridLayout(1, 1));
        pn2.add(txt);
        fr.add(pn2, BorderLayout.NORTH);
        fr.add(pn1, BorderLayout.CENTER);
        pn1.add(bn7); pn1.add(bn8); pn1.add(bn9);  pn1.add(plus);
        pn1.add(bn4); pn1.add(bn5); pn1.add(bn6);  pn1.add(min);     
        pn1.add(bn1); pn1.add(bn2); pn1.add(bn3); pn1.add(mul);
        pn1.add(bn0); pn1.add(clear); pn1.add(equal);pn1.add(div);
        fr.pack();
        fr.setSize(300, 170);
        fr.setVisible(true);
    }
}
    
