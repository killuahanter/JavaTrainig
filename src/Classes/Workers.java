package Classes;

public class Workers {
    private static String FullName;
    private int age;
    private static int exp;
    private static int salary;
    private int payWork;

    public Workers(String fullName, int age, int exp, int salary) {
        FullName = fullName;
        this.age = age;
        this.exp = exp;
        this.salary = salary;
    }

    public static String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public static int  getSalary() {
        return salary;
    }

    public static void setSalary(int i){
        salary = salary;}
    public static void SalaryBoost(){
        System.out.println("Thanks for the pay raise!\n");
        setSalary(getSalary() + 100);
    }

    public static void Vacation(){
        System.out.println("Thanks for the approved vacation!\n");
    }

    public static void Sick(){
        System.out.println("Thank you for health insurance!\n");
    } //Рандомом
}
