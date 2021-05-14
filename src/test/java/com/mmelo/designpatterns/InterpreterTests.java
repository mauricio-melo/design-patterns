package com.mmelo.designpatterns;

import com.mmelo.designpatterns.behavioral.interpreter.operations.Division;
import com.mmelo.designpatterns.behavioral.interpreter.operations.Multiplication;
import com.mmelo.designpatterns.behavioral.interpreter.operations.Operation;
import com.mmelo.designpatterns.behavioral.interpreter.operations.Subtraction;
import com.mmelo.designpatterns.behavioral.interpreter.operations.Sum;
import com.mmelo.designpatterns.behavioral.interpreter.operations.number.Number;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterpreterTests {
	

	@Test
	void interpreter() {
		final Operation sum = new Sum(new Number(1), new Number(4));
		System.out.println(sum.interpret());

		final Operation sub = new Subtraction(sum, new Number(2));
		System.out.println(sub.interpret());

		final Operation mul = new Multiplication(sub, sum);
		System.out.println(mul.interpret());

		final Operation div = new Division(new Number(30), mul);
		System.out.println(div.interpret());
	}

}
