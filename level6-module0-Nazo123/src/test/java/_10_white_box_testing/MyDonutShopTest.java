package _10_white_box_testing;

import _09_intro_to_white_box_testing.models.DeliveryService;
import _09_intro_to_white_box_testing.models.Order;
import _10_white_box_testing.models.BakeryService;
import _10_white_box_testing.models.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import _08_mocking.models.CellPhone;
import _08_mocking.models.DeliveryDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.awt.List;
import java.util.ArrayList;

class MyDonutShopTest {

    MyDonutShop myDonutShop;
    PaymentService paymentService;
    DeliveryService deliveryService;
    BakeryService bakeryService;
    ArrayList<DeliveryDriver> lists = new ArrayList<DeliveryDriver>();
    @BeforeEach
    void setUp() {
    	paymentService = new PaymentService();
    	for(int i = 0; i < 3;i++) {
    		lists.add(new DeliveryDriver("e", new cellPhone(),
                    true,
                    true,
                    false));
    	}
    	deliveryService = new DeliveryService(null);
    	
        myDonutShop = new MyDonutShop(paymentService,deliveryService,bakeryService);
    }

    @Test
    void itShouldTakeDeliveryOrder() throws Exception {
        //given
    	Order order = new Order("E", "2", 5,1, "12321", true);
    	myDonutShop.openForTheDay();

        //when
    	myDonutShop.takeOrder(order);
        //then
    	verify(deliveryService, times(1)).deliver();
    }

    @Test
    void givenInsufficientDonutsRemaining_whenTakeOrder_thenThrowIllegalArgumentException() {
        //given
    	
        //when

        //then
    }

    @Test
    void givenNotOpenForBusiness_whenTakeOrder_thenThrowIllegalStateException(){
        //given
    	
        //when

        //then
    }

}