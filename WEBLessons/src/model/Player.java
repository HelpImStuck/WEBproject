package model;

public class Player extends Person {

    private int number;

    public Player(int number) {
        this.number = number;
    }

    public Player(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    @Override
    public void sayName() {
        System.out.println("i am a player. My name is" + this.getName());

    }
}

