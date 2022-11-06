package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fruits extends JFrame {

    btnFunction abb = new btnFunction();

    int a =0;
    int b =0;
    int c =0;
    int sum = 0;
    private Container cp;

    JLabel la = new JLabel(" 사과: "+a+"원, 배: "+b+"원, 체리: "+c+"원");
    JLabel la1 = new JLabel("합계는 "+sum+"원 입니다.");
    Fruits(){
        setTitle("사과배체리");
        setSize(1000,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout(FlowLayout.CENTER,30,40));

        JButton btn1 = new JButton("사과");
        JButton btn2 = new JButton("배");
        JButton btn3 = new JButton("체리");

        btn1.addActionListener(new Mybutton());
        btn2.addActionListener(new Mybutton1());
        btn3.addActionListener(new Mybutton2());

        cp.add(btn1);
        cp.add(btn2);
        cp.add(btn3);

        cp.add(la1);
        cp.add(la);

        setVisible(true);

    }
    class Mybutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            a = a + 100;
            sum = sum + 100;
            la.setText(" 사과: "+a+"원, 배: "+b+"원, 체리: "+c+"원");
            la1.setText("합계는 "+sum+"원 입니다.");
        }
    }
    class Mybutton1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            b = b + 300;
            sum = sum + 300;
            la.setText(" 사과: "+a+"원, 배: "+b+"원, 체리: "+c+"원");
            la1.setText("합계는 "+sum+"원 입니다.");
        }
    }
    class Mybutton2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            c = c + 500;
            sum = sum + 500;
            la.setText(" 사과: "+a+"원, 배: "+b+"원, 체리: "+c+"원");
            la1.setText("합계는 "+sum+"원 입니다.");
        }
    }
}
