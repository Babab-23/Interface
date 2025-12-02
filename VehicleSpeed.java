// VehicleSpeed.java

import java.util.Scanner;

public class VehicleSpeed {

    // Method to get speed based on gear
    public static int getSpeed(int gear, boolean brake) {
        int speed;

        switch (gear) {
            case 0: speed = 0; break;       // Neutral
            case 1: speed = 20; break;
            case 2: speed = 40; break;
            case 3: speed = 60; break;
            case 4: speed = 80; break;
            case 5: speed = 100; break;
            default: speed = -1;            // Invalid gear
        }

        // If brake is pressed, speed becomes 0
        if (brake && speed != -1) {
            speed = 0;
        }

        return speed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter gear (0–5): ");
        int gear = input.nextInt();

        System.out.print("Is brake applied? (true/false): ");
        boolean brake = input.nextBoolean();

        int speed = getSpeed(gear, brake);

        if (speed == -1) {
            System.out.println("Invalid gear selected.");
        } else if (speed == 0 && brake) {
            System.out.println("Brake applied. Vehicle speed: 0 km/h");
        } else {
            System.out.println("Vehicle speed: " + speed + " km/h");
        }

        input.close();
    }
}

