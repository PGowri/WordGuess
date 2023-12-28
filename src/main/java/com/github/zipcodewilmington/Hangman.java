package com.github.zipcodewilmington;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
        private int guessNumber;
        private ArrayList<Character> listOfGuesses;
        private String wordToGuess;
        private  String[] words = {"cat", "dog", "bat", "cut", "ball"};
        private int maxNoOfGuesses;

        public Hangman(){
                this.guessNumber = 0;
                this.listOfGuesses = new ArrayList<Character>();
                this.wordToGuess = Arrays.toString(this.words);
                this.maxNoOfGuesses = this.wordToGuess.length();
        }

        public int getGuessNumber() {
                return guessNumber;
        }

        public void setGuessNumber(int guessNumber) {
                this.guessNumber = guessNumber;
        }

        public ArrayList<Character> getListOfGuesses() {
                return listOfGuesses;
        }

        public void setListOfGuesses(ArrayList<Character> listOfGuesses) {
                this.listOfGuesses = listOfGuesses;
        }

        public String getWordToGuess() {
                return wordToGuess;
        }

        public void setWordToGuess(String wordToGuess) {
                this.wordToGuess = wordToGuess;
        }

        public String[] getWords() {
                return words;
        }

        public void setWords(String[] words) {
                this.words = words;
        }

        public int getMaxNoOfGuesses() {
                return maxNoOfGuesses;
        }

        public void setMaxNoOfGuesses(int maxNoOfBuesses) {
                this.maxNoOfGuesses = maxNoOfBuesses;
        }
}
