package math;
import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void DivisionNegativeValue1(){
        HomeWork divisionResult = new HomeWork((short) -32768, (short) 30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue1 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue2(){
        HomeWork divisionResult = new HomeWork((short) -32767, (short) 30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue2 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue3(){
        HomeWork divisionResult = new HomeWork((short) -1, (short) 30000);
        assert divisionResult.DivideNumbers() == 0:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue3 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue4(){
        HomeWork divisionResult = new HomeWork((short) 0, (short) 30000);
        assert divisionResult.DivideNumbers() == 0:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue4 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue5(){
        HomeWork divisionResult = new HomeWork((short) 1, (short) 30000);
        assert divisionResult.DivideNumbers() == 0:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue5 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue6(){
        HomeWork divisionResult = new HomeWork((short) 32767, (short) 30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue6 is: " +
                divisionResult.DivideNumbers());
    }

    @Test
    public void DivisionNegativeValue7(){
        HomeWork divisionResult = new HomeWork((short) 32766, (short) 30000);
        assert divisionResult.DivideNumbers() == 1:
                "Result should be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result of DivisionNegativeValue7 is: " +
                divisionResult.DivideNumbers());
    }
}




