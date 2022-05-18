/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.W1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author firat
 */
public class Q4 {
    
    public static void main(String[] args)
    {
        JFrame frame =  new JFrame();
        JLabel jlabel = new JLabel("Label");
        JPanel jpanel = new JPanel();
        JButton jbutton = new JButton("Button");
        JTextField jtext = new JTextField("Text");
        
        
        frame.setSize(300,300);
        frame.add(jpanel);
        
        jpanel.add(jlabel);
        jpanel.add(jbutton);
        jpanel.add(jtext);
        
        frame.setVisible(true);
        
        
        
        
    }
    
}
