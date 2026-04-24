class Dog extends Animal {
    public static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(nameOfAnimal + " пробежал " + distance + " м.");
        } else {
            System.out.println(nameOfAnimal + " не может пробежать больше 500 м.");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(nameOfAnimal + " проплыл " + distance + " м.");
        } else {
            System.out.println(nameOfAnimal + " не может проплыть больше 10 м.");
        }
    }
}
