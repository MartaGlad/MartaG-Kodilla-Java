package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double getAverageTemperature() {
        double sum = 0.0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double getMedianTemperature() {
        List<Double> vals = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(vals);
        if(vals.size() % 2 == 0) {
            return (vals.get(vals.size()/2-1) + vals.get(vals.size()/2)) / 2;
        }
        else {
            return vals.get(vals.size()/2);
        }
    }
}
