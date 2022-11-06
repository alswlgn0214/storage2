package GUI;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class FlyingText extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hello");

    FlyingText(){
        setTitle("상하좌우 키 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        panel.setLayout(null);
        panel.addKeyListener(new MyKeyListener());


        label.setLocation(50,50);
        label.setSize(100,20);
        panel.add(label);

        panel.add(new JButton("+10"));

        setSize(200,200);
        setVisible(true);
        panel.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_UP:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX(), label.getY()-10);break;
                case KeyEvent.VK_DOWN:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX(), label.getY()+10);break;
                case KeyEvent.VK_RIGHT:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX()+10, label.getY());break;
                case KeyEvent.VK_LEFT:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX()-10, label.getY());break;
            }
        }
    }
}