package com.roche.vnv.cocktail;

public class HelloEndPoint {

    private final UserRepository userRepository;

    public HelloEndPoint(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String sayHello(String userName) {
        if (userRepository.existUserInDatabase(userName)) {
            return "Hello " + userName;
        }
        return "Bye Hacker";
    }
}