package model;

public class Coach extends Person{
    private String nameClub;

    public Coach(String name, int age, String nameClub) {
        super(name, age);
        this.nameClub = nameClub;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
    @Override
    public void sayName(){
        System.out.println("I am a coach. My name is " + this.getName());
    }
}
