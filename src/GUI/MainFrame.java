package GUI;

import GUI.Error;
import GUI.MainLogic;
import GUI.MainMenu;

import javax.swing.*;

public class MainFrame extends JFrame{
    public static MainMenu menuWindow;
    public static MainLogic logicWindow;
    public static Error errorWindow;
    public MainFrame(){
        setSize(500, 500);
        setTitle("Audio Control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow = new MainMenu();
        setLocation(0,0);
        add(menuWindow);

        logicWindow = new MainLogic();
        setLocation(0,0);
        logicWindow.setVisible(false);
        add(logicWindow);

        errorWindow = new Error();
        setLocation(0,0);
        errorWindow.setVisible(false);
        add(errorWindow);
    }
}
