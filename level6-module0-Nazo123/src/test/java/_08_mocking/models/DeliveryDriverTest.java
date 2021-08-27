package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import _07_intro_to_mocking.models.Engine;
import _07_intro_to_mocking.models.GasTank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

   

    DeliveryDriver deliveryDriver;
    Car car;
    
    String name;
    
    CellPhone cellphone;
    @BeforeEach
    void setUp() {
    	name = "bob";
    	car = new Car(new Engine(0, 0, 0, 0, 0), new GasTank());
    	cellphone = new CellPhone();
    	deliveryDriver = new DeliveryDriver(name,car,cellphone);
    }


    @Test
    void itShouldWasteTime() {
        //given
    	boolean a = true;
        //when
    	boolean b = deliveryDriver.wasteTime();
        //then
    	assertEquals(a,b);
    }

    @Test
    void itShouldRefuel() {
        //given
    	double test = car.getFuelLevel();
        //when
    	deliveryDriver.refuel(2);
    	double x = car.getFuelLevel()-2.0;
    	
        //then
    	assertEquals(x,test,0.01);
    }

    @Test
    void itShouldContactCustomer() {
        //given

        //when

        //then
    }

}