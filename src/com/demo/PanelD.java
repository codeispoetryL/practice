package com.demo;

import javax.swing.*;
import java.awt.*;

public class PanelD extends JDialog {
    public PanelD() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 1, 10, 10));
        JPanel p1 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p3 = new JPanel(new GridLayout(1, 1, 10, 10));

        p1.add(new JButton("按钮1"));
        p1.add(new JButton("按钮2"));
        p1.add(new JButton("按钮6"));

        p2.add(new JButton("按钮3"));
        p2.add(new JButton("按钮4"));

        p3.add(new JButton("按钮5"));

        c.add(p1);
        c.add(p2);
        c.add(p3);
        setTitle("面板演示");
        setSize(420, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PanelD();
    }
}
