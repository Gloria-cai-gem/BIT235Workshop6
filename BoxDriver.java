// BoxDriver.java
// Exercise 7: driver class containing main() that makes calls to the
// Boxes class. Two box sizes are tested.
public class BoxDriver {
    public static void main(String[] args) {
        Boxes small = new Boxes(3);
        System.out.println("Box: " + small.toString());
        small.draw();

        Boxes large = new Boxes(10);
        System.out.println("Box: " + large.toString());
        large.draw();

        // Test the setter with a size larger than the maximum 10
        Boxes oversized = new Boxes(15);
        System.out.println("Box: " + oversized.toString());
        oversized.draw();
    }
}
