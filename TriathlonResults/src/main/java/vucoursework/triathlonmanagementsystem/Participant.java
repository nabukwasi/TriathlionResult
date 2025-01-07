/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vucoursework.triathlonmanagementsystem;

/**
 *
 * @author USER
 */
// File: Participant.java

public class Participant {
    private String name;
    private int id;
    private int swimmingTime;
    private int cyclingTime;
    private int runningTime;

    public Participant(String name, int id, int swimmingTime, int cyclingTime, int runningTime) {
        if (swimmingTime < 0 || cyclingTime < 0 || runningTime < 0) {
            throw new IllegalArgumentException("Times cannot be negative.");
        }
        this.name = name;
        this.id = id;
        this.swimmingTime = swimmingTime;
        this.cyclingTime = cyclingTime;
        this.runningTime = runningTime;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSwimmingTime() {
        return swimmingTime;
    }

    public int getCyclingTime() {
        return cyclingTime;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setSwimmingTime(int swimmingTime) {
        if (swimmingTime < 0) {
            throw new IllegalArgumentException("Swimming time cannot be negative.");
        }
        this.swimmingTime = swimmingTime;
    }

    public void setCyclingTime(int cyclingTime) {
        if (cyclingTime < 0) {
            throw new IllegalArgumentException("Cycling time cannot be negative.");
        }
        this.cyclingTime = cyclingTime;
    }

    public void setRunningTime(int runningTime) {
        if (runningTime < 0) {
            throw new IllegalArgumentException("Running time cannot be negative.");
        }
        this.runningTime = runningTime;
    }

    public int calculateTotalTime() {
        return swimmingTime + cyclingTime + runningTime;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Time: " + calculateTotalTime() + " minutes");
    }
}
