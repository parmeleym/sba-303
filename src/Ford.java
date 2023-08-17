public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    Ford(int spd, double regPrice, String col, int yr, int manDisc) {
        super(spd, regPrice, col);
        this.year = yr;
        this.manufacturerDiscount = manDisc;
    }

    double getSalePrice(){
        return (super.getSalePrice() - manufacturerDiscount);
    }
}
