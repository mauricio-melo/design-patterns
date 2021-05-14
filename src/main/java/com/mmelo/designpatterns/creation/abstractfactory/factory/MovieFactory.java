package com.mmelo.designpatterns.creation.abstractfactory.factory;

import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovie;

public interface MovieFactory {
    BrazilianMovie getBrazilianMovie();
    AmericanMovie getAmericanMovie();
}
