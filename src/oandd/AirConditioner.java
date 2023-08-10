package oandd;

public class AirConditioner {
    private boolean isOn;
    private String name;
    private int temperature;

    public AirConditioner(String name){
        this.name = name;
    }

    public boolean isOn(){
        return true;
    }

    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }

    public void setProductName(String name){
        this.name = name;
    }

    public String getProductName(){
        return name;
    }

    public int increaseTemperature(int temp){
        return temperature += temp;
    }

    public int decreaseTemperature(int temperature){
        return temperature -= temperature;
    }


}
