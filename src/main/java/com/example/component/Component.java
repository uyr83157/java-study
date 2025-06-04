package com.example.component;

import javax.swing.*;

public class Component {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleComponentExample exampleFrame = new SimpleComponentExample();
                exampleFrame.setVisible(true);
            }
        });
    }
}
