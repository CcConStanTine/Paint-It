import java.util.Map;

public class Score implements Comparable<Score>{

    private Map<Integer, Integer> mapsScores;

    public Score(Map<Integer, Integer> mapsScores) {
        this.mapsScores = mapsScores;
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

    public int compareTo(Score o) {
        int sum1 = this.getSum(), sum2 = o.getSum();
        if(sum1 == sum2)
            return 0;
        else if (sum1 > sum2)
            return 1;
        else
            return -1;
    }
}
