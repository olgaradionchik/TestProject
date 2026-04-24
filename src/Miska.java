class Miska {
    private int food;
    public Miska(int initialFood) {
        this.food = initialFood;
    }
    //Добавляем еду в миску
    public void addFoodToMiska(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавили " + amount + " еды. Всего: " + food);
        }
    }
    //Уменьшение еды
    public boolean decreaseFoodInMiska(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }
    public void showInfoAboutFoodInMiska() {
        System.out.println("В миске осталось еды: " + food);
    }
}
