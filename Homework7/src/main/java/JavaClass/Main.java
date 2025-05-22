package JavaClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Vehicle {
    private String brand;
    private boolean emergencyVehicle;
    private double weight;

    public Vehicle(String brand, boolean emergencyVehicle, double weight) {
        this.brand = brand;
        this.emergencyVehicle = emergencyVehicle;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isEmergencyVehicle() {
        return emergencyVehicle;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", emergencyVehicle=" + emergencyVehicle +
                ", weight=" + weight +
                '}';
    }
}

class VehicleServiceImpl {
    public Comparator<Vehicle> comparatorByWeight() {
        return (v1, v2) -> Double.compare(v2.getWeight(), v1.getWeight()); // heavier first
    }

    public Comparator<Vehicle> comparatorByEmergency() {
        return (v1, v2) -> Boolean.compare(v2.isEmergencyVehicle(), v1.isEmergencyVehicle());
    }

    public void removeVehiclesByWeight(List<Vehicle> vehicles) {
        PriorityQueue<Vehicle> queue = new PriorityQueue<>(comparatorByWeight());
        queue.addAll(vehicles);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public void removeVehiclesByEmergency(List<Vehicle> vehicles) {
        PriorityQueue<Vehicle> queue = new PriorityQueue<>(comparatorByEmergency());
        queue.addAll(vehicles);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public void removeVehiclesFifo(List<Vehicle> vehicles) {
        Queue<Vehicle> queue = new LinkedList<>(vehicles);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public void removeVehiclesLifo(List<Vehicle> vehicles) {
        Stack<Vehicle> stack = new Stack<>();
        for (Vehicle v : vehicles) {
            stack.push(v);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

