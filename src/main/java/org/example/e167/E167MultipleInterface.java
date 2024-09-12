package org.example.e167;


public class E167MultipleInterface {
    public static void main(String[] args){

        SmartDevice device = new SmartDevice();
        device.basicFunctionality();
        device.advancedFunctionality();
    }
}

interface BaseDeviceInterface {
    void basicFunctionality();
}
interface AdvancedDeviceInterface extends BaseDeviceInterface {
    void advancedFunctionality();
}
class SmartDevice implements AdvancedDeviceInterface {
    @Override
    public void basicFunctionality() {
        System.out.println("Basic Functionality: Device is turning on");
    }
    @Override
    public void advancedFunctionality() {
        System.out.println("Advanced Functionality: Device is adjusting settings");
    }
}
