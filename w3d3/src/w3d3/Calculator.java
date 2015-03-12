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
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 
    public class Calculator {
        private JTextField field;
	
	public static void main (String args []){
		Calculator calc = new Calculator();
		calc.go();
	}
	public void go(){
            
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel2.add(panel3);
        panel2.add(panel4);
       

        JButton b7 = new JButton("7");
        b7.setPreferredSize(new Dimension(50, 50));
        JButton b8 = new JButton("8");
        b8.setPreferredSize(new Dimension(50, 50));
        JButton b9 = new JButton("9");
        b9.setPreferredSize(new Dimension(50, 50));
        JButton bplus = new JButton("+");
        bplus.setPreferredSize(new Dimension(50, 50));
        JButton b4 = new JButton("4");
        b4.setPreferredSize(new Dimension(50, 50));
        JButton b5 = new JButton("5");
        b5.setPreferredSize(new Dimension(50, 50));
        JButton b6 = new JButton("6");
        b6.setPreferredSize(new Dimension(50, 50));
        JButton bminus = new JButton("-");
        bminus.setPreferredSize(new Dimension(50, 50));
        JButton b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(50, 50));
        b1.addActionListener(new b1Listener());
        JButton b2 = new JButton("2");
        b2.setPreferredSize(new Dimension(50, 50));
        JButton b3 = new JButton("3");
        b3.setPreferredSize(new Dimension(50, 50));
        JButton bstar = new JButton("*");
        bstar.setPreferredSize(new Dimension(50, 50));
        JButton bdot = new JButton(".");
        bdot.setPreferredSize(new Dimension(50, 50));
        JButton bzero = new JButton("0");
        bzero.setPreferredSize(new Dimension(50, 50));
        JButton bequal = new JButton("=");
        bequal.setPreferredSize(new Dimension(50, 50));
        JButton bslash = new JButton("/");
        bslash.setPreferredSize(new Dimension(50, 50));
        
         b1.addActionListener(new b1Listener());
         b2.addActionListener(new b2Listener());
         b3.addActionListener(new b3Listener());
         b4.addActionListener(new b4Listener());
	 b5.addActionListener(new b5Listener());
	 b6.addActionListener(new b6Listener());
	 b7.addActionListener(new b7Listener());
         b8.addActionListener(new b8Listener());
         b9.addActionListener(new b9Listener());
	 bzero.addActionListener(new bzeroListener());
	 bplus.addActionListener(new bplusListener());
	 bminus.addActionListener(new bminusListener());
         bstar.addActionListener(new bstarListener());
         bslash.addActionListener(new bslashListener());
         bequal.addActionListener(new bequalListener());
         bdot.addActionListener(new bdotListener());
		
	panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bplus);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bminus);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bstar);
        panel.add(bdot);
        panel.add(bzero);
        panel.add(bequal);
        panel.add(bslash);
        JPanel outside = new JPanel();
        outside.setLayout(new BoxLayout(outside,BoxLayout.Y_AXIS));
        outside.add(panel);
        outside.add(panel2);
        
        JButton butc = new JButton("C");
        panel4.add(butc);
        JTextField field=new JTextField("                              ");
        panel3.add(field);
        panel.setPreferredSize(new Dimension(300,300));
        panel2.setPreferredSize(new Dimension(500,500));
        frame.getContentPane().add(BorderLayout.CENTER, outside);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 200);
        frame.setVisible(true);
}
	private class b7Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("7");
		}
	}
	private class b8Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("8");
		}
	}
	private class b9Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("9");
		}
	}
	private class bplusListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("+");
		}
	}
	private class b4Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("4");
		}
	}
	private class b5Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("5");
		}
	}
	private class b6Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("6");
		}
	}
	private class bminusListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("-");
		}
	}
	private class b1Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("1");
		}
	}
	private class b2Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("2");
		}
	}
	private class b3Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("3");
		}
	}
	private class bstarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("*");
		}
	}
	private class bdotListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText(".");
		}
	}
	private class bzeroListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("0");
		}
	}
	private class bequalListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("=");
		}
	}
	private class bslashListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			 field.setText("/");
		}
	}

}