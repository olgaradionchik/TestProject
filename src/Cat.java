class Cat extends Animal {
    public static int catNumber = 0;
    //Аппетит
    private int fullness;
    //Сытость кота
    private boolean isFullness;
    //Конструктор кота
    public Cat(String name, int fullness) {
        super(name);
        this.fullness = fullness;
        this.isFullness = false;
        catNumber++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(nameOfAnimal + " пробежал " + distance + " м.");
        } else {
            System.out.println(nameOfAnimal + " не может пробежать больше 200 м.");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(nameOfAnimal + " не умеет плавать!");
    }
    // Метод с миской
    public void eat(Miska dish) {
        // Кот пытается взять еду из миски. Если метод вернул true - он сыт.
        if (dish.decreaseFoodInMiska(fullness)) {
            this.isFullness = true;
            System.out.println(nameOfAnimal + " сыт.");
        } else {
            System.out.println(nameOfAnimal + " не хватило еды в миске.");
        }
    }
    public void showFullness() {
        System.out.println(nameOfAnimal + " сытость: " + isFullness);
    }
}
