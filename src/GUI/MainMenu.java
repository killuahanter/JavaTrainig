package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends Container {
    private JComboBox c;
    private JButton toCalculate;
    private JButton exit;

    public MainMenu(){
        setSize(600,600);
        setLayout(null);

        String cabinets[] = {"Cabinet 1", "Cabinet 2"};
        JComboBox c = new JComboBox(cabinets);
        c.setBounds(100,100,90,20);
        add(c);

        toCalculate = new JButton("ToCalculate");
        toCalculate.setBounds(100, 125, 200 ,20);
        add(toCalculate);
        toCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.frame.logicWindow.setVisible(true);
                Main.frame.menuWindow.setVisible(false);
            }
        });

        exit = new JButton("EXIT");
        exit.setBounds(100, 150, 100 ,20);
        add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
