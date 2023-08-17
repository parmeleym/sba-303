public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(135, 26420, "White", 192);
        System.out.println("---- Sedan (Camry) ----");
        System.out.println("Speed: " + sedan.speed + "  mph");
        System.out.println("Regular Price: $" + sedan.regularPrice);
        System.out.println("Sale Price: $" + sedan.getSalePrice());
        System.out.println("Color: " + sedan.color);
        System.out.println("Length: " + sedan.length +" inches");
        System.out.println();

        Ford ranger = new Ford(110, 43615, "Red",2023, 5000);
        System.out.println("---- Ford (Ranger) ----");
        System.out.println("Speed: " + ranger.speed + "  mph");
        System.out.println("Regular Price: $" + ranger.regularPrice);
        System.out.println("Sale Price: $" + ranger.getSalePrice());
        System.out.println("Manufacturer Discount: $" + ranger.manufacturerDiscount);
        System.out.println("Color: " + ranger.color);
        System.out.println("Year: " + ranger.year);
        System.out.println();

        Ford escape = new Ford(130, 38445, "Black",2021, 3800);
        System.out.println("---- Ford (Escape) ----");
        System.out.println("Speed: " + escape.speed + "  mph");
        System.out.println("Regular Price: $" + escape.regularPrice);
        System.out.println("Sale Price: $" + escape.getSalePrice());
        System.out.println("Manufacturer Discount: $" + escape.manufacturerDiscount);
        System.out.println("Color: " + escape.color);
        System.out.println("Year: " + escape.year);
        System.out.println();

        Car kia = new Car(132, 24115, "Space Grey");
        System.out.println("---- Car (Kia Optima) -----");
        System.out.println("Speed: " + kia.speed + "  mph");
        System.out.println("Regular Price: $" + kia.regularPrice);
        System.out.println("Sale Price: $" + kia.getSalePrice());
    }
}
