package com.demo;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JFrame {
    CalculatorPanel() {
        init();
        setVisible(true);
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("简易计算器");
    }

    void init() {
        Container c = getContentPane();
        //c.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(4, 4));
        JPanel p3 = new JPanel();

        JTextField t = new JTextField(30);
        p1.add(t);

        JButton jbs[] = new JButton[15];
        jbs[0] = new JButton("7");
        /*jbs[1] = new JButton("8");
        jbs[2] = new JButton("9");
        jbs[3] = new JButton("/");
        jbs[4] = new JButton("4");
        jbs[5] = new JButton("5");
        jbs[6] = new JButton("6");
        jbs[7] = new JButton("*");
        jbs[8] = new JButton("1");
        jbs[9] = new JButton("2");
        jbs[10] = new JButton("3");
        jbs[11] = new JButton("-");
        jbs[12] = new JButton("0");
        jbs[13] = new JButton(".");
        jbs[14] = new JButton("+");
        jbs[15] = new JButton("=");*/
        /*for (int i = 0; i <= jbs.length; i++) {
            p2.add(jbs[i]);
        }*/
        p2.add(jbs[0]);

        JButton b = new JButton("清零");
        p1.add(b);

        c.add(p1);
        c.add(p2);
        c.add(p3);
    }

    public static void main(String[] args) {
        new CalculatorPanel();
    }
}
