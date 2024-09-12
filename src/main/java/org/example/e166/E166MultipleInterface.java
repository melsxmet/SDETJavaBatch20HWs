package org.example.e166;

public class E166MultipleInterface {
    public static void main(String[] args) {

        SmartHomeDevice device = new SmartHomeDevice();
        device.turnOn();
        device.configure();
    }
}

interface Controllable {
    void turnOn();
}
interface Configurable {
    void configure();
}
class SmartHomeDevice implements Controllable, Configurable {
    @Override
    public void turnOn() {
        System.out.println("Turning on Smart Home Device");
    }
    @Override
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");
    }
}
