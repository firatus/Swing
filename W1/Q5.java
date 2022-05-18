/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.W1;

/**
 *
 * @author firat
 */
import java.awt.Dimension;
import javax.swing.*;

import java.awt.event.*;

public class Q5 {

public Q5(){
JFrame f = new JFrame();

f.setSize(400,400);



JPanel panel = new JPanel();
f.getContentPane().add(panel);
JTextField text =  new JTextField();


text.setPreferredSize(new Dimension(100,20));
panel.add(text);
JButton b1 = new JButton("Invisible");
panel.add(b1);
JButton b2 = new JButton("Unvisible");
panel.add(b2);
f.setVisible(true);
text.setLayout(null);



b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    text.setVisible(false);
    
    
     
     }
   });
b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    text.setVisible(true);
    
    
     
     }
   });
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 }

 public static void main(String[] args){
     Q5 ud = new Q5();

      }
   }
