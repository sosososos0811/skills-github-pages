import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fun extends JFrame {
    Fun.Panel panel = new Fun.Panel();
    int clickCount = 0;

    public Fun() {
        // 프레임 설정
        this.setTitle("If I could rearrange the alphabet, I'd put 'U' and 'I' together");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        JButton buttonYES = new JButton();
        buttonYES.setBounds(300, 350, 250, 70);
        buttonYES.setText("YES");
        buttonYES.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonYES.setForeground(Color.PINK);
        buttonYES.setHorizontalTextPosition(JButton.CENTER);
        buttonYES.setVerticalTextPosition(JButton.CENTER);
        buttonYES.setFocusable(false);
        panel.add(buttonYES);
        buttonYES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ending();
                setVisible(false);
                dispose();
            }
        });

        JButton buttonNO = new JButton();
        buttonNO.setBounds(870, 350, 250, 70);
        buttonNO.setText("NO");
        buttonNO.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonNO.setForeground(Color.PINK);
        buttonNO.setHorizontalTextPosition(JButton.CENTER);
        buttonNO.setVerticalTextPosition(JButton.CENTER);
        buttonNO.setFocusable(false);
        panel.add(buttonNO);
        buttonNO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount ++ ;
                if (clickCount == 1) {
                    buttonNO.setText("YES");
                } else if (clickCount == 2) {
                    new Ending();
                    setVisible(false);
                    dispose();
                }
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
            g.drawString("Did you have fun today, ✿(′ᵕ′*)?", 150, 100); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Fun();
    }
}