public class Judge {
    public boolean areAllTilesPainted(int mapNumber, Tile[][] tile2DArray) {
        int amountOfPaintedFields=0;
        for(int i=0;i<tile2DArray.length;i++)
            for(int j=0;j<tile2DArray[i].length;j++) {
                if (tile2DArray[i][j].isPaintable()) {
                    if (tile2DArray[i][j].isPainted()) {
                        amountOfPaintedFields++;
                    }
                }
            }
        if(BoardManager.Maps.mapsSettings.get(mapNumber-1).getAmountOfPaintableFields() == amountOfPaintedFields)
            return true;
        else
            return false;
    }

}
