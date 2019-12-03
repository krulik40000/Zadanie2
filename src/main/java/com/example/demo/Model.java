package com.example.demo;

public class Model {

    private final String someString;
    private long numberOfUpperLetters;
    private long numberOfLowerLetters;
    private long numberOfNumbers;
    private long numberOfSpecialCharacters;

    public Model(String someString) {
        this.someString = someString;
    }

    public void setNumberOfLowerLetters(long count) {
        numberOfLowerLetters=count;
    }

    public void setNumberOfUpperLetters(long count) {
        numberOfUpperLetters=count;
    }

    public void setNumberOfNumbers(long count) {
        numberOfNumbers=count;
    }

    public long getNumberOfLowerLetters() {
        return numberOfLowerLetters;
    }

    public long getNumberOfNumbers() {
        return numberOfNumbers;
    }

    public long getNumberOfUpperLetters() {
        return numberOfUpperLetters;
    }

    public void setNumberOfSpecialCharacters(long count) {
        numberOfSpecialCharacters = count;
    }
}
