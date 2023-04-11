package GUI;

import javax.swing.*;
import java.awt.*;

public class Error extends Container {
    private JLabel a;
    public Error(){
        setSize(400,200);
        setLayout(null);
        a = new JLabel("Input number of records:");
        a.setBounds(20, 10, 250, 20);
        add(a);
    }
}
