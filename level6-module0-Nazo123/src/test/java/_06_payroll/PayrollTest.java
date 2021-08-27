package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyPay = 20.55;
    	int hours = 25;
    	double expected = 513.75;
        //when
    	double realResult = payroll.calculatePaycheck(hourlyPay, hours);
        //then
    	assertEquals(realResult,expected);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTravled = 22;
    	double expected = 12.65;
        //when
    	double result = payroll.calculateMileageReimbursement(milesTravled);
        //then
    	assertEquals(result, expected,0.01);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String name = "Nazo";
    	double hourlyWage = 0.5; 
    	String expected = "Hello Nazo, We are pleased to offer you an hourly wage of 0.5";
        //when
    	String result = payroll.createOfferLetter(name, hourlyWage);
        //then
    	assertEquals(expected, result);
    }

}