public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public Engine(String model) {
            super(model);
        }

        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }
