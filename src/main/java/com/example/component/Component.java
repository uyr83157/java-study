package com.example.component;

import javax.swing.*;

public class Component {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ComponentExample exampleFrame = new ComponentExample();
                exampleFrame.setVisible(true);
            }
        });
    }
}
