package info.gezielcarvalho.desafio01.services;

import info.gezielcarvalho.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() * (1 - order.getDiscount()/100) + shippingService.shipment(order);
    }
}
