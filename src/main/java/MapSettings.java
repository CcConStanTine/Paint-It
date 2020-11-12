public class MapSettings {

    private final int mapNumber;
    private final int amountOfPaintableFields;
    private final int startingPainterXPosition;
    private final int startingPainterYPosition;
    private final int leastPossibleAmountOfMoves;

    public MapSettings(int mapNumber, int amountOfPaintableFields, int startingPainterXPosition, int startingPainterYPosition, int leastPossibleAmountOfMoves) {
        this.mapNumber = mapNumber;
        this.amountOfPaintableFields = amountOfPaintableFields;
        this.startingPainterXPosition = startingPainterXPosition;
        this.startingPainterYPosition = startingPainterYPosition;
        this.leastPossibleAmountOfMoves = leastPossibleAmountOfMoves;
    }

    public int getMapNumber() {
        return mapNumber;
    }

    public int getAmountOfPaintableFields() {
        return amountOfPaintableFields;
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
