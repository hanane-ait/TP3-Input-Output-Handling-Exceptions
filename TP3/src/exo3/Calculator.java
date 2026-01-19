package exo3;

public class Calculator {

    // Méthode 1 : division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    // Méthode 2 : convertir un texte en nombre
    public int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    // Méthode 3 : calcul selon l'opération
    public double calculate(char operation, double a, double b) {
        switch (operation) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return divide(a, b);

            default:
                System.out.println("Error: Operation '" + operation + "' not supported");
                return 0;
        }
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.divide(10, 2));   // OK
        System.out.println(calc.divide(10, 0));   // Erreur

        System.out.println(calc.convertToNumber("123")); // OK
        System.out.println(calc.convertToNumber("abc")); // Erreur

        System.out.println(calc.calculate('+', 5, 3));  // OK
        System.out.println(calc.calculate('&', 5, 3));  // Erreur
    }
}
