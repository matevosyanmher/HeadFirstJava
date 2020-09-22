public abstract class Animal {
    String name;
    int weight;

    public void roam() {
        System.out.println("This is animal roam method");
    }

    public void eat() {
    }

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("this is Feline roam method");
    }

    public Feline(String name) {
        super(name);
    }
}

class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("this is Canine roam method");
    }

    public Canine(String name) {
        super(name);
    }
}

class Dog extends Canine implements Pet {

    @Override
    public void beFriendly() {
        System.out.println("Dog implements Pet method beFriendly()");
    }

    @Override
    public void play() {
        System.out.println("Dog implements Pet method play()");
    }

    public Dog(String name) {
        super(name);
    }
}

class Woolf extends Canine {
    public Woolf(String name) {
        super(name);
    }
}

class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
    }
}

class Cat extends Feline implements Pet {

    @Override
    public void beFriendly() {
        System.out.println("I'm friendly Cat");
    }

    @Override
    public void play() {

    }

    public Cat(String name) {
        super(name);
    }
}

class Lion extends Feline {
    public Lion(String name) {
        super(name);
    }
}

class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
    }
}