package Enum.application;

import Enum.entitie.Order;
import Enum.entities.enums.OrderStatus;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DEVILERED;
        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");

        System.out.println(os2);
        System.out.println(os1);

    }
}
