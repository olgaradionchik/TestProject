public class MyArrayDataException extends Exception {
    //Конструктор принимает координаты ячейки с ошибкой
    public MyArrayDataException(int r, int c) {
        //Сообщение об ошибке с указанием строки и столбца
        super("Ошибка в ячейке: строка: " + r +", столбец: "+ c);
    }
}