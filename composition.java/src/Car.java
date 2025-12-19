public class Car {
    final String name;
    final int price;
    final Engine engine;

    Car(String name, int price, String enginetype){
        this.name=name;
        this.price=price;
        this.engine=new Engine(enginetype);
    }
     void show(){
         System.out.println(name+" : "+price+" : "+engine.getType());
     }
}
