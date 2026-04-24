interface Figure {
    //Метод чтобы рассчитать площать фигуры
    double areaOfFigure();
    //Метод чтобы рассчитать периметр
    default double calculatePerimeter() {
        return 0;
    }
    String showFilledColor();
    String showColorOfBorder();
    //Метод для вывода в консоль
    default void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName()+", периметр: " + calculatePerimeter()+", площадь: " + areaOfFigure()+", цвет заливки: " + showFilledColor()+", цвет границы: " + showColorOfBorder());
    }
}
