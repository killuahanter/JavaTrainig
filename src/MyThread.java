import Classes.Developer;

public class MyThread extends Thread{
    public void run(){
        if(Classes.moderator.getTotalAudio() > 100){
               System.out.println(Classes.moderator.getFullName() + ":");
               Classes.moderator.SalaryBoost();
              Classes.moderator.Vacation();
          }
           if(Classes.moderator.getExp() > Math.random() * 10){
               System.out.println(Classes.moderator.getFullName() + ":");
          Classes.moderator.Sick();
           }
           if(Developer.getNumFix() > 1){
              System.out.println(Developer.getFullName() + ":");
               Developer.SalaryBoost();
               Developer.Vacation();
          }
          if(Developer.getExp() > Math.random() * 10){
              System.out.println(Developer.getFullName() + ":");
              Developer.Sick();
          }
           System.out.println("Thx!");
           System.out.println("Thx");
    }
}
