package com.mmelo.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import com.mmelo.designpatterns.behavioral.strategy.service.StrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyTests {
	
	@Autowired
	private StrategyService strategyService;

	@Test
	void sum() {
		final BigDecimal sum = strategyService.getResult(new BigDecimal(10), new BigDecimal(5), "SUM");
		assertEquals(sum, new BigDecimal(15));
	}

	@Test
	void sub() {
		final BigDecimal sum = strategyService.getResult(new BigDecimal(10), new BigDecimal(5), "SUB");
		assertEquals(sum, new BigDecimal(5));
	}

	@Test
	void mul() {
		final BigDecimal sum = strategyService.getResult(new BigDecimal(10), new BigDecimal(5), "MUL");
		assertEquals(sum, new BigDecimal(50));
	}

	@Test
	void div() {
		final BigDecimal sum = strategyService.getResult(new BigDecimal(10), new BigDecimal(5), "DIV");
		assertEquals(sum, new BigDecimal("2.00"));
	}

}
