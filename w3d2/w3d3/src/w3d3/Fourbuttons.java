/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d3;

/**
 *
 * @author stella
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Fourbuttons extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
       JPanel panel2 = new JPanel();

        JButton b = new JButton("A");
        b.setPreferredSize(new Dimension(100, 100));
        JButton b1 = new JButton("B");
        b1.setPreferredSize(new Dimension(100, 100));
        JButton b2 = new JButton("C");
        b2.setPreferredSize(new Dimension(100, 100));
        JButton b3 = new JButton("D");
        b3.setPreferredSize(new Dimension(100, 100));
        panel.add(b);
        panel.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        JPanel outside = new JPanel();
        outside.setLayout(new BoxLayout(outside,BoxLayout.Y_AXIS));
        outside.add(panel);
        outside.add(panel2);
        
        panel.setPreferredSize(new Dimension(200,300));
        panel2.setPreferredSize(new Dimension(200,300));
        frame.getContentPane().add(BorderLayout.CENTER, outside);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

}
