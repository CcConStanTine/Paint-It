import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BestScores {

    private List<Score> bestScores;

    public BestScores() {
        bestScores = new LinkedList<Score>();
    }

    public List<Score> getBestScores() {
        return bestScores;
    }

    public void addScoreIfOneOfTheBest(Score score) {
        if(bestScores.size() == 5) {
            bestScores.add(score);
            Collections.sort(bestScores);
            bestScores.remove(score);
        }
        else
            bestScores.add(score);
    }

}
