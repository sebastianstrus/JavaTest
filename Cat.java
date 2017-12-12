public class Cat implements Animal {

    String name;

    Cat(String n){  
        name = n;  
    } 

    @Override
    public void makeSound() {
         System.out.println("Meeow!");    
    };
    
}

