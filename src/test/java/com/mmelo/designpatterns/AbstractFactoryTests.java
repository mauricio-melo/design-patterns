package com.mmelo.designpatterns;

import com.mmelo.designpatterns.creation.abstractfactory.factory.ActionMovieFactory;
import com.mmelo.designpatterns.creation.abstractfactory.factory.ComedyMovieFactory;
import com.mmelo.designpatterns.creation.abstractfactory.movies.american.AmericanMovie;
import com.mmelo.designpatterns.creation.abstractfactory.movies.brazilian.BrazilianMovie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbstractFactoryTests {

	@Test
	void abstractFactory() {
		System.out.println("***Exemplo do padrão Abstract Factory***");
		final ActionMovieFactory actionMovie = new ActionMovieFactory();
		final BrazilianMovie actionMovieBrazilian = actionMovie.getBrazilianMovie();
		final AmericanMovie actionMovieAmerican = actionMovie.getAmericanMovie();

		System.out.println("\nOs filmes de Ação catalogados são:");
		System.out.println(actionMovieBrazilian.name());
		System.out.println(actionMovieAmerican.name());

		final ComedyMovieFactory comedyMovie = new ComedyMovieFactory();
		final BrazilianMovie comedyMovieBrazilian = comedyMovie.getBrazilianMovie();
		final AmericanMovie comedyMovieAmerican = comedyMovie.getAmericanMovie();

		System.out.println("\nOs filmes de Comédia catalogados são::");
		System.out.println(comedyMovieBrazilian.name());
		System.out.println(comedyMovieAmerican.name());
	}
}
