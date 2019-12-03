package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/getDetails/{someString}")
    public Model getDetailsAboutString(@PathVariable String someString) {
        Model response = new Model(someString);
        response.setNumberOfLowerLetters(someString.chars().filter(Character::isLowerCase).count());
        response.setNumberOfUpperLetters(someString.chars().filter(Character::isUpperCase).count());
        response.setNumberOfNumbers(someString.chars().filter(Character::isDigit).count());
        response.setNumberOfSpecialCharacters(someString.length()-response.getNumberOfLowerLetters()-response.getNumberOfNumbers()-response.getNumberOfUpperLetters());
        return response;
    }
}
