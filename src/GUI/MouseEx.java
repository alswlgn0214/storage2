//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//public class MouseEx extends JFrame{
//
//    ImageIcon image =
//    JLabel la = new JLabel();
//
//    MouseEx(){
//        setTitle("마우스 움직임 프로그램");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        MyMouse1 mouse = new MyMouse1();
//        Container c = getContentPane();
//        c.addMouseListener(mouse);
//        c.addMouseMotionListener(mouse);
//        c.setLayout(null);
//        la.setSize(80,20);
//        la.setLocation(100,80);
//        c.add(la);
//        setSize(300,200);
//        setVisible(true);
//
//    }
//    public class MyMouse1 implements MouseListener, MouseMotionListener {
//
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            Component comp = (Component) e.getSource();
//            comp.setBackground(Color.BLUE);
//
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            Component comp = (Component) e.getSource();
//            comp.setBackground(Color.pink);
//
//
//        }
//
//        @Override
//        public void mouseDragged(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent e) {
//
//        }
//    }
//
//}
