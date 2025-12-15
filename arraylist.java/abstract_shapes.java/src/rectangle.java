public class rectangle extends shape{
    double l,b;
    rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    @Override
    double area(){
        return l*b;
    }
}
