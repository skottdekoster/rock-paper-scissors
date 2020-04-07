package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
    	if ((mine == Move.ROCK && theirs == Move.SCISSORS) || (mine == Move.PAPER && theirs == Move.ROCK)
               || (mine == Move.SCISSORS && theirs == Move.PAPER)) {
           return Result.WIN;
       } else if ((mine == Move.ROCK && theirs == Move.PAPER) || (mine == Move.PAPER && theirs == Move.SCISSORS)
               || (mine == Move.SCISSORS && theirs == Move.ROCK)) {
           return Result.LOSE;
       } else {
           return Result.DRAW;
       }
}
}
