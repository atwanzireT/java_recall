package opp;

/**
 * Overloading
 */
public class Displayer {
    public void displayName(String name) {
        System.out.println("Come on " + name);
    }

    /**
     * @param firstName
     * @param lastName
     */
    public void displayName(String firstName, String lastName){
        System.out.println("Come on " + firstName +" "+ lastName);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Displayer displayer = new Displayer();
        displayer.displayName("Tom");
        displayer.displayName("Tom", "Oscar");

    }
}