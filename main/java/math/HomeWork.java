package math;

public class HomeWork {
    int numberToDivide;
    int divider;


    public int getNumberToDivide() {
        return numberToDivide;
    }

    public void setNumberToDivide(int numberToDivide) {
        this.numberToDivide = numberToDivide;
    }

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    public HomeWork() {

    }

    public int DivideNumbers(){
        return numberToDivide / divider;
    }
}
