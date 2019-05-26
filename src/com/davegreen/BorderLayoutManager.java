package com.davegreen;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutManager
{
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private Font bigFont;
    
    public BorderLayoutManager()
    {
        this.frame = new JFrame();
        this.button1 = new JButton("Click me like you mean it!");        // More text, wider button, less text thinner button.
        this.button2 = new JButton("There is no spoon!");               // More text here DOES NOT mean it will wrap at the frame edge and force the button to get taller.
        this.button3 = new JButton("Life is an illusion!");
        this.button4 = new JButton("You are the creator of your own universe!");
        this.button5 = new JButton("Keep moving forward!");
        
        
        this.bigFont = new Font("serif", Font.BOLD, 28);
    }
    
    public void goBorder()                                           // The BorderLayout manger controls the height and width of the button that is added to it, if the text is
    {                                                               // longer than the desired and defined button width then the manager will override and display all the text
        frame.getContentPane().add(BorderLayout.EAST, button1);      // on one line making the button wider than the desired width, the height will ALWAYS be defined by the height
                                                                    // of the frame.
        
        frame.getContentPane().add(BorderLayout.NORTH, button2);        // Again here we can see that the buttons height would appear to be restricted at first by the button that is in the EAST
                                                                        // but is we remove that button we see that the NORTH button has a pre-defined height, but that it wants
                                                                        // to be as wide as the frame.
        
        button2.setFont(bigFont);                                   // Here we are setting a larger font which will by default FORCE the manager to make the NORTH button larger
                                                                    // to obviously accommodate for the larger text.
        
        frame.getContentPane().add(BorderLayout.WEST, button3);
        frame.getContentPane().add(BorderLayout.SOUTH, button4);
        frame.getContentPane().add(BorderLayout.CENTER, button5);       // Centre buttons get whatever real estate(space) is left over.
        
        
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
