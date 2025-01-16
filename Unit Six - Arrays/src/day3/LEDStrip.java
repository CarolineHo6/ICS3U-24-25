package day3;

public class LEDStrip {

    // Attributes
    private LED[] leds;
    private String pattern;

    // Constant array of available patterns
    public static final String[] AVAILABLE_PATTERNS = { "RANDOM", "ALTERNATE", "RED", "YELLOW", "GREEN", "BLUE" };

    // Constructor stub
    public LEDStrip(String pattern, int numberOfLEDs) {
        leds = new LED[numberOfLEDs];
        setPattern(pattern);
    }

    // Method stub to count and return the number of LEDs that are not on
    public int countLEDsNotOn() {
        int numOff = 0;
        for (LED led : leds) {
            if (led.isOn()) {
                numOff++;
            }
        }
        return numOff;
    }

    // Method stub to count the number of LEDs of a particular colour
    public int countLEDsByColour(String colour) {
        int numColour = 0;
        for (LED led : leds) {
            if (!led.getColour().equals(colour)) {
                numColour++;
            }
        }
        return numColour;
    }

    // Getter for pattern (stub only)
    public String getPattern() {
        return pattern;
    }

    // Setter for pattern (stub only)
    public void setPattern(String pattern) {
        this.pattern = pattern;
        int maxColourIndex = LED.AVAILABLE_COLOURS.length;
        int currentIndex = 0;

        // gotta set the leds
        for (int i = 0; i < leds.length; i++) {
            if (pattern.equals("red")) {
                leds[i] = new LED("RED");
            } else if (pattern.equals("blue")) {
                leds[i] = new LED("BLUE");
            } else if (pattern.equals("yellow")) {
                leds[i] = new LED("YELLOW");
            } else if (pattern.equals("green")) {
                leds[i] = new LED("GREEN");
            } else if (pattern.equals("random")) {
                String randomColour = LED.AVAILABLE_COLOURS[(int) (Math.random() * LED.AVAILABLE_COLOURS.length)];
                leds[i] = new LED(randomColour);
            } else {
                leds[i] = new LED(LED.AVAILABLE_COLOURS[currentIndex]);
                currentIndex++;
                if (currentIndex == maxColourIndex) {
                    currentIndex = 0;
                }
            }
        }
    }

    public void display() {
        for (LED led : leds) {
            led.displayColour();
        }
    }

    public void turnOnLEDs() {
        for (LED led : leds) {
            led.setOn(true);
        }
    }

    public void turnOffLEDs() {
        for (LED led : leds) {
            led.setOn(false);
        }
    }
}
