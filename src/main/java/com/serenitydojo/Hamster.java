package com.serenitydojo;

public class Hamster extends Pet{
    private String favouriteGame;

    public static String HAMSTER_NOISE = "WOOF";

    public Hamster(String name, String favouriteGame, int age) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    /**@Override
    public String makeNoise() {
        return HAMSTER_NOISE;
    }**/

    public String play() {
        return "runs in wheel";
    }
}
