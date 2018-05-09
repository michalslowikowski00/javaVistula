package math;

public class HomeWork2 {
    private short numberForDivide;
    private short divider;

    public short getNumberForDivide() {
        return numberForDivide;
    }

    public void setNumberForDivide(short numberForDivide) {
        this.numberForDivide = numberForDivide;
    }

    public short getDivider() {
        return divider;
    }

    public void setDivider(short divider) {
        this.divider = divider;
    }

    public HomeWork2() {

    }

    public short divisionInClass(){
        return (short)((numberForDivide + 1) / divider);
    }
}
