package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainLogic extends Container {
    private JLabel[] text = new JLabel[10];
    private JTextField[] fields = new JTextField[10];
    private JButton button;
    private JButton back;
    public MainLogic(){
        for(int i = 0; i < 10; i++){
            fields[i] = new JTextField();
            text[i] = new JLabel();
        }
        setSize(600,600);
        setLayout(null);

        text[0] = new JLabel("Input number of records:");
        text[0].setBounds(20, 10, 250, 20);
        add(text[0]);

        fields[0] = new JTextField();
        fields[0].setBounds(20, 35, 200 ,20);
        add(fields[0]);

        text[1] = new JLabel("Input number of records to save:");
        text[1].setBounds(20, 60, 250, 20);
        add(text[1]);

        fields[1] = new JTextField();
        fields[1].setBounds(20, 85, 200 ,20);
        add(fields[1]);

        text[2] = new JLabel("Input number of records to delete:");
        text[2].setBounds(20, 110, 250, 20);
        add(text[2]);

        fields[2] = new JTextField();
        fields[2].setBounds(20, 135, 200 ,20);
        add(fields[2]);

        text[3] = new JLabel("Input problem:");
        text[3].setBounds(20, 160, 250, 20);
        add(text[3]);

        fields[3] = new JTextField();
        fields[3].setBounds(20, 185, 200 ,20);
        add(fields[3]);

        text[6] = new JLabel("");
        text[6].setBounds(200, 235, 200 ,20);
        add(text[6]);


        button = new JButton("Calculate");
        button.setBounds(20, 210, 100 ,20);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader buff = new BufferedReader(new FileReader("D:/Java oop/RK/src/name.txt"));
                    String c;
                    int a = 0;
                    String[] s = new String[5];
                    while ((c = buff.readLine())!=null) {
                        s[a] = c;
                        a++;
                    }
                    buff.close();
                    Developer dev = new Developer(s[0], 45,2,1000,s[1],0);
                    moderator moderator = new moderator(s[2], 16, 3, 5, 0);
                    accounting account = new accounting(0, 5, 1000);
                    Records recs = new Records(0,s[3],50);
                    Client client = new Client(0,0,0,s[4],0);
                    try {client.setRecords(Integer.parseInt(fields[0].getText()));}
                    catch (NumberFormatException f){f.printStackTrace();}
                    try {client.setToSave(Integer.parseInt(fields[1].getText()));}
                    catch (NumberFormatException f){f.printStackTrace();}
                    try {client.setRecDel(Integer.parseInt(fields[2].getText()));}
                    catch (NumberFormatException f){f.printStackTrace();}
                    client.setProblem(fields[3].getText());
                    if(client.getRecords() < client.getToSave() || client.getToSave() <
                            client.getRecDel() ||
                            client.getRecords() < client.getRecords()){
                        Main.frame.errorWindow.setVisible(true);
                    }
                    client.setPayment(account.PaymentCounter(client.getToSave(), client.getProblem()));
                    text[6].setText(Integer.toString(client.getPayment()));
                } catch (FileNotFoundException h){h.printStackTrace();} catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        back = new JButton("BACK");
        back.setBounds(20, 245, 100 ,20);
        add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.logicWindow.setVisible(false);
            }
        });
    }
}
