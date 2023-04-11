package Classes;

public class Records implements rec {
    private int numbers;
    private String date;
    private int size;

    public Records(int numbers, String date, int size) {
        this.numbers = numbers;
        this.date = date;
        this.size = size;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public void save(int a){
        System.out.println("Classes.Records are saving...\n");
        setNumbers(getNumbers() + a);
    }
    @Override
    public void delete(int a){
        System.out.println("Classes.Records are deleting...\n");
        setNumbers(getNumbers() - a);
    }
}
