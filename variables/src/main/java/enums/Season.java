package enums;

public enum Season {
    AUTUMN(15), WINTER(-15), SPRING(20), SUMMER(25);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
