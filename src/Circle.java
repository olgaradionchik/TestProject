class Circle implements Figure {
    private double radius;
    private String fillColorOfCircle, borderColorOfCircle;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColorOfCircle = fillColor;
        this.borderColorOfCircle = borderColor;
    }
    //Переопределяем методы интерфейса
    @Override
    public double areaOfFigure() {
        return Math.PI * radius * radius; }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; }
    @Override
    public String showFilledColor() {
        return fillColorOfCircle; }
    @Override
    public String showColorOfBorder() {
        return borderColorOfCircle; }
}
