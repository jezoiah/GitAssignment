public class AnimalTest {
    public static void main(String[] args) {
        // Create Animal objects
        Animal dog = new Animal("Buddy", 3, "Dog");
        Animal cat = new Animal("Whiskers", 2, "Cat");
        Animal bird = new Animal("Polly", 1, "Parrot");
        Animal monkey = new Animal("Chimp", 4, "Monkey");
        // Test animal        
        
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

        System.out.println("=== Testing Parrot ===");
        bird.displayInfo();
        bird.makeSound();
        
        System.out.println();
        System.out.println("=== Testing Monkey ===");
        monkey.displayInfo();
        monkey.makeSound();
        
        System.out.println();
    }
}