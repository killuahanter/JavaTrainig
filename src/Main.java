import Classes.Records;
import GUI.MainFrame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;

public class Main {
    public static MainFrame frame;
    public static void main(String[] args) throws IOException {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        Socket socket = new Socket("localhost",8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        MyThread myThread = new MyThread();
        myThread.start();
        while (true) {
            out.println(Integer.toString(Records.getNumbers()));
        }



//        System.out.println("Continue? YES/NO");
//        String cont = sc.next();
//        if(cont.equals("YES")){
//            dev.SolveProblem();
//            Classes.moderator.moderate(client.getToSave());
//            recs.save(client.getToSave());
//            recs.delete(client.getRecDel());
//            if(Classes.moderator.getTotalAudio() > 100){
//                System.out.println(Classes.moderator.getFullName() + ":");
//                Classes.moderator.SalaryBoost();
//                Classes.moderator.Vacation();
//            }
//            if(Classes.moderator.getExp() > Math.random() * 10){
//                System.out.println(Classes.moderator.getFullName() + ":");
//                Classes.moderator.Sick();
//            }
//            if(dev.getNumFix() > 1){
//                System.out.println(dev.getFullName() + ":");
//                dev.SalaryBoost();
//                dev.Vacation();
//            }
//            if(dev.getExp() > Math.random() * 10){
//                System.out.println(dev.getFullName() + ":");
//                dev.Sick();
//            }
//            System.out.println("Thx!");
//        }else{
//            System.out.println("Thx");
//        }
    }

}