package Box;

public class Box {
    private final double width;
    private final double height;
    private final double depth;
    private static double maxSize = 10;

    public Box() {
        this.width = 10;
        this.height = 10;
        this.depth= 10;

    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public static double getMaxSize() {
        return maxSize;
    }

    public static void setMaxSize(double maxSize) {
        Box.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
