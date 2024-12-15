import javax.swing.*;
import java.awt.*;

public class Ending extends JFrame {
    Ending.Panel panel = new Ending.Panel();

    public Ending() {
        this.setTitle("I'm stuck on you ♥");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가
        this.setVisible(true); // 프레임 표시
    }

    static class Panel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon backgroundPage = new ImageIcon("Christmas_background.jpg");
            g.drawImage(backgroundPage.getImage(), 0, 0, 1480, 810, null);
            ImageIcon meme2 = new ImageIcon("meme2.jpg");
            g.drawImage(meme2.getImage(), 500, 250, 435, 460, null);
            // 텍스트 설정
            g.setColor(Color.WHITE);
            g.setFont(new Font("Copperplate", Font.BOLD, 70));
            g.drawString("Happy christmas, boo. ˞♡ฅ(ᐤ꒳ᐤฅ) ‹3", 100, 150); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Ending();
    }
}