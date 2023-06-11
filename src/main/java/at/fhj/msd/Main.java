package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calc = new Calculator();



        logger.info("It is a info logger.");

        System.out.println("Sum: " + calc.add(3,7));
        System.out.println("Dif: " + calc.minus(10,3));
        System.out.println("Product: " + calc.multiply(5,5));
        System.out.println("Division: " + calc.divide(10,5));
        logger.error("It is an error logger.");

    }
}
