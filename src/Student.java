import java.util.List;
class Student {
    String name;
    String group;
    int course;
    List<Integer> subjectGrades;
    //Создаем конструктор для объекта студента
    public Student(String name, String group, int course, List<Integer> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }
    //Метод для расчета средней оценки студента
    public double getAverageGrade() {
        //Валидашка на деление на ноль
        if (subjectGrades.isEmpty()) return 0;
        double sum = 0;
        for (int score : subjectGrades) {
            sum += score;
        }
        return sum / subjectGrades.size();
    }
}
