public class Park {
    private String parkTitle;
    //Конструктор для внешнего класса Park
    public Park(String parkTitle) {
        this.parkTitle = parkTitle;
    }
    //Внутренний класс для аттракционов
    public class Attraction {
        private String name;
        private String openCloseHours;
        private double price;
        //Контсруктор для внутреннего класса
        public Attraction(String name, String openCloseHours, double price) {
            this.name = name;
            this.openCloseHours = openCloseHours;
            this.price = price;
        }
        //Метод чтобы вызвать информацию об Аттракционе
        public void showInfoAboutAttractionInThePark(){
            System.out.println("Парк: " + parkTitle+ ". Аттракцион: " +name+ ", время работы: " +openCloseHours+ ", стоимость сеанса: " +price+ " бел.руб.");
        }
    }
}