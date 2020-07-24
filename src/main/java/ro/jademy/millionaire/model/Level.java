package ro.jademy.millionaire.model;

import java.util.List;

public class Level {

    private int number;
    private int difficultyLevel;
    private int reward;
    private int rewardBreakout;

    public Level(int number, int difficultyLevel, int reward, int rewardBreakout) {
        this.number = number;
        this.difficultyLevel = difficultyLevel;
        this.reward = reward;
        this.rewardBreakout = rewardBreakout;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getRewardBreakout() {
        return rewardBreakout;
    }

    public void setRewardBreakout(int rewardBreakout) {
        this.rewardBreakout = rewardBreakout;
    }

    public void incrementCurrentLevelFrom(List<Level> levels){
        for (Level indexCurrentLevel:levels){
            if(indexCurrentLevel.equals(this)){
                if(levels.get(levels.indexOf(indexCurrentLevel)+1)!= null){
                    this.number = levels.get(levels.indexOf(indexCurrentLevel)).number;
                    this.difficultyLevel = levels.get(levels.indexOf(indexCurrentLevel)).difficultyLevel;
                    this.reward = levels.get(levels.indexOf(indexCurrentLevel)).reward;
                    this.rewardBreakout = levels.get(levels.indexOf(indexCurrentLevel)).rewardBreakout;
                }
            }
        }
    }
}
