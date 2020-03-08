public class Car {
    String mark;
    int year;
    int price;

    public Car(String mark, int year, int price) {
        this.mark = mark;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
