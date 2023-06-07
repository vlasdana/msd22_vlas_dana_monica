package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum: " + calc.add(3,7));
        System.out.println("Dif: " + calc.minus(10,3));
        System.out.println("Product: " + calc.multiply(5,5));
        System.out.println("Division: " + calc.divide(10,5));


    }
}
