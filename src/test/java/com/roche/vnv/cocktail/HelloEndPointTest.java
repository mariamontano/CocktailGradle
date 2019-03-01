package com.roche.vnv.cocktail;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//import static org.junit.Assert.assertEquals;

public class HelloEndPointTest {
    private HelloEndPoint helloEndPoint;
    UserRepository userRepository = mock(UserRepository.class);

    @Before
    public void setUp() {
        this.helloEndPoint = new HelloEndPoint(userRepository);
    }

    @Test
    public void shouldReturnUsername() {

        when(userRepository.existUserInDatabase("Maria")).thenReturn(true);
        when(userRepository.existUserInDatabase("David")).thenReturn(false);
        //assertEquals(helloEndPoint.sayHello("Maria"), "Maria");
        assertThat("Hello David").as("fails due to").isEqualTo(helloEndPoint.sayHello("David"));
    }
/*
    @Test
    public void shouldResultUsernameOnlyIfInDatabase(){
        if (existDatabase("Maria")){
            assertThat("Hello Maria").as("fails due to").isEqualTo(helloEndPoint.sayHello("Maria"));}
    }

    private boolean existDatabase(String username){
        if (username.equals("Maria")){
            return true;
        }
        else{
            return false;
        }
    }*/


}
