package mandaria.net.jacocodemo;

import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class DemoTest extends
        ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    @SuppressLint("NewApi")
    public DemoTest() {
        super(MainActivity.class);
    }


    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    /*------ Test Core Function ------*/
    public void testOnAdd() throws Exception {
        solo.enterText(0, "10");
        solo.enterText(1, "2");
        solo.clickOnButton("+");
        boolean result = solo.searchText("12");
        assertTrue(result);
    }

//    /*--------------------------------*/
//    public void testOnMinus() throws Exception {
//        solo.enterText(0, "10");
//        solo.enterText(1, "2");
//        solo.clickOnButton("-");
//        boolean result = solo.searchText("8");
//        assertTrue(result);
//    }
//
//    public void testOnMulti() throws Exception {
//        solo.enterText(0, "10");
//        solo.enterText(1, "2");
//        solo.clickOnButton("*");
//        boolean result = solo.searchText("20");
//        assertTrue(result);
//    }
//
//    public void testOnDivide1() throws Exception {
//        solo.enterText(0, "10");
//        solo.enterText(1, "2");
//        solo.clickOnButton("/");
//        boolean result = solo.searchText("5");
//        assertTrue(result);
//    }
//
//    public void testOnDivide2() throws Exception {
//        solo.enterText(0, "10");
//        solo.enterText(1, "0");
//        solo.clickOnButton("/");
//        boolean result = solo.searchText("Error!!!");
//        assertTrue(result);
//    }
//
//    public void testOnInvalidInput() throws Exception {
//        solo.enterText(0, "as");
//        solo.enterText(1, "1");
//        solo.clickOnButton("+");
//        boolean result = solo.searchText("Invalid Input");
//        assertTrue(result);
//    }
    
}
