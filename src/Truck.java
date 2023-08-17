public class Truck extends Car{
    int weight;

    Truck(int spd, double regPrice, String col, int wgt) {
        super(spd, regPrice, col);
        this.weight = wgt;
    }

    @Override double getSalePrice(){
        if(weight > 2000){
            return (super.regularPrice * .9);
        }
        else{
            return (super.regularPrice * .8);
        }
    }
}
