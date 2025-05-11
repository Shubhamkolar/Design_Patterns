package Design_Patterns;

public class Singleton {

    // Create a private static variable to hold the single instance
    private static Singleton instance;

    // Make the constructor private to prevent instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Provide a public static method to get the instance (Thread-safe using
    // synchronized)
    public static synchronized Singleton getInstance() {
        // Create the instance if it dosen't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!!");
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

    //  Getting another reference, which will return the same instance.
        Singleton obj2 = Singleton.getInstance();

    //  Verifying both references point to the same instance
        if(obj1 == obj2){
            System.out.println("Both the reference return the same instance.");
        } else{
            System.out.println("Both the references point to different instance.");
        }
    }
}