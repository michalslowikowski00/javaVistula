package math;
import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void DivisionNegativeNumber0(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((-32769 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeNumber0 is: " + divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeNumber1(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((-32768 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeNumber1 is: " + divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeNumber2(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((-32767 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeNumber2 is: " + divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionPositiveNumber0(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((32768 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == 1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result DivisionPositiveNumber0 is: " + divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionPositiveNumber1(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((32767 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == 1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionPositiveNumber1 is: " + divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionPositiveNumber2(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide((32766 + 1));
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == 1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result DivisionPositiveNumber2 is: " + divisionResult.DivideNumbers());
    }
}
