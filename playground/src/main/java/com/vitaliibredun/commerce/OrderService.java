package com.vitaliibredun.commerce;

public class OrderService {
    private final OrderIdGenerator idGenerator;
    private final OrderRepository repo;

    public OrderService(OrderIdGenerator idGenerator, OrderRepository repo) {
        this.idGenerator = idGenerator;
        this.repo = repo;
    }

    public Order create(Order order) {
        order.setId(idGenerator.generate());
        order.setStatus("new");
        Order savedOrder = repo.save(order);
        System.out.printf("new order created: %s \n", order.toString());
        return savedOrder;
    }

    public void confirm(Order order) {
        order.setStatus("confirmed");
        repo.save(order);
        System.out.printf("order %s confirmed \n", order.getId());
    }
}
