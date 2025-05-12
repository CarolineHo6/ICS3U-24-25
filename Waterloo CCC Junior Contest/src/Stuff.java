

public class Stuff {
    public static void main(String[] args) {

    }

    public static String newsString(String word, String letter) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i).compareTo(letter) > 0) {
                result += word.substring(i, i+1);
            }
        }

        return result;
    }
}