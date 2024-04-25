package ru.itone;

public class ServiceB {
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void print(String message) {
        System.out.println("ServiceB: " + message);
    }
}

