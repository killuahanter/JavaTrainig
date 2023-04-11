package Classes;

public class moderator extends Workers {
    private int TotalAudio;

    public moderator(String fullName, int age, int exp, int salary, int totalAudio) {
        super(fullName, age, exp, salary);
        TotalAudio = totalAudio;
    }

    public int getTotalAudio() {
        return TotalAudio;
    }

    public void setTotalAudio(int totalAudio) {
        TotalAudio = totalAudio;
    }

    public void moderate(int a){
        System.out.println("Moderating records...");
        setTotalAudio(getTotalAudio() + a);
        System.out.println("Classes.Records has been moderated. Total number of moderated records is " + getTotalAudio() + "\n");
    }

}
