package Classes;

public class Client {
    private int payment;
    private int Records;
    private int RecDel;
    private String problem;

    private int toSave;


    public Client(int payment, int records, int recDel, String problem, int toSave) {
        this.payment = payment;
        Records = records;
        RecDel = recDel;
        this.problem = problem;
        this.toSave = toSave;
    }


    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getToSave() {
        return toSave;
    }

    public void setToSave(int toSave) {
        this.toSave = toSave;
    }

    public int getRecDel() {
        return RecDel;
    }

    public void setRecDel(int recDel) {
        RecDel = recDel;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getRecords() {
        return Records;
    }

    public void setRecords(int records) {
        Records = records;
    }

}
