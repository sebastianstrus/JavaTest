public class Dog implements Animal {

    String name;

    Dog(String n){  
        name = n;  
    } 

    @Override
    public void makeSound() {
         System.out.println("Woof woof!");    
    };
    
}

