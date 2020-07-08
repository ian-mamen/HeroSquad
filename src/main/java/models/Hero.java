package models;

import java.util.ArrayList;

public class Hero {

    public String name;
    public int age;
    public String specialPower;
    public String weakness;
    public int Id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness){
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
        this.Id = instances.size();
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpecialPower(){
        return this.specialPower;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public static ArrayList<Hero> getAllInstances(){
        return instances;
    }
    public int getId(){
        return this.Id;
    }
    public static Hero findById(int id) {
        return instances.get(id-1);
    }
    public static Hero newHeroSet() {
        return new Hero("Stylist",26,"regeneration","extreme cold");
    }

}
