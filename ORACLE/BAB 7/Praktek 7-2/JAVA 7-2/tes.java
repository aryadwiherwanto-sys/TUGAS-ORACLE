public class tes {
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);

        Fish paling = nicestFish(amber, james);
        System.out.println("Ikan paling ramah: " + paling.typeOfFish
                + " (keramahan " + paling.getFriendliness() + ")");
    }
}
