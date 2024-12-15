import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Place extends JFrame {
    Place.Panel panel = new Place.Panel();

    public Place() {
        // 프레임 설정
        this.setTitle("You know what’s beautiful? Read the first word.");
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        ImageIcon place1 = new ImageIcon("place1_acquarium.png");
        JLabel Place1 = new JLabel(place1);
        Place1.setBounds(150, 150, 300, 300); // 이미지 위치 설정
        panel.add(Place1);
        Place1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Fun();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 2
        ImageIcon place2 = new ImageIcon("place2_amusementpark.png");
        JLabel Place2 = new JLabel(place2);
        Place2.setBounds(570, 150, place2.getIconWidth(), place2.getIconHeight()); // 이미지 위치 설정
        panel.add(Place2);
        Place2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Fun();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 3
        ImageIcon place3 = new ImageIcon("place3_beach.png");
        JLabel Place3 = new JLabel(place3);
        Place3.setBounds(1000, 150, place3.getIconWidth(), place3.getIconHeight()); // 이미지 위치 설정
        panel.add(Place3);
        Place3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Fun();
                setVisible(false);
                dispose();
            }
        });

        // 버튼 4
        ImageIcon place4 = new ImageIcon("place4_cinema.png");
        JLabel Place4 = new JLabel(place4);
        Place4.setBounds(350, 450, place4.getIconWidth(), place4.getIconHeight()); // 이미지 위치 설정
        panel.add(Place4);
        Place4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Fun();
                setVisible(false);
                dispose();
            }
        });

        ImageIcon place5 = new ImageIcon("place5_concert.png");
        JLabel Place5 = new JLabel(place5);
        Place5.setBounds(770, 450, place5.getIconWidth(), place5.getIconHeight()); // 이미지 위치 설정
        panel.add(Place5);
        Place5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Fun();
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
            g.drawString("Which place would you like to go?", 100, 100); // 텍스트 위치 조정
        }
    }

    public static void main(String[] args) {
        new Place();
    }
}