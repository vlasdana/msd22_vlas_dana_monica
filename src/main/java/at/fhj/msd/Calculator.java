package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class calculator for math operations
 *
 * @author Dana Vlas
 */
public class Calculator {
    /**
     * logger is created to allow us to write logs using the static class Logger
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * @param number1 is the first argument
     * @param number2 is the second argument
     * @return double value of the sum of number1 + number2
     */
    public double add(double number1, double number2) {
        double sum = number1 + number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return sum;
    }
    /**
     * @param number1 is the first argument
     * @param number2 is the second argument
     * @return double value of number1 - number2
     */
    public double minus(double number1, double number2) {
        double dif = number1 - number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return dif;
    }

    /**
     *
     * @param number1 is the number to divide
     * @param number2 is the number to whom is divided the number1
     * @return double value of number1 divided to number2
     * @throws ArithmeticException when number2 is 0
     */
    public double divide(double number1, double number2) {
        logger.error("You have called with " + number1 + " , and " + number2);  // nu uita aici debug in loc de error
        if (number2 == 0) {
            logger.error("We can not divide with 0");
            throw new ArithmeticException();
        } else {
            double div = number1 / number2;
            return div;
        }


    }

    /**
     * @param number1 is the first argument
     * @param number2 is the second argument
     * @return double value of the multiplication of number1 * number2
     */
    public double multiply(double number1, double number2) {
        double produkt = number1 * number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return produkt;
    }
    /**
     * @param number is the first argument
     * @return double value of multiplying number * number -1
     */
    public double calcFaculty(double number) {
        double faculty = 1;
        logger.error("You have called with " + number);   // nu uita aici debug in loc de error
        while (number > 1) {
            faculty *= number--;
        }
        return faculty;
    }
}
