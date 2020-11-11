public class MapSettings {

    private final int mapNumber;
    private final int amountOfPaintableFieldsOnMap1;
    private final int startingPainterXPosition;
    private final int startingPainterYPosition;
    private final int leastPossibleAmountOfMoves;

    public MapSettings(int mapNumber, int amountOfPaintableFieldsOnMap1, int startingPainterXPosition, int startingPainterYPosition, int leastPossibleAmountOfMoves) {
        this.mapNumber = mapNumber;
        this.amountOfPaintableFieldsOnMap1 = amountOfPaintableFieldsOnMap1;
        this.startingPainterXPosition = startingPainterXPosition;
        this.startingPainterYPosition = startingPainterYPosition;
        this.leastPossibleAmountOfMoves = leastPossibleAmountOfMoves;
    }

    public int getMapNumber() {
        return mapNumber;
    }

    public int getAmountOfPaintableFieldsOnMap1() {
        return amountOfPaintableFieldsOnMap1;
    }

    public int getStartingPainterXPosition() {
        return startingPainterXPosition;
    }

    public int getStartingPainterYPosition() {
        return startingPainterYPosition;
    }

    public int getLeastPossibleAmountOfMoves() {
        return leastPossibleAmountOfMoves;
    }
}
