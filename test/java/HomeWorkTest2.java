package mathTest;
import math.HomeWork2;
import org.junit.Test;

public class HomeWorkTests2 {

    @Test
    public void divisionInClass0() {
        HomeWork2 test0 = new HomeWork2();
        test0.setNumberForDivide((short) -32767);
        test0.setDivider((short) 30000);
        assert test0.divisionInClass() == -1:
                "Result should be " + test0.divisionInClass();
    }

    @Test
    public void divisionInClass1() {
        HomeWork2 test1 = new HomeWork2();
        test1.setNumberForDivide((short) -32766);
        test1.setDivider((short) 30000);
        assert test1.divisionInClass() == -1:
                "Result should be " + test1.divisionInClass();
    }

    @Test
    public void divisionInClass2() {
        HomeWork2 test2 = new HomeWork2();
        test2.setNumberForDivide((short) -1);
        test2.setDivider((short) 30000);
        assert test2.divisionInClass() == 0:
                "Result should be " + test2.divisionInClass();
    }

    @Test
    public void divisionInClass3() {
        HomeWork2 test3 = new HomeWork2();
        test3.setNumberForDivide((short) 0);
        test3.setDivider((short) 30000);
        assert test3.divisionInClass() == 0:
                "Result should be " + test3.divisionInClass();
    }

    @Test
    public void divisionInClass4() {
        HomeWork2 test4 = new HomeWork2();
        test4.setNumberForDivide((short) 1);
        test4.setDivider((short) 30000);
        assert test4.divisionInClass() == 0:
                "Result should be " + test4.divisionInClass();
    }

    @Test
    public void divisionInClass5() {
        HomeWork2 test5 = new HomeWork2();
        test5.setNumberForDivide((short) 32766);
        test5.setDivider((short) 30000);
        assert test5.divisionInClass() == 1:
                "Result should be " + test5.divisionInClass();
    }

    @Test
    public void divisionInClass6() {
        HomeWork2 test6 = new HomeWork2();
        test6.setNumberForDivide((short) 32767);
        test6.setDivider((short) 30000);
        assert test6.divisionInClass() == 1:
                "Result should be " + test6.divisionInClass();
    }


}
