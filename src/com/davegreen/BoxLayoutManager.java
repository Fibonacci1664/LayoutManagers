package com.davegreen;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutManager
{
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    public BoxLayoutManager()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.button1 = new JButton("I'm demonstrating BoxLayoutManager.");
        this.button2 = new JButton("So am I.");
        this.button3 = new JButton("Me Too!");
    }
    
    public void goBox()
    {
        panel.setBackground(Color.blue);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));        // With this line of code we are set a new BoxLayout and telling the BoxLayout constructor what component
                                                                        // were laying out i.e. "panel", we then define which axis Y_AXIS for a vertical stack.
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
