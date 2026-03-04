package Prcaticals;

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf("Time in HH:MM:SS format: %02d:%02d:%02d", hours, minutes, seconds);
        sc.close();
    }
}