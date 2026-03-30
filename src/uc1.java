/**
 * =============================================================
 * ABSTRACT CLASS - Room
 * =============================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This abstract class represents a generic hotel room.
 * It defines common attributes shared by all room types.
 *
 * Inventory-related concerns are intentionally excluded.
 *
 * @version 2.1
 */
public abstract class Room {

    /** Number of beds available in the room */
    protected int numberOfBeds;

    /** Total size of the room in square feet */
    protected int squareFeet;

    /** Price charged per night */
    protected double pricePerNight;

    /**
     * Constructor used by child classes
     */
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    /** Displays room details */
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price per night: $" + pricePerNight);
    }
}