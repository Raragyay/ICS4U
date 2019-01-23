public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    private static double totalArea;
    private static int numOfTriangles;

    public Triangle(double A, double B, double C) {
        sideA = A;
        sideB = B;
        sideC = C;
        calcArea();

        totalArea += area;
        numOfTriangles++;
    }

    public Triangle(double AB, double C) {
        sideA = sideB = AB;
        sideC = C;
        calcArea();

        totalArea += area;
        numOfTriangles++;
    }

    public Triangle(double ABC) {
        sideA = sideB = sideC = ABC;
        calcArea();

        totalArea += area;
        numOfTriangles++;
    }

    public Triangle() {
        sideA = sideB = sideC = 0;
        calcArea();

        totalArea += area;
        numOfTriangles++;
    }

    private void calcArea() {
        double s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        //System.out.println("area = " + area);;
    }

    private void updateTotalArea() {
        totalArea -= area;
        calcArea();
        totalArea += area;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea() {
        return area;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    public static int getNumOfTriangles() {
        return numOfTriangles;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        updateTotalArea();
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        updateTotalArea();
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
        updateTotalArea();
    }
}
