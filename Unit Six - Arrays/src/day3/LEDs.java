package day3;

public class LEDs {

    // Attributes
    private boolean isOn;
    private String colour;

    // Constant array of available colours
    public static final String[] AVAILABLE_COLOURS = {"RED", "GREEN", "BLUE", "YELLOW"};

    // Constructor
    public LEDs(String colour) {
        if (isValidColour(colour)) {
            this.colour = colour.toUpperCase();
        } else {
            throw new IllegalArgumentException("Invalid colour. Available colours are: RED, GREEN, BLUE, YELLOW.");
        }
        this.isOn = false;
    }

    // Getter for isOn
    public boolean isOn() {
        return isOn;
    }

    // Setter for isOn
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    // Getter for colour
    public String getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(String colour) {
        if (isValidColour(colour)) {
            this.colour = colour.toUpperCase();
        } else {
            throw new IllegalArgumentException("Invalid colour. Available colours are: RED, GREEN, BLUE, YELLOW.");
        }
    }

    // Method to display the colour of the light if it is on
    public String displayColour() {
        if (isOn) {
            switch (colour) {
                case "RED":
                    return "R";
                case "GREEN":
                    return "G";
                case "BLUE":
                    return "B";
                case "YELLOW":
                    return "Y";
                default:
                    return ""; // Should never reach here if colour validation is proper
            }
        } else {
            return ""; // Blank if off
        }
    }

    // Private helper method to validate if a colour is available
    private boolean isValidColour(String colour) {
        for (String c : AVAILABLE_COLOURS) {
            if (c.equalsIgnoreCase(colour)) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing (Optional)
    public static void main(String[] args) {
        LEDs led = new LEDs("RED");
        System.out.println("Initial state: " + led.displayColour()); // Should display blank
        led.setOn(true);
        System.out.println("After turning on: " + led.displayColour()); // Should display R
        led.setColour("GREEN");
        System.out.println("After changing to GREEN: " + led.displayColour()); // Should display G
    }
}
