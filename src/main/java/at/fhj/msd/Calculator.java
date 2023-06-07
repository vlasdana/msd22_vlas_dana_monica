package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        double sum = number1 + number2;
        return sum;
    }

    public double minus(double number1, double number2){
        double dif = number1 - number2;
        return dif;
    }

    public double divide(double number1, double number2){
        double div = number1 / number2;
        return div;
    }

    public double multiply(double number1, double number2){
        double produkt = number1 * number2;
        return produkt;
    }
    public double calcFaculty(double number){
        double faculty = 1;
        while(number > 1){
            faculty *= number--;
        }
        return 0;
    }
}
