public class Products {
    private double price;
    public double getPrice() { //getter
        return price;
    }

    public void setPrice(double price) { //setter
        this.price = price;
    }

    public double getPrice(int quantity) {   //overloading
        return price * quantity;
    }

    public static void main(String[] args) {
        Products laptop = new Products();

        laptop.setPrice(1000.0);

        System.out.println("Price for a single laptop: $" + laptop.getPrice());

        System.out.println("Price for 3 laptops: $" + laptop.getPrice(3));
    }

}
