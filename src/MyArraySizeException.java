public class MyArraySizeException extends Exception {
    //Конструктор принимает сообщение об ошибке
    public MyArraySizeException(String message) {
        //Передаем сообщение об ошибке в родительский класс Exception
        super(message);
    }
}