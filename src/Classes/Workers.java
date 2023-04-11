package Classes;

import java.sql.SQLOutput;

public class Workers {
    private String FullName;
    private int age;
    private int exp;
    private int salary;
    private int payWork;

    public Workers(String fullName, int age, int exp, int salary) {
        FullName = fullName;
        this.age = age;
        this.exp = exp;
        this.salary = salary;
    }

    public String getFullName() {
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void SalaryBoost(){
        System.out.println("Thanks for the pay raise!\n");
        setSalary(getSalary() + 100);
    }

    public void Vacation(){
        System.out.println("Thanks for the approved vacation!\n");
    }

    public void Sick(){
        System.out.println("Thank you for health insurance!\n");
    } //Рандомом
}
