package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Searching {

   public Boolean findFlight(Flight flight) throws RouteNotFoundException {

       Boolean isAvailable;

       Map<String, Boolean> availabilityMap = new HashMap<>();
       availabilityMap.put("Airport1", true);
       availabilityMap.put("Airport2", true);
       availabilityMap.put("Airport3", true);
       availabilityMap.put("Airport4", true);
       availabilityMap.put("Airport5", true);
       availabilityMap.put("Airport6", false);
       availabilityMap.put("Airport7", false);
       availabilityMap.put("Airport8", false);
       availabilityMap.put("Airport9", false);
       availabilityMap.put("Airport10", false);

       if (availabilityMap.containsKey(flight.getDepartureAirport())
               && availabilityMap.containsKey(flight.getArrivalAirport())) {

           isAvailable = (availabilityMap.get(flight.getDepartureAirport())
                   && availabilityMap.get(flight.getArrivalAirport()));

           return isAvailable;

       } else {
           throw new RouteNotFoundException();
       }
   }

    public static void main(String[] args) {

        Searching searching = new Searching();

        try {
            var isAvailable = searching.findFlight(new Flight("Airport4", "Airport5"));
            var found = isAvailable ? "dostępny" : "niedostępny";

            System.out.println("Szukany lot jest: " + found);

        } catch (RouteNotFoundException e) {
            System.out.println("Nie znaleziono takiej trasy!");
        }

        finally {
            System.out.println("Dziękujemy za skorzystanie z wyszukiwarki!");
        }

    }

}
