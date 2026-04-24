abstract class Animal {
    //Имя животного
    protected String nameOfAnimal;
    //Переменная для подсчета всех животных
    public static int animalNumber = 0;
    //Увеличиваем счетчик при создании нового животного
    public Animal(String name) {
        this.nameOfAnimal = name;
        animalNumber++;
    }
    // Абстрактные методы бегать и плавать
    public abstract void run(int distance);
    public abstract void swim(int distance);
}
