public class Indicator {
    private int max;
    private int min;
    private int value;

    public Indicator(int max, int min, int value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        if (value < min){
            this.value = min;
        }
        if (value > max){
            this.value = max;
        }
    }
}
