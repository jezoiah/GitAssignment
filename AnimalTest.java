public class AnimalTest {
    public static void main(String[] args) {
        // Create Animal objects
        Animal dog = new Animal("Buddy", 3, "Dog");
        Animal cat = new Animal("Whiskers", 2, "Cat");
        
        // Test dog
        System.out.println("=== Testing Dog ===");
        dog.displayInfo();
        dog.makeSound();
        dog.eat();
        
        System.out.println();
        
        // Test cat
        System.out.println("=== Testing Cat ===");
        cat.displayInfo();
        cat.makeSound();
        
        System.out.println();

    
    }
}