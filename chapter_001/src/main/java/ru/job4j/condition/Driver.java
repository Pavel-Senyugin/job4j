package ru.job4j.condition;
/**
 * Class Condition Driver.
 *@author senyugin.
 *@since 10.03.2019
 */

public class Driver {
    private char license = 'N';

    public void pasExamOn(char category) {

        this.license = category;
    }
    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }
    public boolean canDrive(char category) {
        return this.license == category;
    }
    public static class TruckerJob {
        public static void main(String[] args) {
            Driver steve = new Driver();
            System.out.println("Steve wants the trucker job.");
            if (!steve.hasLicense()) {
                System.out.println("Steve need to get a license!");
                steve.pasExamOn('A');
            }
            if (steve.canDrive('C')) {
                System.out.println("Steve works on truckers!");
            } else if (steve.canDrive('B')) {
                System.out.println("Steve works in taxi.");
            } else {
                System.out.println("Steve does not have a job, but ride on motorbike!");
            }
        }

    }
}
