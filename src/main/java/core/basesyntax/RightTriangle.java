package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.name = Figures.RIGHTTRIANGLE.name();

    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, color: " + color.toLowerCase() + ", area: " + String.format("%.2f", getArea()) + ", firstLeg: " + firstLeg + " units," + " secondLeg: " + secondLeg + " units");

    }
}