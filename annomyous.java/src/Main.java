public class Main {
    public static void main(String[] args){
        name name=new name();
        name name1=new name(){
            @Override
            void de(){
                System.out.println(" Hi Prasadula Kumar");
            }
        };

        name.de();
        name1.de();
    }
}
