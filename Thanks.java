import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Thanks extends JFrame {
    private Clip clip;
    Thanks.Panel panel = new Thanks.Panel();

    public Thanks() {
        // 프레임 설정
        this.setTitle("You know what? I'm flirting with you.");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        // 버튼 생성 및 설정
        JButton buttonClick = new JButton();
        buttonClick.setBounds(550, 600, 350, 100); // 버튼 위치 및 크기 설정
        buttonClick.setText("Click me, (｡•̀ᴗ-)✧");
        buttonClick.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonClick.setForeground(Color.PINK);
        buttonClick.setFocusable(false);
        panel.add(buttonClick); // 버튼을 패널에 추가

        // 버튼 클릭 이벤트
        buttonClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Date(); // 새로운 창 열기
                setVisible(false);
                dispose(); // 현재 창 닫기
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
            g.drawImage(backgroundPage.getImage(), 0, 0, 1500, 1000, null);

            // 텍스트 설정
            g.setColor(Color.WHITE);
            g.setFont(new Font("Copperplate", Font.BOLD, 70));
            g.drawString("THANK YOU,", 20, 350); // 텍스트 위치 설정
            g.drawString("HONEY ⩌⩊⩌", 950, 350); // 텍스트 위치 설정

            // 밈 이미지 설정
            ImageIcon meme = new ImageIcon("meme1.jpg");
            g.drawImage(meme.getImage(), 500, 100, 435, 460, null);
        }
    }

    public static void main(String[] args) {
        new Thanks();
    }
}