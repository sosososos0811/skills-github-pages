import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Food extends JFrame {
    Food.Panel panel = new Food.Panel();

    public Food() {
        // 프레임 설정
        this.setTitle("You are so sweet like chocolate.");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        ImageIcon food1 = new ImageIcon("food1_spagetti.png");
        JLabel Food1 = new JLabel(food1);
        Food1.setBounds(150, 150, 300, 300); // 이미지 위치 설정
        panel.add(Food1);
        Food1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dessert();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 2
        ImageIcon food2 = new ImageIcon("food2_koreanFood.png");
        JLabel Food2 = new JLabel(food2);
        Food2.setBounds(570, 150, food2.getIconWidth(), food2.getIconHeight()); // 이미지 위치 설정
        panel.add(Food2);
        Food2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dessert();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 3
        ImageIcon food3 = new ImageIcon("food3_vietnamFood.png");
        JLabel Food3 = new JLabel(food3);
        Food3.setBounds(1000, 150, food3.getIconWidth(), food3.getIconHeight()); // 이미지 위치 설정
        panel.add(Food3);
        Food3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dessert();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 4
        ImageIcon food4 = new ImageIcon("food4_steak.png");
        JLabel Food4 = new JLabel(food4);
        Food4.setBounds(350, 450, food4.getIconWidth(), food4.getIconHeight()); // 이미지 위치 설정
        panel.add(Food4);
        Food4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dessert();
                setVisible(false);
                dispose();
            }
        });

        ImageIcon food5 = new ImageIcon("food5_sushi.png");
        JLabel Food5 = new JLabel(food5);
        Food5.setBounds(770, 450, food5.getIconWidth(), food5.getIconHeight()); // 이미지 위치 설정
        panel.add(Food5);
        Food5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dessert();
                setVisible(false);
                dispose();
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
            g.drawString("What food would you like to eat?", 100, 100); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Food();
    }
}