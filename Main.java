public class Main{
    public static void main(String[] args) {

        Car nissan = new Car("Nisaan", 27000.50, 2014, "green");
        Car dodge = new Car("Dodge", 31550.50, 2023, "orange");
        // nissan.make="Nissan";  // not needed because of constructor above
        // nissan.price=2000;
        // nissan.year=1998;
        // nissan.color="blue";

        nissan.setColor("Electric Blue");
        dodge.setColor("Translucent Gray");

        nissan.setYear(2012);
        dodge.setYear(2012);

        //sale reduces both vehicles original value by 50%
        nissan.setPrice(nissan.getPrice() /2);
        dodge.setPrice(dodge.getPrice() /2);

        System.out.println("\n This " + nissan.getMake() + " is worth $ " + nissan.getPrice() + " was built in " + nissan.getYear() + " and is colored " + nissan.getColor() + "\n");
        System.out.println("\n This " + dodge.getMake() + " is worth $ " + dodge.getPrice() + " was built in " + dodge.getYear() + " and is colored " + dodge.getColor() + "\n");
    


    }
}

