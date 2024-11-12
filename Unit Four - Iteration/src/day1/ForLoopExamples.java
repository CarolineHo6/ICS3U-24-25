package day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        // loops allow us to repeat code multiple times
        // this unit we will learn the for loop and the while loop.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("");

        // for loops are MEANT to count
        // they have an initial/starting value (above int i = 0) i is the counter
        // a condition to keep going/counting as long as it is true (i < 10)
        // how it counts (i++)

        // create for loops to print the numbers 10, 8, 6, 4, 2, 0, -2, -4 with no if statements

        for (int counter = 10; counter >= -4; counter -= 2){
            System.out.println(counter);
        }

        System.out.println("");
        // count the vowels in the String str that is all lowercase

        String str = "alphabet soup";
        String vowels = "aeiouAEEIOU";

        int numVowels = 0;
        for (int j = 0; j < str.length(); j++) {
            String letter = str.substring(j, j++);
            if (vowels.indexOf(letter) >= 0){
                numVowels++;
            }
        }
        System.out.println("There are " + numVowels + " vowels in " + str);
    }
}
