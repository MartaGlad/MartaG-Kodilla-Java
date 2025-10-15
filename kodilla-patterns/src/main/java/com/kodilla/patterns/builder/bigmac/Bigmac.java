package com.kodilla.patterns.builder.bigmac;

import java.util.HashSet;
import java.util.Set;

public final class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private Set<Ingredient> ingredients;

    private Bigmac(final Bun bun, final int burgers, final Sauce sauce, Set<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new HashSet<>(ingredients);
    }

    public static class BigmacBuilder {//dostęp tylko do statycznych pól klasy zewnętrznej
                                        //Można ją tworzyć bez tworzenia obiektu klasy zewnętrznej.
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private Set<Ingredient> ingredients = new HashSet<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (bun == null || burgers < 0 || sauce == null || ingredients.isEmpty()) {
                throw new IllegalStateException("State of bigmac object is illegal!");
            }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac[" +
                "bun: " + bun +
                ", burgers: " + burgers +
                ", sauce: " + sauce +
                ", ingredients: " + ingredients +
                ']';
    }
}
