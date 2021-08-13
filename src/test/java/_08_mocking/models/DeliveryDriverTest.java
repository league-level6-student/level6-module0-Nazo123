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
    @Mock
    Engine engine;

    @Mock
    GasTank gasTank;
    
    @Mock
    String name;
    @Mock
    CellPhone cellphone;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        car = new Car(engine,gasTank);
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

        //when

        //then
    }

    @Test
    void itShouldContactCustomer() {
        //given

        //when

        //then
    }

}