public class Fruit {
    String name="Banana";
    int size=10;
    String taste= "Sweet";



     void eat(){
         System.out.println( name+" "+ "is" + taste);

     }
        static class Apple extends Fruit {
            String name="Apple";
            int size=10;
            String taste="Tart";
            void eat() {
                System.out.println(name + " " + "is" +taste);
            }

            static class Orange extends Fruit {
                String name="Orange";
                int size=30;
                String taste="Sour";
                void eat() {
                    System.out.println(name + " " +"is" + taste);
                }

                public static void main(String[] args) {
                    Apple obj= new Apple();
                    Fruit obj2= new Fruit();
                    Orange obj1= new Orange();
                    obj.eat();
                    obj1.eat();
                    obj2.eat();





                }

            }
        }


}
