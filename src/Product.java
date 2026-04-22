public class Product {
    String name;
    String dateOfProduction;
    String manufacturer;
    String countryOfOrigin;
    int price;
    boolean isReservedStatus;
    //Конструкция класса
    public Product(String name, String dateOfProduction, String manufacturer, String countryOfOrigin, int price, boolean isReservedStatus){
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.manufacturer = manufacturer ;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReservedStatus = isReservedStatus;
    }
    //Создадим метод чтобы вывести информацию о товаре
    public void showProductInfo(){
        System.out.println("Товар: " + name+ ". Дата производства: " +dateOfProduction+ ". Производитель: "+manufacturer+", страна: "+countryOfOrigin+". Цена: "+price+ ". Статус брони: "+isReservedStatus);
    }
}