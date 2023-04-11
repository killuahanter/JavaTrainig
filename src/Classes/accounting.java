package Classes;

public class accounting {
    private int money;
    private int moneyMod;
    private int MoneyDev;


    public accounting(int money, int moneyMod, int moneyDev) {
        this.money = money;
        this.moneyMod = moneyMod;
        MoneyDev = moneyDev;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoneyMod() {
        return moneyMod;
    }

    public void setMoneyMod(int moneyMod) {
        this.moneyMod = moneyMod;
    }

    public int getMoneyDev() {
        return MoneyDev;
    }

    public void setMoneyDev(int moneyDev) {
        MoneyDev = moneyDev;
    }

    public int PaymentCounter(int a, String b){
        int res = 0;
        if (b == "None"){
            res = getMoneyMod() * a;
        }
        else {
            res = (getMoneyMod() * a) + getMoneyDev();
        }
        return res;
    }

  //  public void allplus(int a){
  //      money =+ a;
  //  }

   // public void allmin(int a){
   //     money =- a;
   // }
}
