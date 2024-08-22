package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
//    List<Game> games = new ArrayList<>();
//    List<Drink> drinks = new ArrayList<>();
//    List<Book> books = new ArrayList<>();
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        this.products.add(product);
    }

//    public void add(Game game) {
//        this.games.add(game);
//    }
//
//    public void add(Drink drink) {
//        this.drinks.add(drink);
//    }
//
//    public void add(Book book) {
//        this.books.add(book);
//    }

    public int getTotal() {
        int total = 0;

//        for (Game game : this.games) {
//            total += game.getPrice();
//        }
//
//        for (Drink drink : this.drinks) {
//            total += drink.getPrice();
//        }
//
//        for (Book book : this.books) {
//            total += book.getPrice();
//        }

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
//        for (Game game : this.games) {
//            if (game.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Drink drink : this.drinks) {
//            if (drink.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Book book : this.books) {
//            if (book.getName().equals(name)) {
//                return true;
//            }
//        }

        for (Product product : this.products) {
            if (product.getName().equals(name)){
                return true;
            }
        }

        return false;
    }
}
