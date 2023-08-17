public class Sedan extends Car{
    int length;

    Sedan(int spd, double regPrice, String col, int len) {
        super(spd, regPrice, col);
        this.length = len;
    }

    double getSalePrice(){
        if(length > 20){
            return (super.regularPrice * .95);
        }
        else{
            return (super.regularPrice * 90);
        }
    }
}
