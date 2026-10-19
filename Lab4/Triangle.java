public class Triangle {

    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getPerimeter() {
        return side1 + side2 + side3;
    }

    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: "
                + side1 + ", " + side2 + ", " + side3);

        System.out.println("Perimeter: " + getPerimeter());
    }

    public String printTriangleType() {

        if (side1 == side2 && side2 == side3) {
            return "This is an Equilateral Triangle.";
        }

        else if (side1 == side2 ||
                 side1 == side3 ||
                 side2 == side3) {

            return "This is an Isosceles Triangle.";
        }

        else {
            return "This is a Scalene Triangle.";
        }
    }

    public void compareTriangles(Triangle other) {

        if (this == other) {
            System.out.println(
                "These two triangle objects have the same address."
            );
        }

        else if (side1 == other.side1 &&
                 side2 == other.side2 &&
                 side3 == other.side3) {

            System.out.println(
                "Addresses are different but the sides of the triangles are equal."
            );
        }

        else if (getPerimeter() == other.getPerimeter()) {
            System.out.println(
                "Only the perimeter of both triangles is equal."
            );
        }

        else {
            System.out.println(
                "Addresses, length of the sides and perimeter all are different."
            );
        }
    }
}