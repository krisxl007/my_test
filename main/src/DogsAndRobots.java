interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() { System.out.println("WangWang!"); }
}

class Cat implements Animal {
    public void speak() { System.out.println("MauMau!"); }
}

class Communicate<T extends Animal> {
    T t;

    public Communicate(T t) {
        this.t = t;
    }

    public void speak() {
        t.speak();
    }
}
public class DogsAndRobots {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat r = new Cat();

        new Communicate(d).speak();
        new Communicate(r).speak();
    }
}
