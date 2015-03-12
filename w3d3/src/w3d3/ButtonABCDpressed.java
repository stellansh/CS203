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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonABCDpressed {

    public static void main(String args[]) {
        ButtonABCDpressed B = new ButtonABCDpressed();
        B.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();

        JButton a = new JButton("A");
        a.setPreferredSize(new Dimension(100, 100));
        a.addActionListener(new AListener());

        JButton b = new JButton("B");
        b.setPreferredSize(new Dimension(100, 100));
        b.addActionListener(new BListener());

        JButton c = new JButton("C");
        c.setPreferredSize(new Dimension(100, 100));
        c.addActionListener(new CListener());

        JButton d = new JButton("D");
        d.setPreferredSize(new Dimension(100, 100));
        d.addActionListener(new DListener());

        panel.add(a);
        panel.add(b);
        panel1.add(c);
        panel1.add(d);

        JPanel outer = new JPanel();
        outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));
        outer.add(panel);
        outer.add(panel1);

        panel.setPreferredSize(new Dimension(200, 300));
        panel1.setPreferredSize(new Dimension(200, 300));
        frame.getContentPane().add(BorderLayout.CENTER, outer);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class AListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button A pressed");
        }
    }

    private class BListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button B pressed");
        }
    }

    private class CListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button C pressed");
        }
    }

    private class DListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button D pressed");
        }
    }

}


