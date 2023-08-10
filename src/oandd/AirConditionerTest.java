package oandd;

public class AirConditionerTest {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("Samsung");

        airConditioner.isOn();
        airConditioner.setOn(true);
        airConditioner.setTemperature(16);
        System.out.println(airConditioner.getProductName());
        System.out.println(airConditioner.getTemperature());
        airConditioner.increaseTemperature(5);
        System.out.println(airConditioner.getTemperature());
    }
}
