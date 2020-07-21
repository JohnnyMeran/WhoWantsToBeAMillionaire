package ro.jademy.millionaire;

import ro.jademy.millionaire.model.Game;
import ro.jademy.millionaire.model.Question;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // 1. define objects
        // define properties
        // define methods

        // 2. define interactions


        // initialize questions
        List<Question> difficultyZeroQuestions = getRandomQuestions(5, 0);
        List<Question> difficultyOneQuestions = getRandomQuestions(5, 1);
        List<Question> difficultyTwoQuestions = getRandomQuestions(4, 2);
        List<Question> difficultyThreeQuestions = getRandomQuestions(1, 3);

        // initialize game
        Game game = new Game(difficultyZeroQuestions, difficultyOneQuestions, difficultyTwoQuestions, difficultyThreeQuestions);

        // TODO: start the game
        // game.start();
    }

    private static List<Question> getRandomQuestions(int nrOfQuestions, int difficulty) {
        // TODO
        // loop through all questions
        // get all questions of given difficulty
        // loop through sub-list until nrOfQuestions and select random items by index
        // return said list

        return new ArrayList<>();
    }

}
