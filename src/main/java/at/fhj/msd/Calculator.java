package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    public double add(double number1, double number2){
        double sum = number1 + number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return sum;
    }

    public double minus(double number1, double number2){
        double dif = number1 - number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return dif;
    }

    public double divide(double number1, double number2){
        logger.error("You have called with " + number1 + " , and " + number2);  // nu uita aici debug in loc de error
        if(number2 == 0){
            logger.error("We can not divide with 0");
            return 0;
        }else{
            double div = number1 / number2;
            return div;
        }


    }

    public double multiply(double number1, double number2){
        double produkt = number1 * number2;
        logger.error("You have called with " + number1 + " , and " + number2); // nu uita aici debug in loc de error
        return produkt;
    }
    public double calcFaculty(double number){
        double faculty = 1;
        logger.error("You have called with " + number );   // nu uita aici debug in loc de error
        while(number > 1){
            faculty *= number--;
        }
        return faculty;
    }
}
