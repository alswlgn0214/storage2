package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DirectionMaker implements ActionListener {

    private String dir;
    DirectionMaker(String dir){
        this.dir = dir;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JButton jb = (JButton) e.getSource();
        jb.setText(this.dir);

    }
}
