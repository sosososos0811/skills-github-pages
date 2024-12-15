import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BadChristmas extends JFrame {
    private Clip clip;
    BadChristmas.Panel panel = new BadChristmas.Panel();

    public BadChristmas() {
        // 프레임 설정
        this.setSize(1480, 810);
        this.setLocation(70, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // 레이아웃 매니저 비활성화

        // 패널 설정
        panel.setLayout(null); // 패널 내부 레이아웃 비활성화
        panel.setBounds(0, 0, 1480, 810);
        this.add(panel); // 패널을 프레임에 추가

        // 움짤 경로 설정
        String gifPath = "santaFinal.gif";
        ImageIcon giftIcon = new ImageIcon(gifPath);

        // JLabel을 사용하여 움짤 추가
        JLabel gifLabel = new JLabel(giftIcon);
        gifLabel.setBounds(0, 0, giftIcon.getIconWidth(), giftIcon.getIconHeight()); // 움짤 위치와 크기 설정
        panel.add(gifLabel);

        Timer timer = new Timer(1000, e -> playMusic());
        timer.setRepeats(false);
        timer.start();

        Timer timer2 = new Timer(6500, e -> closeFrame());
        timer2.setRepeats(false);
        timer2.start();

        this.setVisible(true); // 프레임 표시
    }

    private void playMusic() {
        try {
            File audioFile = new File("santa.wav");
            // Adjust to your WAV file path
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(0.0f);
            // Set volume to max
            clip.start();

            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void closeFrame() {
        System.exit(0);
        setVisible(false);
        dispose();
    }

    // 커스텀 패널 클래스
    static class Panel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 배경 이미지 설정
            ImageIcon backgroundPage = new ImageIcon("Christmas_background.jpg");
            g.drawImage(backgroundPage.getImage(), 0, 0, 1480, 810, null);
        }
    }

    public static void main(String[] args) {
        new BadChristmas();
    }
}