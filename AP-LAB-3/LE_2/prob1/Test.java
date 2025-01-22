class Animal {
    public void makeVoice() {
        System.out.println("Animal sound");
    }
}

class Cow extends Animal {
    public void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    public void makeVoice() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    public void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    public void makeVoice() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    public void makeVoice() {
        System.out.println("Roar");
    }
}

class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        hear(animals);
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
    }
}
