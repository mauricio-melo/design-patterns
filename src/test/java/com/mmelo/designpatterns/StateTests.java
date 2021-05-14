package com.mmelo.designpatterns;

import com.mmelo.designpatterns.behavioral.State.Context;
import com.mmelo.designpatterns.behavioral.State.StartState;
import com.mmelo.designpatterns.behavioral.State.StopState;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StateTests {


    @Test
    void state() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
