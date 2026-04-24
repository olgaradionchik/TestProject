class Triangle implements Figure {
    //Три стороны треугольника
    private double a, b, c;
    private String fillColorOfTriangle, borderColorOfTriangle;
    //Создаем конструктор
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a; this.b = b; this.c = c;
        this.fillColorOfTriangle = fillColor;
        this.borderColorOfTriangle = borderColor;
    }
    //Переопределяем методы интерфейса
    @Override
    public double calculatePerimeter() {
        return a + b + c; }
    @Override
    public double areaOfFigure() {
        //Для площади по трем сторонам используем формулу Герона
        double p = calculatePerimeter() / 2;
        //Math.sqrt вычисляет квадратный корень
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public String showFilledColor() {
        return fillColorOfTriangle; }
    @Override
    public String showColorOfBorder() {
        return borderColorOfTriangle; }
}
