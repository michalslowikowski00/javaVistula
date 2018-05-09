package math;

public class HomeWork {
    private short numberToDivide;
    private short divider;

    public HomeWork(short numberToDivide, short divider) {
        this.numberToDivide = numberToDivide;
        this.divider = divider;

    }

    public short getNumberToDivide() {

        return numberToDivide;
    }

    public void setNumberToDivide(short numberToDivide) {

        this.numberToDivide = numberToDivide;
    }

    public short getDivider() {

        return divider;
    }

    public void setDivider(short divider) {

        this.divider = divider;
    }

    public short DivideNumbers(){
        return (short)((numberToDivide+1)/divider);
    }
}
