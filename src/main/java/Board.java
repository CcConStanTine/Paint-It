public class Board {

    private Tile[][] tile2DArray;


    public Board() {
        tile2DArray = new Tile[19][18];
        initialiseArrayElements();
        setTilesBounds();
    }

    public Tile[][] getTile2DArray() {
        return tile2DArray;
    }

    private void initialiseArrayElements() {
        for(int i=0;i<19;i++)
            for(int j=0;j<18;j++)
                tile2DArray[i][j]=new Tile();
    }

    private void setTilesBounds() {
        int a;
        for(int i=0;i<19;i++) {
            a = 25 + i*26;
            for(int j=0;j<18;j++) {
                tile2DArray[i][j].setBounds(100 + j*26, a, 25, 25);
            }
        }
    }

}
