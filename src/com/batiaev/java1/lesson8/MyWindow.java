package com.batiaev.java1.lesson8;

import javax.swing.*;

/**
 * MyWindow
 *
 * @author anton
 * @since 28/12/17
 */
public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow().setVisible(true);
    }
}
