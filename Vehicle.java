/*
* This program is a Vehicle class.
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-22
*/

/**
 * Vehicle.
 */
public class Vehicle {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * MaxSpeed variable.
    */
    private int maxSpeed;

    /**
    * Door number variable.
    */
    private int doorNum;

    /**
    * Colour variable.
    */
    private String colour;

    /**
    * Licence plate variable.
    */
    private String licensePlate;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param inicialPlate plate
    * @param inicialDoor door
    * @param topSpeed speed
    */
    public Vehicle(final String inicialColour, final String inicialPlate,
                        final int inicialDoor, final int topSpeed) {
        this.colour = inicialColour;
        this.licensePlate = inicialPlate;
        this.doorNum = inicialDoor;
        this.maxSpeed = topSpeed;
        this.speed = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getDoorNum() {
        return this.doorNum;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
    * Setter.
    *
    * @param newColour good
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
    * Setter.
    *
    * @param newPlate good
    */
    public void setLicensePlate(final String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Print all.
    */
    public void status() {
        System.out.println("Speed: " + speed + "\nMaxSpeed: " + maxSpeed
                           + "\nNumber of doors: " + doorNum
                           + "\nLicense Plate: " + licensePlate + "\nColour: "
                           + colour);
    }

    /**
    * Accelerate.
    *
    * @param accPow power of acceleration
    * @param accTime time of acceleration
    */
    public void accelerate(final int accPow, final int accTime) {
        this.speed = (accPow * accTime) + this.speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
    * Breake.
    *
    * @param breakPow break power
    * @param breakTime time of break
    */
    public void breake(final int breakPow, final int breakTime) {
        this.speed = this.speed - (breakPow * breakTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
