/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2h;

/**
 *
 * @author stella
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class HelloGoodbye {

    private JButton Hello;
    private JButton Goodbye;
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {

        HelloGoodbye hg = new HelloGoodbye();
        hg.changelt();
    }

    public void changelt() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        label = new JLabel("nothing yet");
        frame.getContentPane().add(BorderLayout.CENTER, label);

        Goodbye = new JButton("Goodbye");
        Goodbye.addActionListener(new GoodbyeListener());
        
         frame.getContentPane().add(BorderLayout.SOUTH, Goodbye);

        Hello = new JButton("Hello");
        Hello.addActionListener(new HelloListener());
        frame.getContentPane().add(BorderLayout.SOUTH, Goodbye);

        frame.setVisible(true);

    }

    private class HelloListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Hello");

        }

    }

    private class GoodbyeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Goodbye");
        }

    }
}
