/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

/**
 *
 * @author stella
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Lai
 */
public class MyNotepad extends JFrame{
    
    private JTextArea area = new JTextArea();
    private JPanel panel = new JPanel();
    private JButton saveb = new JButton("Save");
    private JButton loadb = new JButton("Load");
    
    
    public static void main(String[] args){
        MyNotepad p1 = new MyNotepad("My Notepad");
    }
    
    public MyNotepad(String name){
        super(name);
        
        saveb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Files.write(Paths.get("notepad.txt"), area.getText().getBytes());
                } catch (IOException ie){
                }
            }
            
        });
        
       loadb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text = new String(Files.readAllBytes(Paths.get("notepad.txt")));
                    area.setText(text);
                } catch (Exception ie){
                    
                }
            }
            
        });
        
   
        panel.add(saveb);
        panel.add(loadb);
        
        this.getContentPane().add(BorderLayout.WEST, area);
        this.getContentPane().add(panel);
        area.setPreferredSize(new Dimension(200, 250));
        
        
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
}