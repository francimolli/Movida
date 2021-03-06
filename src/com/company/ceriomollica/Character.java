package com.company.ceriomollica;

import com.company.commons.Person;


/** Questa classe estende la classe Person e serve ad identificare le persone
 * che hanno partecipato ad un film (Attori, Direttori, Cast).
 *
 * E' stato aggiunto il campo num_movies per tener conto del numero di film
 * a cui un personaggio (Character) ha preso parte.
 */

public class Character extends Person {

    private Integer num_movies;

    public Character(String name, Integer num_movies) {
        super(name);
        this.num_movies = num_movies;
    }

    public Integer getNum_movies() {
        return num_movies;
    }

    public void incMovie(){
        this.num_movies++;
    }

    public void decMovie(){
        this.num_movies--;
    }
}
