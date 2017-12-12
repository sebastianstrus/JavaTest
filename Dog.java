public class Dog implements Animal {

    String name;

    Dog(String n){  
        name = n;  
    } 

    @Override
    public void bark() {
         System.out.println("Woof woof!");    
    };
    
}

