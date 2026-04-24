public class Main {
    public static void main(String[] args) {
        //Задание - 1
        // 1. Бег и плавание
        Dog dog1 = new Dog("Palkan");
        Cat cat1 = new Cat("Murzik", 15);
        dog1.run(123);
        cat1.run(321);
        dog1.swim(15);
        cat1.swim(13);
        // 2. Обед котов
        Miska plate = new Miska(30); // В миске 30 еды
        Cat[] arr = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 25), // Этому коту не хватит, если он пойдет вторым
                new Cat("Pushok", 5)
        };
        System.out.println("\nНачинаем кормить котов:");
        for (Cat cat : arr) {
            cat.eat(plate);
        }
        System.out.println("\nИнформация о сытости:");
        for (Cat cat : arr) {
            cat.showFullness();
        }
        plate.showInfoAboutFoodInMiska();
        System.out.println("\nДобавим еды и покормим голодных:");
        plate.addFoodToMiska(20);
        for (Cat cat : arr) {
            cat.eat(plate);
        }
        // 3. Информация о количестве животных
        System.out.println("\nИнформация о количестве животных");
        System.out.println("Всего животных: " + Animal.animalNumber);
        System.out.println("Всего котов: " + Cat.catNumber);
        System.out.println("Всего собак: " + Dog.dogCount);
        //Задание - 2
        // Создаем массив фигур
        Figure[] array = {
                new Rectangle(5, 10, "White", "Red"),
                new Circle(3, "Black", "Green"),
                new Triangle(3, 4, 5, "Yellow", "Blue")
        };
        //Проходим циклом по каждой фигуре в массиве и вызываем метод с инфо
        System.out.println("\nИнформация о фигурах");
        for (Figure i : array) {
            i.printInfo();
        };
    }
}
