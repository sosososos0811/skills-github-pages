import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Date extends JFrame {
    Date.Panel panel = new Date.Panel();

    public Date() {
        // 프레임 설정
        this.setTitle("I crush on you. ˞♡ฅ(ᐤ3ᐤฅ) ‹3");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        // 버튼 1 (정답)
        JButton buttonChristmas = new JButton();
        buttonChristmas.setBounds(600, 250, 350, 100); // 버튼 위치 및 크기 조정
        buttonChristmas.setText("2024.12.25");
        buttonChristmas.setFont(new Font("Copperplate", Font.BOLD, 40));
        buttonChristmas.setForeground(Color.PINK);
        buttonChristmas.setFocusable(false);
        panel.add(buttonChristmas);

        buttonChristmas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Food();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 2
        JButton buttonNotChristmas1 = new JButton();
        buttonNotChristmas1.setBounds(100, 300, 350, 100); // 버튼 위치 조정
        buttonNotChristmas1.setText("2025.1.13");
        buttonNotChristmas1.setFont(new Font("Copperplate", Font.BOLD, 40));
        buttonNotChristmas1.setForeground(Color.PINK);
        buttonNotChristmas1.setFocusable(false);
        panel.add(buttonNotChristmas1);

        buttonNotChristmas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(buttonNotChristmas1);
                panel.revalidate();
                panel.repaint();
            }
        });

        // 버튼 3
        JButton buttonNotChristmas2 = new JButton();
        buttonNotChristmas2.setBounds(1000, 350, 350, 100); // 버튼 위치 조정
        buttonNotChristmas2.setText("2024.12.28");
        buttonNotChristmas2.setFont(new Font("Copperplate", Font.BOLD, 40));
        buttonNotChristmas2.setForeground(Color.PINK);
        buttonNotChristmas2.setFocusable(false);
        panel.add(buttonNotChristmas2);

        buttonNotChristmas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(buttonNotChristmas2);
                panel.revalidate();
                panel.repaint();
            }
        });

        // 버튼 4
        JButton buttonNotChristmas3 = new JButton();
        buttonNotChristmas3.setBounds(250, 500, 350, 100); // 버튼 위치 조정
        buttonNotChristmas3.setText("2025.2.10");
        buttonNotChristmas3.setFont(new Font("Copperplate", Font.BOLD, 40));
        buttonNotChristmas3.setForeground(Color.PINK);
        buttonNotChristmas3.setFocusable(false);
        panel.add(buttonNotChristmas3);

        buttonNotChristmas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(buttonNotChristmas3);
                panel.revalidate();
                panel.repaint();
            }
        });

        // 버튼 5
        JButton buttonNotChristmas4 = new JButton();
        buttonNotChristmas4.setBounds(666, 666, 350, 100); // 버튼 위치 조정
        buttonNotChristmas4.setText("6666.66.66");
        buttonNotChristmas4.setFont(new Font("Copperplate", Font.BOLD, 40));
        buttonNotChristmas4.setForeground(Color.PINK);
        buttonNotChristmas4.setFocusable(false);
        panel.add(buttonNotChristmas4);

        buttonNotChristmas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BadChristmas();
                setVisible(false);
                dispose();
                Main.stopMusic();
            }
        });

        this.setVisible(true); // 프레임 표시
    }

    // 커스텀 패널 클래스
    static class Panel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 배경 이미지 설정
            ImageIcon backgroundPage = new ImageIcon("Christmas_background.jpg");
            g.drawImage(backgroundPage.getImage(), 0, 0, 1480, 810, null);

            // 텍스트 설정
            g.setColor(Color.WHITE);
            g.setFont(new Font("Copperplate", Font.BOLD, 70));
            g.drawString("Are you free on Christmas?", 200, 150); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Date();
    }
}