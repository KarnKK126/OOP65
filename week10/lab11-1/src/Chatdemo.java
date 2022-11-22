/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*; 
public class Chatdemo implements ActionListener, WindowListener{
    private JFrame frame;
    private JTextArea textArea;
    private JButton buttonSubmit, buttonReset;
    private JTextField textField;
    private JPanel buttonPanel, textPanel;
    String chatText = "";
    
    public Chatdemo(){
        frame = new JFrame("Chatdemo");
        textArea = new JTextArea(20, 45);
        buttonSubmit = new JButton("Submit");
        buttonReset = new JButton("Reset");
        textField = new JTextField(45);
        buttonPanel = new JPanel();
        textPanel = new JPanel();
        
        textArea.setEnabled(false);
//        cant Enter in this area

//        do Try catch
        try(FileReader fileReader = new FileReader("ChatDemo.dat")){
            int ch;
            while((ch = fileReader.read()) != -1){
                chatText += (char)ch;
            }
            textArea.setText(chatText);
        }catch(IOException ex){
            System.out.print("ex");
        }


        textPanel.setLayout(new BorderLayout());
        textPanel.add(textArea, BorderLayout.NORTH);
        textPanel.add(textField, BorderLayout.SOUTH);
        
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(buttonSubmit);  buttonPanel.add(buttonReset);
        
        
        frame.setLayout(new BorderLayout());
        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        
        buttonSubmit.addActionListener(this);   buttonReset.addActionListener(this);
        frame.addWindowListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        
//       What is this
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Chatdemo();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(buttonSubmit)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            textArea.setText(textArea.getText() + dtf.format(LocalDateTime.now()) + " : " + textField.getText() + "\n");
            
            textField.setText("");
        }
        else if(ev.getSource().equals(buttonReset)){
            textArea.setText("");
            textField.setText("");
        }
    }
    
    public void windowOpened(WindowEvent ev){}
    public void windowClosed(WindowEvent ev){}
    public void windowClosing(WindowEvent ev){
        try(FileWriter fileWriter = new FileWriter("ChatDemo.dat")){
            fileWriter.write(textArea.getText());
        }catch(IOException e){
            System.out.print(e);
        }
    }
//    make it full class
    public void windowIconified(WindowEvent ev){}
    public void windowDeiconified(WindowEvent ev){}
    public void windowActivated(WindowEvent ev){}
    public void windowDeactivated(WindowEvent ev){}
}
