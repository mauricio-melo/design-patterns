package com.mmelo.designpatterns.creation.abstractfactory.factory;

import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovieComedy;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovieComedy;

public class ComedyMovieFactory implements MovieFactory {

    @Override
    public BrazilianMovie getBrazilianMovie() {
        return new BrazilianMovieComedy();
    }

    @Override
    public AmericanMovie getAmericanMovie() {
        return new AmericanMovieComedy();
    }
}
