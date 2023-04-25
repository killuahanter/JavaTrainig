package Classes;

public class Developer extends Workers {
    private String type;
    private static int NumFix;

    public Developer(String fullName, int age, int exp, int salary, String type, int numFix) {
        super(fullName, age, exp, salary);
        this.type = type;
        NumFix = numFix;
    }

    public static int getNumFix() {
        return NumFix;
    }

    public void setNumFix(int numFix) {
        NumFix = numFix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private class server{
        public void Fix(){
            System.out.println("Server is not active, please wait until problem will be solved...");
        }
    }
    public int SolveProblem(){
        server serv = new server();
        serv.Fix();
        System.out.println("Problem solved!\n");
        NumFix =+ 1;
        setSalary(getSalary()+1000);
        return 0;
    }
    @Override
    public String toString() {
        return "Classes.Developer{" +
                "type='" + type + '\'' +
                ", NumFix=" + NumFix +
                '}';
    }
}
