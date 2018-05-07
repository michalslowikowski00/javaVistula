package math;
import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void DivisionResult(){
        HomeWork divisionResult = new HomeWork();
        divisionResult.setNumberToDivide(-32768);
        divisionResult.setDivider(30000);
        assert divisionResult.DivideNumbers() == -1:
                "Result shoud be: " + divisionResult.DivideNumbers();
        System.out.println("Correct result is: " + divisionResult.DivideNumbers());

    }

}
