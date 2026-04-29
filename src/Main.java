public class Main {
    public static void main(String[] args) {
        //Массив строк размером 4х4 (пункт 1)
        String[][] arr = {
                {"11", "41", "69", "4"},
                {"54", "61", "76", "1"},
                {"9", "11", "24", "36"},
                {"43", "456", "0", "4"}
        };
        //Задание 3: вызов метода и его обработка
        try {
            //Вызываем метод и сохраняем результат
            int result = calculationAllDataInArray(arr);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            //Сработает, если массив не 4х4
            System.err.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            //Сработает, если в ячейке будет текст вместо числа
            System.err.println("Ошибка данных: " + e.getMessage());
        }
        //Задание 4: код для генерации и поимки ArrayIndexOutOfBoundsException
        System.out.println("\nТестирование выхода за границы массива:");
        try {
            // В массиве всего 3 элемента (индексы 0, 1, 2)
            int[] array = {11, 22, 33};
            //Обращаемся к индексу 7 чтобы вызвать ошибку, так как такого индекса у нас нет
            int triggerError = array[7];
        } catch (ArrayIndexOutOfBoundsException e) {
            //Вывод информации об исключении
            System.out.println("Стандартное исключение: " + e);
        }
    }
    /*
     Чтобы увидеть валидашку на исключение:
     - исключение SizeException закомментируйте одну строку из массива arr (сделайте его 3х4).
     - исключение DataException замените в ячейке массива цифру на слово, например {"11", 41", "ОШИБКА", "4"}.
     */
    //Метод для проверки размера массива и суммы его значений
    public static int calculationAllDataInArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        //Проверяем внешнюю длину массива (количество строк)
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен содержать ровно 4 строки.");
        }
        int sum = 0;
        //Идем циклом по строкам
        for (int i = 0; i < arr.length; i++) {
            //Проверяем количество столбцов
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Строка номер " + i + " содержит не 4 столбца.");
            }
            //Идем циклом по столбцам внутри текущей строки
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    //Перевеодим строку в целое число
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    //Если перевод не удался (например, в ячейке "abc"),
                    //Кидаем исключение MyArrayDataException с координатами
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        //Возвращает итоговую сумму всех чисел в массиве в том случае если все проверки пройдены
        return sum;
    }
}
