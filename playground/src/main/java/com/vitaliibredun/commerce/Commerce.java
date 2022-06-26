package com.vitaliibredun.commerce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.xml.catalog.CatalogFeatures.Feature;
import org.apache.commons.lang3.RandomStringUtils;

public class Commerce {

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        OrderIdGenerator orderIdGenerator = new OrderIdGenerator(10);
        OrderRepository repo = new OrderRepository();
        OrderService service = new OrderService(orderIdGenerator, repo);

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Order order = service.create(new Order("+7" + RandomStringUtils.randomNumeric(10)));
                    TimeUnit.MILLISECONDS.sleep(1500);
                    service.confirm(order);
                } catch (Exception ignored) {
                }
            });
        }
    }
}
