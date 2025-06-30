class Circle {
    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;
        c.calculateArea();
    }
}
