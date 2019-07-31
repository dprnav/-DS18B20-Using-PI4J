import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.io.w1.W1Master;
import com.pi4j.temperature.TemperatureScale;

import java.io.IOException;

public class W1TempExample {

    public static void main(String args[]) throws InterruptedException, IOException {
        W1Master w1Master = new W1Master();

        TemperatureSensor device = w1Master.getDevices(TemperatureSensor.class).get(0);
        String temp = String.format("%3.1f°C \n%3.1f°F\n", device.getTemperature(),device.getTemperature(TemperatureScale.FARENHEIT));
        System.out.println(temp);

    }
}
