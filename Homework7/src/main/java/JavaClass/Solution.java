package JavaClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> brandList = Arrays.asList(bufferedReader.readLine().trim().split(" "));
        List<Boolean> emergencyList = Arrays.stream(bufferedReader.readLine().trim().split(" "))
                .map(e -> Integer.parseInt(e) != 0)
                .toList();
        List<Double> weightList = Arrays.stream(bufferedReader.readLine().trim().split(" "))
                .map(Double::parseDouble)
                .toList();

        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < brandList.size(); i++) {
            vehicles.add(new Vehicle(brandList.get(i), emergencyList.get(i), weightList.get(i)));
        }

        VehicleServiceImpl service = new VehicleServiceImpl();

        service.removeVehiclesByWeight(vehicles);
        System.out.println();

        service.removeVehiclesByEmergency(vehicles);
        System.out.println();

        service.removeVehiclesFifo(vehicles);
        System.out.println();

        service.removeVehiclesLifo(vehicles);

        bufferedReader.close();
    }
}
