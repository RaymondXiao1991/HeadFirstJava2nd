public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "WangCai";

        // Dog数组
        Dog[] mydogs = new Dog[3];
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = new Dog();

        mydogs[0].name = "Alfred";
        mydogs[1].name = "Mercy";

        int x = 0;
        while (x < mydogs.length) {
            mydogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says 'Wang Wang'!");
    }

    public void eat() {}

    public void chaseCat() {}
}
