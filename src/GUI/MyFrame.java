package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {


    JLabel jl = new JLabel("Hello");
    private Container cp;

    MyFrame(){
        setTitle("..");
        setSize(300,300);
        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));

        cp.addKeyListener((new MyKeyListener()));

        cp.add(jl);
        jl.setLocation(50,50);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);
    }
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);{
                int keycode = e.getKeyCode();
                if (keycode == KeyEvent.VK_UP){
                    jl.setLocation(jl.getX(),jl.getY()+10);
                }
                if (keycode == KeyEvent.VK_DOWN){
                    jl.setLocation(jl.getX(),jl.getY()-10);
                }
                if (keycode == KeyEvent.VK_RIGHT){
                    jl.setLocation(jl.getX()+10,jl.getY());
                }
                if (keycode == KeyEvent.VK_LEFT){
                    jl.setLocation(jl.getX()-10,jl.getY());
                }

            }
        }
    }

}


