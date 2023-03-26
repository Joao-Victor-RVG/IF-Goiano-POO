public class Product {

    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock(){
        return price * quantity;

    }


    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " Unidade, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}