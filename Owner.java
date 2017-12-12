class Owner {

    String name;
    Animal animal; 
      
    Owner(String n, Animal a) {  
        name = n;  
        animal = a;  
    }  

    public void myAnimalMakesSound() {
        animal.makeSound();
    }   
}