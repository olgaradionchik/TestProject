class Rectangle implements Figure {
    private double width, height;
    private String filledColorOfRectangle, borderColorOfRectangle;
    //Создание конструктора
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.filledColorOfRectangle = fillColor;
        this.borderColorOfRectangle = borderColor;
    }
    //Переписываем методы интерфейса
    @Override
    public double areaOfFigure() {
        return width * height; }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); }
    @Override
    public String showFilledColor() {
        return filledColorOfRectangle; }
    @Override
    public String showColorOfBorder() {
        return borderColorOfRectangle; }
}
