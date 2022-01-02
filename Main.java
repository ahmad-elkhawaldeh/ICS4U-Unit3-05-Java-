/*
* This program  vehicle class.
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-22
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;

    /**
    * Constant.
    */
    public static final int ONE_HUNDRED = 100;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final String NEW_SPEED = "New speed:";

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Vehicle Bmw = new Vehicle("white", "B40-C4RR0", FOUR, 200);

        System.out.println("Created BMW \nStatus:\n");
        Bmw.status();

        System.out.println("\nAccelerating, 10 of power for 10 sec.");
        Bmw.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED + Bmw.getSpeed());

        System.out.println("\nChanging colour to blue:");
        Bmw.setColour("blue");
        System.out.println("\nNew colour:" + Bmw.getColour());

        final Vehicle  lamborghini = new Vehicle("red", "AER-783", 2, 400);

        System.out.println("\ncreated a lamborghini\nStatus:\n");
         lamborghini.status();

        System.out.println("\nAccelerating, 100 of power for 4 sec.");
         lamborghini.accelerate(ONE_HUNDRED, FOUR);
        System.out.println(NEW_SPEED +  lamborghini.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
         lamborghini.accelerate(TEN, TEN);
        System.out.println(NEW_SPEED +  lamborghini.getSpeed());

        System.out.println("\nChanging license plate:");
         lamborghini.setLicensePlate("GGyt456");
        System.out.println("New License Plate: " + 
                           lamborghini.getLicensePlate());

        System.out.println("\nDone.");
    }
}
