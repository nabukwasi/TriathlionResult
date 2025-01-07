/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vucoursework.triathlonmanagementsystem;

/**
 *
 * @author USER
 */
// EliteParticipant.java

public class EliteParticipant extends Participant {
    private String sponsorName;

    public EliteParticipant(String name, int id, int swimmingTime, int cyclingTime, int runningTime, String sponsorName) {
        super(name, id, swimmingTime, cyclingTime, runningTime);
        this.sponsorName = sponsorName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sponsor: " + sponsorName);
    }
}
