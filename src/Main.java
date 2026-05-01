import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Коллекция для хранения студентов
        List<Student> students = new ArrayList<>();
        //Заполняем список студентами
        students.add(new Student("Петр", "Группа 11", 1, Arrays.asList(4, 5, 3, 4))); // Хорошист
        students.add(new Student("Елена", "Группа 12", 1, Arrays.asList(2, 2, 3, 2))); // Средний балл < 3
        students.add(new Student("Екатерина", "Группа 21", 2, Arrays.asList(10, 9, 9, 8))); // Отличница
        //Выводим студентов, кто на 1 курсе
        printStudents(new HashSet<>(students), 1);
        //Задание - 1
        //Удаляем студентов которые плохо учатся
        removeLowGradesStudents(students);
        //Переводим оставшихся на следующий курс
        moveToTheNextCourse(students);
        System.out.println("\nКто переведен на курс выше: ");
        //Проверяем, кто теперь на 2 курсе
        printStudents(new HashSet<>(students), 2);
        //Проверяем, кто на 3 курсе
        printStudents(new HashSet<>(students), 3);
        //Задание - 2
        //Создаем объект нашего класса
        Phonebook myPhonebook = new Phonebook();
        //Заполняем справочник
        System.out.println("\nЗаолняем справочник данными");
        myPhonebook.add("Раздобреева", "+375-29-3650806");
        myPhonebook.add("Пирогов", "+375-29-3650807");
        //Добавим однофамильца Раздобреевой. Ключ "Раздобреева" уже есть, поэтому новый номер просто добавится в список к первому.
        myPhonebook.add("Раздобреева", "+375-29-4567689");
        myPhonebook.add("Сидорский", "+375-25-5673456");
        System.out.println("\nПроверка поиска по справочнику");
        //Поиск фамилии с несколькими номерами
        myPhonebook.get("Раздобреева");
        //Поиск фамилии с одним номером
        myPhonebook.get("Пирогов");
        //Поиск фамилии, которой нет в списке
        myPhonebook.get("Самсонов");
    }
    //Метод удаляет стедентов у которых средний балл <3
    public static void removeLowGradesStudents(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverageGrade() < 3) {
                System.out.println("Удаление студента: " + s.name + " за низкий балл: " + s.getAverageGrade());
                it.remove();
            }
        }
    }
    //Метод для увеличения курса
    public static void moveToTheNextCourse(List<Student> students) {
        for (Student s : students) {
            s.course++;
        }
    }
     //Метод для печати имен студентов определенного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Список студентов на " + course + " курсе:");
        boolean found = false;
        for (Student s : students) {
            if (s.course == course) {
                System.out.println("- " + s.name);
                found = true;
            }
        }
        if (!found) System.out.println("(никто не найден)");
    }
}
