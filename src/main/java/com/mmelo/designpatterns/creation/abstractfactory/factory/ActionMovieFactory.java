package com.mmelo.designpatterns.creation.abstractfactory.factory;

import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovieAction;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovieAction;

public class ActionMovieFactory implements MovieFactory {

    @Override
    public BrazilianMovie getBrazilianMovie() {
        return new BrazilianMovieAction();
    }

    @Override
    public AmericanMovie getAmericanMovie() {
        return new AmericanMovieAction();
    }
}
