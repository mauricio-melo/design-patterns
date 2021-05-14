package com.mmelo.designpatterns;

import com.mmelo.designpatterns.creation.factorymethod.factory.CoffeeMachine;
import com.mmelo.designpatterns.creation.factorymethod.factory.SodaMachine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryMethodTests {

	@Test
	void coffee() {
		final CoffeeMachine coffeeMachine = new CoffeeMachine();
		coffeeMachine.showMessage();
		coffeeMachine.delivery();
	}

	@Test
	void soda() {
		final SodaMachine sodaMachine = new SodaMachine();
		sodaMachine.showMessage();
		sodaMachine.delivery();
	}
}
