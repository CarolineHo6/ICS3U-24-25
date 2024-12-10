package day2;

public class Lottery {
    private int numberOfNumbers;
    private int range;
    private String generatedNumbers;

    public Lottery(int numberOfNumbers, int range) {
        this.numberOfNumbers = numberOfNumbers;
        this.range = range;
        generatedNumbers = "";
    }

    public void generateUniqueNumbers() {
        for (int i = 0; i < numberOfNumbers; i++) {
            int random = (int) (Math.random()*range) + 1;
            String num = "" + random;
            if (generatedNumbers.indexOf(num) == -1) {
                generatedNumbers += num + " ";
            }
        }
        // trim the final string
    }
}
