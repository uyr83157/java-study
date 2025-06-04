package com.example.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentExample extends JFrame {

    private JLabel messageLabel;
    private JButton clickButton;

    public ComponentExample() {
        // JFrame 설정
        setTitle("컴포넌트 테스트");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 레이아웃 매니저 설정
        setLayout(new FlowLayout());

        // JLabel 컴포넌트
        messageLabel = new JLabel("클릭하여 접속해주세요");
        messageLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
        add(messageLabel); // 창에 레이블 추가

        // JButton 컴포넌트
        clickButton = new JButton("접속하기");
        clickButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        add(clickButton);

        // 버튼 클릭 이벤트 처리
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("접속완료");
            }
        });
    }

}

