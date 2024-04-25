package ru.itone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        ServiceB serviceB = context.getBean(ServiceB.class);
        serviceA.print("Hello from ServiceA");
        serviceB.print("Hello from ServiceB");
    }
}
