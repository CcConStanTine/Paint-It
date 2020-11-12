import java.util.HashMap;
import java.util.Map;

public class Score{

    private Map<Integer, Integer> mapsScores;

    public Score() {
        this.mapsScores = new HashMap<>();
    }

    public Map<Integer, Integer> getMapsScores() {
        return mapsScores;
    }

    public void setMapsScores(Map<Integer, Integer> mapsScores) {
        this.mapsScores = mapsScores;
    }

    public int getSum() {
        int sum = 0;
        for(Integer i : mapsScores.values())
            sum+=i;
        return sum;
    }
}
