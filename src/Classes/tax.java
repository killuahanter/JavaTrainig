package Classes;

public abstract class tax {
    private int percent;

    public tax(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int payment(int payment){
        return (payment / 100 * percent) + payment;
    }
}

//Создал абстрактный класс но пока не знаю как его поместить в систему, но думаю добавить систему оплаты через банки
