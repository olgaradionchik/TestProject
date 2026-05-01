import java.util.*;
public class Phonebook {
    // Внутренняя память справочника.
    // Мы объявляем её private, чтобы данные нельзя было изменить напрямую извне.
    private Map<String, List<String>> bookOfPhones = new HashMap<>();
    //Создаем метод для добавления
    public void add(String surname, String phone) {
        bookOfPhones.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
        //Вывод в консоль
        System.out.println("Добавлена новая запись в справочник: " + surname + ", номер телефона: " + phone);
    }
    //Создаем метод для поиска по фамилии
    public void get(String surname) {
        //Проверяем есть ли такой ключ-фамилия
        if (bookOfPhones.containsKey(surname)) {
            //И если находит фамилию по ключу, то получаем все номера телефонов привязанных к этой фамилии
            List<String> phones = bookOfPhones.get(surname);
            //Выводим результат
            System.out.println("Найдены номера для фамилии: "  + surname+ ", номера: "+ phones);
        } else {
            //Валидашка на отсутствия ключа-фамилии в списке
            System.out.println("Нет данных для фамилии: " + surname);
        }
    }
}
