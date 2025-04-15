public class Lasagna {
    // Standard expected oven time in minutes
    public static int expectedMinutesInOven() {
        return 40;
    }

    // Calculates remaining baking time based on actual elapsed minutes
    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    // Calculates preparation time based on number of layers
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Calculates total working time (preparation + baking)
    public int totalTimeInMinutes(int layers, int actualMinutes) {
        return preparationTimeInMinutes(layers) + actualMinutes;
    }
}
