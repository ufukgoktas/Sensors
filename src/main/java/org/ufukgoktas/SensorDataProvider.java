package org.ufukgoktas;

import com.google.gson.Gson;

public class SensorDataProvider {
    public static SensorData generateSensorData(String sensorName, int sensorX, int sensorY, int targetX, int targetY) {
        int deltaX = targetX - sensorX;
        int deltaY = targetY - sensorY;
        double angle = Math.toDegrees(Math.atan2(deltaY, deltaX));


        SensorData sensorData = new SensorData(sensorName, angle, sensorX, sensorY);

        return sensorData;
    }
}
