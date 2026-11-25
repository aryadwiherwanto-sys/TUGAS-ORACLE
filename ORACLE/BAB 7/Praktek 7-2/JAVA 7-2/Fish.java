public class Fish {
    String typeOfFish;
    int friendliness;

    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    public int getFriendliness() {
        return friendliness;
    }
}