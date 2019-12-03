package com.example.demo;

public class Model {

    private final String someString;
    private long numberOfUpperLetters;
    private long numberOfLowerLetters;
    private long numberOfNumbers;
    private long numberOfSpecialCharacters;

    public Model(String someString, long numberOfUpperLetters) {
        this.someString = someString;
        this.numberOfUpperLetters = numberOfUpperLetters;
    }
}
