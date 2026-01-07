public class Car {
    private final  Engine engine;
    private final String name;
    private final float price;
    Car(String name,float price,String enginetype){
        this.name=name;
        this.price=price;
        this.engine=new Engine(enginetype);
    }
    void display(){
        System.out.println(name+" : "+price+" : "+engine.show());
    }
}


