public class CatsAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
           
        if (Math.abs(z-x) == Math.abs(z-y)) {
            return "Mouse C";
        }
        else if (Math.abs(z-x) > Math.abs(z-y)) {
            return "Cat B";
        }
        else {
            return "Cat A";
        }

    }
}