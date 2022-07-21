package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;
    private Random random = new Random();

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
