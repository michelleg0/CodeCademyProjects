public class BuildADroid {

    public BuildADroid() {
        // Constructor with no parameters
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulo(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {
        
        BasicCalculator myCalculator = new BasicCalculator();
        // Call static methods using the class name
        System.out.println(BasicCalculator.add(5, 7));
    }
}
