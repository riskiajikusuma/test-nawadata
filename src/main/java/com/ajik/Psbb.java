package com.ajik;

import java.util.Scanner;

public class Psbb {

    public void result(Scanner scanner) {
        System.out.print("Input the number of families : ");
        int families = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Input the number of members in the family (separated by a space) : ");
        String[] familySizes = scanner.nextLine().split(" ");

        if (families != familySizes.length) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int[] familyMembers = new int[families];
        for (int i = 0; i < families; i++) {
            familyMembers[i] = Integer.parseInt(familySizes[i]);
        }

        System.out.println("Minimum bus required is : " + calculateMinimumBuses(familyMembers));
    }

    private static int calculateMinimumBuses(int[] familyMembers) {
        int buses = 0;
        int currentBusCapacity = 0;
        int familiesInCurrentBus = 0;

        for (int members : familyMembers) {
            if (members > 4) {
                buses += (members / 4) + (members % 4 != 0 ? 1 : 0);
            } else {
                if (currentBusCapacity + members > 4 || familiesInCurrentBus == 2) {
                    buses++;
                    currentBusCapacity = members;
                    familiesInCurrentBus = 1;
                } else {
                    currentBusCapacity += members;
                    familiesInCurrentBus++;
                }
            }
        }

        if (currentBusCapacity > 0) {
            buses++;
        }

        return buses;
    }
}
