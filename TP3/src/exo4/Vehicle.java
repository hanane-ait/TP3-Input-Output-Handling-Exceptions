package exo4;
public class Vehicle {

    // Constructeur vide
    public Vehicle() {
    }

    // Méthode testSpeed
    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        } else {
            System.out.println("Speed is acceptable: " + speed);
        }
    }

    // Méthode main
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        try {
            v.testSpeed(70);   // OK
            v.testSpeed(120);  // Exception
        } catch (TooFastException e) {
            e.printStackTrace(); // Affiche la pile d'appel (call stack)
        }
    }
}
