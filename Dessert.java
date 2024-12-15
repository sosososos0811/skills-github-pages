import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dessert extends JFrame {
    Dessert.Panel panel = new Dessert.Panel();

    public Dessert() {
        // 프레임 설정
        this.setTitle("Your hand looks heavy. Can I hold it for you?");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        ImageIcon dessert1 = new ImageIcon("dessert1_coffee.png");
        JLabel Dessert1 = new JLabel(dessert1);
        Dessert1.setBounds(150, 150, dessert1.getIconWidth(), dessert1.getIconHeight()); // 이미지 위치 설정
        panel.add(Dessert1);
        Dessert1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Place();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 2
        ImageIcon dessert2 = new ImageIcon("dessert2_juice.png");
        JLabel Dessert2 = new JLabel(dessert2);
        Dessert2.setBounds(570, 150, dessert2.getIconWidth(), dessert2.getIconHeight()); // 이미지 위치 설정
        panel.add(Dessert2);
        Dessert2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Place();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 3
        ImageIcon dessert3 = new ImageIcon("dessert3_icecream.png");
        JLabel Dessert3 = new JLabel(dessert3);
        Dessert3.setBounds(1000, 150, dessert3.getIconWidth(), dessert3.getIconHeight()); // 이미지 위치 설정
        panel.add(Dessert3);
        Dessert3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Place();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 4
        ImageIcon dessert4 = new ImageIcon("dessert4_bread.png");
        JLabel Dessert4 = new JLabel(dessert4);
        Dessert4.setBounds(350, 450, dessert4.getIconWidth(), dessert4.getIconHeight()); // 이미지 위치 설정
        panel.add(Dessert4);
        Dessert4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Place();
                setVisible(false);
                dispose();
            }
        });

        ImageIcon dessert5 = new ImageIcon("dessert5_cake.png");
        JLabel Dessert5 = new JLabel(dessert5);
        Dessert5.setBounds(770, 450, dessert5.getIconWidth(), dessert5.getIconHeight()); // 이미지 위치 설정
        panel.add(Dessert5);
        Dessert5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Place();
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
            g.drawString("What do we eat/drink for dessert?", 100, 100); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Dessert();
    }
}