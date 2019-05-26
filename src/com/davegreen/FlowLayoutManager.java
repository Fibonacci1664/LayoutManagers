package com.davegreen;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager
{
    private JFrame frame;                                               // HEAD FIRST JAVA BOOK STATES THAT FLOW LAYOUT MANAGER WILL WORD WRAP AT THE EDGES OF THE FRAME, THIS IS
    private JPanel panel1;                                               // BULLSHIT!!
    private JPanel panel2;                                               // BULLSHIT!!
    private JPanel panel3;                                               // BULLSHIT!!
    private JPanel panel4;                                               // BULLSHIT!!
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    
    public FlowLayoutManager()
    {
        this.frame = new JFrame();
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.panel4 = new JPanel();
        this.button1 = new JButton("I'm a button on a panel.");
        this.button2 = new JButton("So am I.");
        this.button3 = new JButton("Me Too!");                 // We could keep adding buttons but they will never wrap at the edge of the frame, you will only start
        this.button4 = new JButton("Look over here!");          // to lose your buttons off the edge of the frame, as can be seen if the frame size width is set to 200px.
        this.button5 = new JButton("No look here!");
        this.button6 = new JButton("Oi, over here!");
    }
    
    public void goFlow()
    {
        panel1.setBackground(Color.black);                           // Here we create a very basic black panel and then add it to the frame in the EAST.
        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        frame.getContentPane().add(BorderLayout.EAST, panel1);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
    
    public void flowWrap()
    {
        panel1.setBackground(Color.black);                           // Here we create a very basic black panel and then add it to the frame in the EAST.
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
    
        panel2.add(button4);                                        // Try as i might with this method to get some panel to clash and things to bump into each other to try and
        panel2.add(button5);                                        // force a word wrap, it just simply doesn't happen, the HeadFirst Java is wrong.
        panel2.add(button6);
        
        frame.getContentPane().add(BorderLayout.EAST, panel1);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.SOUTH, panel3);
        frame.getContentPane().add(BorderLayout.NORTH, panel4);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
