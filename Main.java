import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main extends JFrame {
    private static Clip clip;

    public Main() {
        JFrame frame = new JFrame("I love you, babe.");
        frame.setSize(1480, 810);
        frame.setLocation(70, 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton buttonGirlFriend = new JButton();
        buttonGirlFriend.setBounds(300, 350, 250, 70);
        buttonGirlFriend.setText("GIRLFRIEND");
        buttonGirlFriend.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonGirlFriend.setForeground(Color.PINK);
        buttonGirlFriend.setHorizontalTextPosition(JButton.CENTER);
        buttonGirlFriend.setVerticalTextPosition(JButton.CENTER);
        buttonGirlFriend.setFocusable(false);
        frame.add(buttonGirlFriend);

        buttonGirlFriend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thanks();
                setVisible(false);
                dispose();
            }
        });

        JButton buttonBoyFriend = new JButton();
        buttonBoyFriend.setBounds(870, 350, 250, 70);
        buttonBoyFriend.setText("BOYFRIEND");
        buttonBoyFriend.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonBoyFriend.setForeground(Color.PINK);
        buttonBoyFriend.setHorizontalTextPosition(JButton.CENTER);
        buttonBoyFriend.setVerticalTextPosition(JButton.CENTER);
        buttonBoyFriend.setFocusable(false);
        frame.add(buttonBoyFriend);

        buttonBoyFriend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thanks();
                setVisible(false);
                dispose();
            }
        });

        JButton buttonNo = new JButton();
        buttonNo.setBounds(580, 550, 250, 70);
        buttonNo.setText("NO!");
        buttonNo.setFont(new Font("Copperplate", Font.BOLD, 35));
        buttonNo.setForeground(Color.PINK);
        buttonNo.setHorizontalTextPosition(JButton.CENTER);
        buttonNo.setVerticalTextPosition(JButton.CENTER);
        buttonNo.setFocusable(false);
        frame.add(buttonNo);

        buttonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(buttonNo);
                frame.revalidate();
                frame.repaint();
            }
        });

        playMusic();
    }

    public void playMusic() {
        try {
            File audioFile = new File("All I Want For Christmas Is You.wav");
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

    public static void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Stop music
            clip.close(); // Close clip
        }
    }

    static class Panel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            g.setFont(new Font("Copperplate", Font.BOLD, 200)); // 텍스트 폰트 및 크기 설정
            g.setColor(Color.WHITE); // 텍스트 색상 설정

            ImageIcon backgroundPage = new ImageIcon("Christmas_background.jpg");
            g.drawImage(backgroundPage.getImage(), 0, 0, 1500, 1000, null);
            ImageIcon game_name = new ImageIcon("Title.png");
            g.drawImage(game_name.getImage(), 220, 50, 1000, 250, null);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}