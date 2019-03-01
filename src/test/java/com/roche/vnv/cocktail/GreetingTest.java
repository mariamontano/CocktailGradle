package com.roche.vnv.cocktail;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreetingTest {
    private GreetingController greetingController;

    @Before
    public void setUp() {
        this.greetingController = new GreetingController();
    }

    @Test
    public void shouldReturnUsername() {
        String actualUserName = greetingController.greeting("Maria").getContent();
        assertThat("Hello, Maria!").isEqualTo(actualUserName);
    }
}
