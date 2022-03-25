public class Dish {
    private String name;
    private float price;
    private String date;
    private float weight;

    public Dish() {}

    public Dish(String name, float price, String date, float weight) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", weight=" + weight +
                '}';
    }
}
