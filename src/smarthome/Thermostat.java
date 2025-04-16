package smarthome;

public class Thermostat {
    private int currentTemp = 20;
    private int previousTemp = 20;

    public void setTemperature(int temperature) {
        previousTemp = currentTemp;
        currentTemp = temperature;
        System.out.println("[Thermostat] Устанавливаю температуру на " + temperature + "°C");
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Возврат к предыдущей температуре: " + previousTemp + "°C");
        currentTemp = previousTemp;
    }
}
