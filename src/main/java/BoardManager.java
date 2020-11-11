import java.util.Arrays;
import java.util.List;

public class BoardManager {

    public void cleanBoard(Tile[][] tile2DArray) {
        for(int i=0;i<19;i++)
            for(int j=0;j<18;j++) {
                tile2DArray[i][j].setPaintable(false);
                tile2DArray[i][j].setPainted(false);
            }
    }

    public void loadMap(int mapNumber, Tile[][] tile2DArray) {
        switch (mapNumber) {
            case 1: Maps.setSettingsOfMap1OnBoard(tile2DArray); break;
            case 2: Maps.setSettingsOfMap2OnBoard(tile2DArray); break;
            case 3: Maps.setSettingsOfMap3OnBoard(tile2DArray); break;
            case 4: Maps.setSettingsOfMap4OnBoard(tile2DArray); break;
            default: break;
        }
    }

    public static class Maps {

        public static final List<MapSettings> mapsSettings = Arrays.asList(
                new MapSettings(1, 138, 1, 1, 40),
                new MapSettings(2, 119, 12, 7, 39),
                new MapSettings(3, 123, 2, 7, 36),
                new MapSettings(4, 125, 9, 8, 46)
                );

        public static void setSettingsOfMap1OnBoard(Tile[][] tile2DArray) {
            tile2DArray[1][1].setPaintable(true);
            tile2DArray[1][2].setPaintable(true);
            tile2DArray[1][3].setPaintable(true);
            tile2DArray[1][4].setPaintable(true);
            tile2DArray[1][5].setPaintable(true);
            tile2DArray[1][6].setPaintable(true);
            tile2DArray[1][7].setPaintable(true);
            tile2DArray[1][8].setPaintable(true);
            tile2DArray[2][8].setPaintable(true);
            tile2DArray[3][8].setPaintable(true);
            tile2DArray[3][9].setPaintable(true);
            tile2DArray[3][10].setPaintable(true);
            tile2DArray[3][11].setPaintable(true);
            tile2DArray[3][12].setPaintable(true);
            tile2DArray[2][12].setPaintable(true);
            tile2DArray[1][12].setPaintable(true);
            tile2DArray[1][13].setPaintable(true);
            tile2DArray[1][14].setPaintable(true);
            tile2DArray[1][15].setPaintable(true);
            tile2DArray[1][16].setPaintable(true);
            tile2DArray[2][16].setPaintable(true);
            tile2DArray[2][15].setPaintable(true);
            tile2DArray[3][15].setPaintable(true);
            tile2DArray[4][15].setPaintable(true);
            tile2DArray[5][15].setPaintable(true);
            tile2DArray[6][15].setPaintable(true);
            tile2DArray[7][15].setPaintable(true);
            tile2DArray[8][15].setPaintable(true);
            tile2DArray[9][15].setPaintable(true);
            tile2DArray[10][15].setPaintable(true);
            tile2DArray[11][15].setPaintable(true);
            tile2DArray[12][15].setPaintable(true);
            tile2DArray[13][15].setPaintable(true);
            tile2DArray[14][15].setPaintable(true);
            tile2DArray[15][15].setPaintable(true);
            tile2DArray[16][15].setPaintable(true);
            tile2DArray[17][15].setPaintable(true);
            tile2DArray[5][16].setPaintable(true);
            tile2DArray[6][16].setPaintable(true);
            tile2DArray[7][16].setPaintable(true);
            tile2DArray[8][16].setPaintable(true);
            tile2DArray[9][16].setPaintable(true);
            tile2DArray[10][16].setPaintable(true);
            tile2DArray[11][16].setPaintable(true);
            tile2DArray[12][16].setPaintable(true);
            tile2DArray[13][16].setPaintable(true);
            tile2DArray[14][16].setPaintable(true);
            tile2DArray[15][16].setPaintable(true);
            tile2DArray[16][16].setPaintable(true);
            tile2DArray[17][16].setPaintable(true);
            tile2DArray[5][14].setPaintable(true);
            tile2DArray[6][14].setPaintable(true);
            tile2DArray[7][14].setPaintable(true);
            tile2DArray[8][14].setPaintable(true);
            tile2DArray[9][14].setPaintable(true);
            tile2DArray[10][14].setPaintable(true);
            tile2DArray[11][14].setPaintable(true);
            tile2DArray[12][14].setPaintable(true);
            tile2DArray[13][14].setPaintable(true);
            tile2DArray[14][14].setPaintable(true);
            tile2DArray[15][14].setPaintable(true);
            tile2DArray[16][14].setPaintable(true);
            tile2DArray[16][13].setPaintable(true);
            tile2DArray[16][12].setPaintable(true);
            tile2DArray[15][12].setPaintable(true);
            tile2DArray[14][12].setPaintable(true);
            tile2DArray[13][12].setPaintable(true);
            tile2DArray[12][12].setPaintable(true);
            tile2DArray[11][12].setPaintable(true);
            tile2DArray[10][12].setPaintable(true);
            tile2DArray[9][12].setPaintable(true);
            tile2DArray[8][12].setPaintable(true);
            tile2DArray[7][12].setPaintable(true);
            tile2DArray[6][12].setPaintable(true);
            tile2DArray[5][12].setPaintable(true);
            tile2DArray[5][11].setPaintable(true);
            tile2DArray[5][10].setPaintable(true);
            tile2DArray[5][9].setPaintable(true);
            tile2DArray[5][8].setPaintable(true);
            tile2DArray[5][7].setPaintable(true);
            tile2DArray[5][6].setPaintable(true);
            tile2DArray[4][6].setPaintable(true);
            tile2DArray[3][6].setPaintable(true);
            tile2DArray[3][5].setPaintable(true);
            tile2DArray[3][4].setPaintable(true);
            tile2DArray[3][3].setPaintable(true);
            tile2DArray[3][2].setPaintable(true);
            tile2DArray[3][1].setPaintable(true);
            tile2DArray[2][1].setPaintable(true);
            tile2DArray[6][6].setPaintable(true);
            tile2DArray[7][6].setPaintable(true);
            tile2DArray[8][6].setPaintable(true);
            tile2DArray[9][6].setPaintable(true);
            tile2DArray[10][6].setPaintable(true);
            tile2DArray[11][6].setPaintable(true);
            tile2DArray[12][6].setPaintable(true);
            tile2DArray[13][6].setPaintable(true);
            tile2DArray[14][6].setPaintable(true);
            tile2DArray[15][6].setPaintable(true);
            tile2DArray[16][6].setPaintable(true);
            tile2DArray[17][6].setPaintable(true);
            tile2DArray[17][5].setPaintable(true);
            tile2DArray[17][4].setPaintable(true);
            tile2DArray[17][3].setPaintable(true);
            tile2DArray[17][2].setPaintable(true);
            tile2DArray[16][2].setPaintable(true);
            tile2DArray[16][1].setPaintable(true);
            tile2DArray[16][3].setPaintable(true);
            tile2DArray[15][1].setPaintable(true);
            tile2DArray[15][3].setPaintable(true);
            tile2DArray[15][4].setPaintable(true);
            tile2DArray[14][1].setPaintable(true);
            tile2DArray[14][2].setPaintable(true);
            tile2DArray[14][3].setPaintable(true);
            tile2DArray[14][4].setPaintable(true);
            tile2DArray[13][3].setPaintable(true);
            tile2DArray[12][1].setPaintable(true);
            tile2DArray[12][2].setPaintable(true);
            tile2DArray[12][3].setPaintable(true);
            tile2DArray[12][4].setPaintable(true);
            tile2DArray[11][1].setPaintable(true);
            tile2DArray[11][4].setPaintable(true);
            tile2DArray[10][1].setPaintable(true);
            tile2DArray[10][2].setPaintable(true);
            tile2DArray[10][3].setPaintable(true);
            tile2DArray[10][4].setPaintable(true);
            tile2DArray[9][1].setPaintable(true);
            tile2DArray[9][3].setPaintable(true);
            tile2DArray[9][4].setPaintable(true);
            tile2DArray[8][1].setPaintable(true);
            tile2DArray[8][3].setPaintable(true);
            tile2DArray[8][4].setPaintable(true);
            tile2DArray[7][1].setPaintable(true);
            tile2DArray[7][2].setPaintable(true);
            tile2DArray[7][3].setPaintable(true);
            tile2DArray[6][3].setPaintable(true);
            tile2DArray[6][4].setPaintable(true);
            tile2DArray[6][5].setPaintable(true);
        }

        public static void setSettingsOfMap2OnBoard(Tile[][] tile2DArray) {
            tile2DArray[1][7].setPaintable(true);
            tile2DArray[1][8].setPaintable(true);
            tile2DArray[1][8].setPaintable(true);

            tile2DArray[2][6].setPaintable(true);
            tile2DArray[2][7].setPaintable(true);
            tile2DArray[2][8].setPaintable(true);
            tile2DArray[2][9].setPaintable(true);
            tile2DArray[2][10].setPaintable(true);
            tile2DArray[2][11].setPaintable(true);

            tile2DArray[3][6].setPaintable(true);
            tile2DArray[3][7].setPaintable(true);
            tile2DArray[3][10].setPaintable(true);
            tile2DArray[3][11].setPaintable(true);

            tile2DArray[4][2].setPaintable(true);
            tile2DArray[4][3].setPaintable(true);
            tile2DArray[4][4].setPaintable(true);
            tile2DArray[4][5].setPaintable(true);
            tile2DArray[4][6].setPaintable(true);
            tile2DArray[4][7].setPaintable(true);
            tile2DArray[4][10].setPaintable(true);
            tile2DArray[4][11].setPaintable(true);
            tile2DArray[4][12].setPaintable(true);
            tile2DArray[4][13].setPaintable(true);
            tile2DArray[4][14].setPaintable(true);

            tile2DArray[5][2].setPaintable(true);
            tile2DArray[5][5].setPaintable(true);
            tile2DArray[5][6].setPaintable(true);
            tile2DArray[5][10].setPaintable(true);
            tile2DArray[5][13].setPaintable(true);
            tile2DArray[5][14].setPaintable(true);
            tile2DArray[5][15].setPaintable(true);

            tile2DArray[6][2].setPaintable(true);
            tile2DArray[6][3].setPaintable(true);
            tile2DArray[6][4].setPaintable(true);
            tile2DArray[6][5].setPaintable(true);
            tile2DArray[6][10].setPaintable(true);
            tile2DArray[6][13].setPaintable(true);
            tile2DArray[6][14].setPaintable(true);
            tile2DArray[6][15].setPaintable(true);

            tile2DArray[7][4].setPaintable(true);
            tile2DArray[7][5].setPaintable(true);
            tile2DArray[7][7].setPaintable(true);
            tile2DArray[7][8].setPaintable(true);
            tile2DArray[7][9].setPaintable(true);
            tile2DArray[7][10].setPaintable(true);
            tile2DArray[7][13].setPaintable(true);
            tile2DArray[7][14].setPaintable(true);
            tile2DArray[7][15].setPaintable(true);

            tile2DArray[8][4].setPaintable(true);
            tile2DArray[8][5].setPaintable(true);
            tile2DArray[8][7].setPaintable(true);
            tile2DArray[8][13].setPaintable(true);
            tile2DArray[8][14].setPaintable(true);
            tile2DArray[8][15].setPaintable(true);

            tile2DArray[9][7].setPaintable(true);
            tile2DArray[9][13].setPaintable(true);
            tile2DArray[9][14].setPaintable(true);
            tile2DArray[9][15].setPaintable(true);

            tile2DArray[10][5].setPaintable(true);
            tile2DArray[10][6].setPaintable(true);
            tile2DArray[10][7].setPaintable(true);
            tile2DArray[10][8].setPaintable(true);
            tile2DArray[10][9].setPaintable(true);
            tile2DArray[10][10].setPaintable(true);
            tile2DArray[10][11].setPaintable(true);
            tile2DArray[10][12].setPaintable(true);
            tile2DArray[10][13].setPaintable(true);
            tile2DArray[10][14].setPaintable(true);
            tile2DArray[10][15].setPaintable(true);

            tile2DArray[11][5].setPaintable(true);
            tile2DArray[11][7].setPaintable(true);
            tile2DArray[11][14].setPaintable(true);
            tile2DArray[11][15].setPaintable(true);

            tile2DArray[12][5].setPaintable(true);
            tile2DArray[12][6].setPaintable(true);
            tile2DArray[12][7].setPaintable(true);
            tile2DArray[12][8].setPaintable(true);
            tile2DArray[12][9].setPaintable(true);
            tile2DArray[12][10].setPaintable(true);
            tile2DArray[12][11].setPaintable(true);
            tile2DArray[12][12].setPaintable(true);

            tile2DArray[13][7].setPaintable(true);
            tile2DArray[13][12].setPaintable(true);

            tile2DArray[14][7].setPaintable(true);
            tile2DArray[14][9].setPaintable(true);
            tile2DArray[14][10].setPaintable(true);
            tile2DArray[14][12].setPaintable(true);
            tile2DArray[14][13].setPaintable(true);
            tile2DArray[14][14].setPaintable(true);
            tile2DArray[14][15].setPaintable(true);
            tile2DArray[14][16].setPaintable(true);

            tile2DArray[15][1].setPaintable(true);
            tile2DArray[15][2].setPaintable(true);
            tile2DArray[15][3].setPaintable(true);
            tile2DArray[15][4].setPaintable(true);
            tile2DArray[15][5].setPaintable(true);
            tile2DArray[15][6].setPaintable(true);
            tile2DArray[15][7].setPaintable(true);
            tile2DArray[15][8].setPaintable(true);
            tile2DArray[15][9].setPaintable(true);
            tile2DArray[15][10].setPaintable(true);
            tile2DArray[15][11].setPaintable(true);
            tile2DArray[15][12].setPaintable(true);
            tile2DArray[15][13].setPaintable(true);
            tile2DArray[15][14].setPaintable(true);
            tile2DArray[15][15].setPaintable(true);
            tile2DArray[15][16].setPaintable(true);

            tile2DArray[16][1].setPaintable(true);
            tile2DArray[16][2].setPaintable(true);
            tile2DArray[16][3].setPaintable(true);
            tile2DArray[16][4].setPaintable(true);
            tile2DArray[16][5].setPaintable(true);
            tile2DArray[16][6].setPaintable(true);
            tile2DArray[16][7].setPaintable(true);
            tile2DArray[16][8].setPaintable(true);
            tile2DArray[16][9].setPaintable(true);
            tile2DArray[16][10].setPaintable(true);

            tile2DArray[17][7].setPaintable(true);
            tile2DArray[17][8].setPaintable(true);
            tile2DArray[17][9].setPaintable(true);
        }

        public static void setSettingsOfMap3OnBoard(Tile[][] tile2DArray) {
            tile2DArray[1][1].setPaintable(true);
            tile2DArray[1][2].setPaintable(true);
            tile2DArray[1][9].setPaintable(true);
            tile2DArray[1][10].setPaintable(true);
            tile2DArray[1][11].setPaintable(true);
            tile2DArray[1][12].setPaintable(true);
            tile2DArray[1][13].setPaintable(true);
            tile2DArray[1][14].setPaintable(true);
            tile2DArray[1][15].setPaintable(true);
            tile2DArray[1][16].setPaintable(true);

            tile2DArray[2][1].setPaintable(true);
            tile2DArray[2][2].setPaintable(true);
            tile2DArray[2][5].setPaintable(true);
            tile2DArray[2][6].setPaintable(true);
            tile2DArray[2][7].setPaintable(true);
            tile2DArray[2][8].setPaintable(true);
            tile2DArray[2][9].setPaintable(true);
            tile2DArray[2][10].setPaintable(true);
            tile2DArray[2][11].setPaintable(true);
            tile2DArray[2][16].setPaintable(true);

            tile2DArray[3][1].setPaintable(true);
            tile2DArray[3][2].setPaintable(true);
            tile2DArray[3][3].setPaintable(true);
            tile2DArray[3][4].setPaintable(true);
            tile2DArray[3][5].setPaintable(true);
            tile2DArray[3][7].setPaintable(true);
            tile2DArray[3][9].setPaintable(true);
            tile2DArray[3][11].setPaintable(true);
            tile2DArray[3][12].setPaintable(true);
            tile2DArray[3][15].setPaintable(true);
            tile2DArray[3][16].setPaintable(true);

            tile2DArray[4][2].setPaintable(true);
            tile2DArray[4][7].setPaintable(true);
            tile2DArray[4][9].setPaintable(true);
            tile2DArray[4][12].setPaintable(true);
            tile2DArray[4][15].setPaintable(true);

            tile2DArray[5][2].setPaintable(true);
            tile2DArray[5][7].setPaintable(true);
            tile2DArray[5][9].setPaintable(true);
            tile2DArray[5][12].setPaintable(true);
            tile2DArray[5][15].setPaintable(true);
            tile2DArray[5][16].setPaintable(true);

            tile2DArray[6][2].setPaintable(true);
            tile2DArray[6][7].setPaintable(true);
            tile2DArray[6][9].setPaintable(true);
            tile2DArray[6][10].setPaintable(true);
            tile2DArray[6][11].setPaintable(true);
            tile2DArray[6][12].setPaintable(true);
            tile2DArray[6][16].setPaintable(true);

            tile2DArray[7][2].setPaintable(true);
            tile2DArray[7][7].setPaintable(true);
            tile2DArray[7][16].setPaintable(true);

            tile2DArray[8][2].setPaintable(true);
            tile2DArray[8][7].setPaintable(true);
            tile2DArray[8][8].setPaintable(true);
            tile2DArray[8][9].setPaintable(true);
            tile2DArray[8][10].setPaintable(true);
            tile2DArray[8][11].setPaintable(true);
            tile2DArray[8][12].setPaintable(true);
            tile2DArray[8][13].setPaintable(true);
            tile2DArray[8][14].setPaintable(true);
            tile2DArray[8][15].setPaintable(true);
            tile2DArray[8][16].setPaintable(true);

            tile2DArray[9][1].setPaintable(true);
            tile2DArray[9][2].setPaintable(true);
            tile2DArray[9][3].setPaintable(true);
            tile2DArray[9][4].setPaintable(true);

            tile2DArray[10][1].setPaintable(true);
            tile2DArray[10][2].setPaintable(true);
            tile2DArray[10][4].setPaintable(true);

            tile2DArray[11][1].setPaintable(true);
            tile2DArray[11][2].setPaintable(true);
            tile2DArray[11][4].setPaintable(true);
            tile2DArray[11][6].setPaintable(true);
            tile2DArray[11][7].setPaintable(true);
            tile2DArray[11][8].setPaintable(true);
            tile2DArray[11][9].setPaintable(true);
            tile2DArray[11][10].setPaintable(true);

            tile2DArray[12][1].setPaintable(true);
            tile2DArray[12][2].setPaintable(true);
            tile2DArray[12][4].setPaintable(true);
            tile2DArray[12][6].setPaintable(true);
            tile2DArray[12][7].setPaintable(true);
            tile2DArray[12][8].setPaintable(true);
            tile2DArray[12][9].setPaintable(true);
            tile2DArray[12][10].setPaintable(true);
            tile2DArray[12][11].setPaintable(true);
            tile2DArray[12][12].setPaintable(true);
            tile2DArray[12][13].setPaintable(true);
            tile2DArray[12][15].setPaintable(true);
            tile2DArray[12][16].setPaintable(true);

            tile2DArray[13][1].setPaintable(true);
            tile2DArray[13][2].setPaintable(true);
            tile2DArray[13][3].setPaintable(true);
            tile2DArray[13][4].setPaintable(true);
            tile2DArray[13][10].setPaintable(true);
            tile2DArray[13][13].setPaintable(true);
            tile2DArray[13][15].setPaintable(true);
            tile2DArray[13][16].setPaintable(true);

            tile2DArray[14][1].setPaintable(true);
            tile2DArray[14][10].setPaintable(true);
            tile2DArray[14][12].setPaintable(true);
            tile2DArray[14][13].setPaintable(true);
            tile2DArray[14][14].setPaintable(true);
            tile2DArray[14][15].setPaintable(true);
            tile2DArray[14][16].setPaintable(true);

            tile2DArray[15][1].setPaintable(true);
            tile2DArray[15][2].setPaintable(true);
            tile2DArray[15][3].setPaintable(true);
            tile2DArray[15][4].setPaintable(true);
            tile2DArray[15][5].setPaintable(true);
            tile2DArray[15][6].setPaintable(true);
            tile2DArray[15][7].setPaintable(true);
            tile2DArray[15][8].setPaintable(true);
            tile2DArray[15][9].setPaintable(true);
            tile2DArray[15][10].setPaintable(true);
            tile2DArray[15][12].setPaintable(true);
            tile2DArray[15][13].setPaintable(true);
            tile2DArray[15][15].setPaintable(true);

            tile2DArray[16][12].setPaintable(true);
            tile2DArray[16][13].setPaintable(true);
            tile2DArray[16][15].setPaintable(true);

            tile2DArray[17][15].setPaintable(true);
        }

        public static void setSettingsOfMap4OnBoard(Tile[][] tile2DArray) {
            tile2DArray[1][5].setPaintable(true);
            tile2DArray[1][6].setPaintable(true);

            tile2DArray[2][5].setPaintable(true);
            tile2DArray[2][6].setPaintable(true);
            tile2DArray[2][7].setPaintable(true);
            tile2DArray[2][8].setPaintable(true);
            tile2DArray[2][9].setPaintable(true);
            tile2DArray[2][10].setPaintable(true);
            tile2DArray[2][11].setPaintable(true);
            tile2DArray[2][12].setPaintable(true);
            tile2DArray[2][13].setPaintable(true);

            tile2DArray[3][5].setPaintable(true);
            tile2DArray[3][6].setPaintable(true);
            tile2DArray[3][7].setPaintable(true);
            tile2DArray[3][13].setPaintable(true);

            tile2DArray[4][5].setPaintable(true);
            tile2DArray[4][13].setPaintable(true);
            tile2DArray[4][14].setPaintable(true);
            tile2DArray[4][15].setPaintable(true);
            tile2DArray[4][16].setPaintable(true);

            tile2DArray[5][5].setPaintable(true);
            tile2DArray[5][6].setPaintable(true);
            tile2DArray[5][7].setPaintable(true);
            tile2DArray[5][8].setPaintable(true);
            tile2DArray[5][9].setPaintable(true);
            tile2DArray[5][10].setPaintable(true);
            tile2DArray[5][11].setPaintable(true);
            tile2DArray[5][12].setPaintable(true);
            tile2DArray[5][13].setPaintable(true);
            tile2DArray[5][14].setPaintable(true);
            tile2DArray[5][16].setPaintable(true);

            tile2DArray[6][12].setPaintable(true);
            tile2DArray[6][13].setPaintable(true);
            tile2DArray[6][14].setPaintable(true);
            tile2DArray[6][16].setPaintable(true);

            tile2DArray[7][4].setPaintable(true);
            tile2DArray[7][5].setPaintable(true);
            tile2DArray[7][6].setPaintable(true);
            tile2DArray[7][7].setPaintable(true);
            tile2DArray[7][9].setPaintable(true);
            tile2DArray[7][10].setPaintable(true);
            tile2DArray[7][12].setPaintable(true);
            tile2DArray[7][13].setPaintable(true);
            tile2DArray[7][14].setPaintable(true);
            tile2DArray[7][16].setPaintable(true);

            tile2DArray[8][2].setPaintable(true);
            tile2DArray[8][3].setPaintable(true);
            tile2DArray[8][4].setPaintable(true);
            tile2DArray[8][5].setPaintable(true);
            tile2DArray[8][6].setPaintable(true);
            tile2DArray[8][7].setPaintable(true);
            tile2DArray[8][9].setPaintable(true);
            tile2DArray[8][10].setPaintable(true);
            tile2DArray[8][11].setPaintable(true);
            tile2DArray[8][12].setPaintable(true);
            tile2DArray[8][16].setPaintable(true);

            tile2DArray[9][2].setPaintable(true);
            tile2DArray[9][4].setPaintable(true);
            tile2DArray[9][5].setPaintable(true);
            tile2DArray[9][8].setPaintable(true);
            tile2DArray[9][9].setPaintable(true);
            tile2DArray[9][16].setPaintable(true);

            tile2DArray[10][2].setPaintable(true);
            tile2DArray[10][4].setPaintable(true);
            tile2DArray[10][5].setPaintable(true);
            tile2DArray[10][16].setPaintable(true);

            tile2DArray[11][2].setPaintable(true);
            tile2DArray[11][4].setPaintable(true);
            tile2DArray[11][5].setPaintable(true);
            tile2DArray[11][6].setPaintable(true);
            tile2DArray[11][7].setPaintable(true);
            tile2DArray[11][8].setPaintable(true);
            tile2DArray[11][9].setPaintable(true);
            tile2DArray[11][10].setPaintable(true);
            tile2DArray[11][11].setPaintable(true);
            tile2DArray[11][12].setPaintable(true);
            tile2DArray[11][13].setPaintable(true);
            tile2DArray[11][14].setPaintable(true);
            tile2DArray[11][15].setPaintable(true);
            tile2DArray[11][16].setPaintable(true);

            tile2DArray[12][2].setPaintable(true);
            tile2DArray[12][4].setPaintable(true);
            tile2DArray[12][5].setPaintable(true);

            tile2DArray[13][1].setPaintable(true);
            tile2DArray[13][2].setPaintable(true);
            tile2DArray[13][3].setPaintable(true);
            tile2DArray[13][8].setPaintable(true);
            tile2DArray[13][9].setPaintable(true);
            tile2DArray[13][10].setPaintable(true);
            tile2DArray[13][11].setPaintable(true);
            tile2DArray[13][12].setPaintable(true);
            tile2DArray[13][13].setPaintable(true);
            tile2DArray[13][14].setPaintable(true);
            tile2DArray[13][15].setPaintable(true);
            tile2DArray[13][16].setPaintable(true);

            tile2DArray[14][1].setPaintable(true);
            tile2DArray[14][2].setPaintable(true);
            tile2DArray[14][3].setPaintable(true);
            tile2DArray[14][5].setPaintable(true);
            tile2DArray[14][6].setPaintable(true);
            tile2DArray[14][8].setPaintable(true);
            tile2DArray[14][10].setPaintable(true);
            tile2DArray[14][11].setPaintable(true);
            tile2DArray[14][12].setPaintable(true);
            tile2DArray[14][13].setPaintable(true);
            tile2DArray[14][14].setPaintable(true);
            tile2DArray[14][15].setPaintable(true);
            tile2DArray[14][16].setPaintable(true);

            tile2DArray[15][3].setPaintable(true);
            tile2DArray[15][5].setPaintable(true);
            tile2DArray[15][6].setPaintable(true);
            tile2DArray[15][7].setPaintable(true);
            tile2DArray[15][8].setPaintable(true);
            tile2DArray[15][10].setPaintable(true);

            tile2DArray[16][1].setPaintable(true);
            tile2DArray[16][2].setPaintable(true);
            tile2DArray[16][3].setPaintable(true);
            tile2DArray[16][4].setPaintable(true);
            tile2DArray[16][5].setPaintable(true);
            tile2DArray[16][10].setPaintable(true);
            tile2DArray[16][11].setPaintable(true);
            tile2DArray[16][12].setPaintable(true);
            tile2DArray[16][13].setPaintable(true);
            tile2DArray[16][14].setPaintable(true);
            tile2DArray[16][15].setPaintable(true);
            tile2DArray[16][16].setPaintable(true);

            tile2DArray[17][1].setPaintable(true);
            tile2DArray[17][2].setPaintable(true);
            tile2DArray[17][3].setPaintable(true);
            tile2DArray[17][11].setPaintable(true);
            tile2DArray[17][12].setPaintable(true);
            tile2DArray[17][13].setPaintable(true);
            tile2DArray[17][14].setPaintable(true);
            tile2DArray[17][15].setPaintable(true);
            tile2DArray[17][16].setPaintable(true);
        }
    }
}
