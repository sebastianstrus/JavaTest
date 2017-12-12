class Owner {

    String name;
    Dog dog; 
      
    Owner(String n, Dog d){  
        name = n;  
        dog = d;  
    }  

    public void myDogBarks() {
        dog.bark();
    }  

    public void seyHi() {
        System.out.println("Hi!");   
    }  
}