public class Main {
    public static Fish nicestFish(Fish a, Fish b) {
        if (a.getFriendliness() >= b.getFriendliness()) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);

        Fish paling = nicestFish(amber, james);
        System.out.println("Ikan paling ramah: " + paling.typeOfFish
                + " (keramahan " + paling.getFriendliness() + ")");
    }
}
