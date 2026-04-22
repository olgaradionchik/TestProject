public class Main {
    public static void main(String[] args) {
        //Class Product - Задание - 1 и 2
        //Создадим массив из 5 товаров
        Product[] arr = new Product[5];
        //Заполняем массив объектами
        arr[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        arr[1] = new Product("Infinix Hot 60i", "01.01.2025", "INFINIX", "China", 2345, false);
        arr[2] = new Product("Xiaomi Redmi 15C", "01.06.2024", "XIAOMI", "China", 1500, true);
        arr[3] = new Product("iPhone 15 256 Gb Лавандовый", "01.09.2025", "APPLE", "USA", 4321, false);
        arr[4] = new Product("HUAWEI nova Y73", "01.09.2024", "HUAWEI", "China", 1234, true);
        //Цикл проходит по каждой ячейке массива чтобы показать информацию о девайсе
        for(int i = 0; i < arr.length; i++){
            arr[i].showProductInfo();
        }
        System.out.println(); //Вывожу пустую строку чтобы визуально в консоле сделать разделение между заданиями
        //Class Park - Задание-3
        //Создаем 2 объекта внешнего класса
        Park parkInMinsk1 = new Park("Парк имени Челюскинцев");
        Park parkInMinsk2 = new Park("Парк культуры и отдыха имени 50-летия Великого Октября");
        //Создадаем объекты внутреннего класса
        Park.Attraction attractionOne = parkInMinsk1.new Attraction("Небесная карусель", "11:00 - 23:00", 45.45);
        Park.Attraction attractionTwo = parkInMinsk1.new Attraction("Морской бой", "11:00 - 22:00", 35.34);
        Park.Attraction attractionThree = parkInMinsk2.new Attraction("Веселые утята", "12:00 - 21:00", 15.44);
        Park.Attraction attractionFour = parkInMinsk2.new Attraction("Колесо обозрения", "12:00 - 20:00", 20.15);
        //Вызываем информацию об аттракциоанх в парках
        attractionOne.showInfoAboutAttractionInThePark();
        attractionTwo.showInfoAboutAttractionInThePark();
        attractionThree.showInfoAboutAttractionInThePark();
        attractionFour.showInfoAboutAttractionInThePark();
    }
}