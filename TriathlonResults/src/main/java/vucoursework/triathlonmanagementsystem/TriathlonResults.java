/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vucoursework.triathlonmanagementsystem;

/**
 *
 * @author USER
 */
// File: TriathlonResults.java

import java.util.*;

public class TriathlonResults {
    private List<Participant> participants;

    public TriathlonResults() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void displayRankings() {
        participants.sort(Comparator.comparingInt(Participant::calculateTotalTime));

        System.out.println("Rankings:");
        for (int i = 0; i < participants.size(); i++) {
            Participant p = participants.get(i);
            System.out.println((i + 1) + ". " + p.getName() + " - Total Time: " + p.calculateTotalTime() + " minutes");
        }

        if (participants.size() >= 2) {
            System.out.println("Fastest Participant: " + participants.get(0).getName() + " - " + participants.get(0).calculateTotalTime() + " minutes");
            System.out.println("Second Fastest Participant: " + participants.get(1).getName() + " - " + participants.get(1).calculateTotalTime() + " minutes");
        }
    }

    public static void main(String[] args) {
        TriathlonResults results = new TriathlonResults();

        results.addParticipant(new EliteParticipant("Alice", 1, 25, 40, 20, "Company A"));
        results.addParticipant(new BeginnerParticipant("Bob", 2, 20, 35, 25));
        results.addParticipant(new EliteParticipant("Charlie", 3, 30, 50, 30, "Company B"));
        results.addParticipant(new BeginnerParticipant("Diana", 4, 28, 42, 18));

        results.displayRankings();
    }
}
