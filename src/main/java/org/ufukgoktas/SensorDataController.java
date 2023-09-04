package org.ufukgoktas;

import com.google.gson.Gson;

public class SensorDataController {
    public static void main(String[] args) {

        SensorData sensor1Data = SensorDataProvider.generateSensorData("Sensor1", -5, 1, -1, 5);
        SensorData sensor2Data = SensorDataProvider.generateSensorData("Sensor2", 5, -1, -1, 5);


        Gson gson = new Gson();
        String data1 = gson.toJson(sensor1Data);
        String data2 = gson.toJson(sensor2Data);


        KafkaSensorDataProducer producer = new KafkaSensorDataProducer();
        producer.sendSensorData("sensor_data", "sensor1", data1);
        producer.sendSensorData("sensor_data", "sensor2", data2);
        producer.close();
    }
}
