// Boxes.java
// Exercise 7: a class that can display a square box of various sizes
// (maximum size 10). Hyphen '-' draws the top and bottom borders, and
// pipe '|' draws the sides.
public class Boxes {
    private int size;

    // Constructor that accepts the size of the box
    public Boxes(int size) {
        setSize(size);
    }

    // Method that sets the size of the box (clamped between 1 and 10)
    public void setSize(int size) {
        if (size > 10) {
            this.size = 10;
        } else if (size < 1) {
            this.size = 1;
        } else {
            this.size = size;
        }
    }

    public int getSize() {
        return size;
    }

    // toString() returns the size of the box as a String, e.g. "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // Method that draws the box to the console
    public void draw() {
        // top border
        for (int i = 0; i < size; i++) {
            System.out.print('-');
        }
        System.out.println();

        // sides
        for (int row = 0; row < size - 2; row++) {
            System.out.print('|');
            for (int col = 1; col < size - 1; col++) {
                System.out.print(' ');
            }
            System.out.println('|');
        }

        // bottom border
        for (int i = 0; i < size; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
