package practice;

public class P1 {
    public static void main(String[] args) {
        createFrame(5,4);
        createTriangle(9);
        createTriangles(9);
    }
    

    /*
     * create a frame based on any measurements:
     *        *****
     *        *   *
     *        *   *
     *        *   *
     *        *****
     */
    public static void createFrame(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < height-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        } System.out.println();
    }

    /*
     * create a triangle any length:
     * ******
     * *****
     * ****
     * ***
     * **
     * *
     */
    public static void createTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * create a triangle any length:
     * *
     * **
     * ***
     * ****
     * *****
     */
    public static void createTriangles(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
