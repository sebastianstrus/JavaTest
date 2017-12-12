public class App {

    public static void main(String[] args) {

        Animal dog = new Dog("Max");

        Owner sebastian = new Owner("Sebastian", dog);
        sebastian.myAnimalMakesSound();
    }
}
