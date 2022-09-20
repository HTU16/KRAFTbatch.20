package Day_39_Abstraction;


public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuşlar böcekleri yerler");
    }

    @Override
    public void move() {
        System.out.println("kuşlar uçarlar");

    }
}
class parrot extends Bird {

    public parrot(String name) {
        super(name);
    }

    public class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        @Override
        public void eat() {
            System.out.println("kuşlar böcekleri yerler");
        }

        @Override
        public void move() {
            System.out.println("kuşlar uçarlar");

        }
    }


}

