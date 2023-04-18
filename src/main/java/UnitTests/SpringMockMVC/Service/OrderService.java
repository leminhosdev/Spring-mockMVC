package UnitTests.SpringMockMVC.Service;

import UnitTests.SpringMockMVC.model.Order;

public class OrderService {
    private UserService userService;
    private PaymentService paymentService;

    public OrderService(Order order){
        boolean isUserMinor = userService.isUserMinor(order.getUserId());
        if(isUserMinor){
            throw new IllegalStateException("User can't be a minor");
        }
        paymentService.pay();
    }


}
