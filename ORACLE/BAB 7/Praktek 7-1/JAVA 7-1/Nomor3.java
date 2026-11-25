public class Nomor3 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();          // constructor tanpa parameter
        Animal animal2 = new Animal(80, 6, 5);  // constructor dengan parameter

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}
