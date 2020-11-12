import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements ActionListener, KeyListener {

    private JButton bHowToPlay, bPlay, bBack;
    private JLabel logo;
    private JLabel[] desc;
    private JLabel moves;
    private JLabel[] results;

         Board board;
         BoardManager boardManager;
         Painter painter;
         Judge judge;
         Score score;

    int amountOfPaintableFields;
    int leastPossibleMoves;
    int currentMapNumber;
    int amountOfMoves;

    public Frame() throws HeadlessException {

        // Main Frame settings
        super("Paint-It!");

        //Buttons settings
        setButtonsSettings();
        bHowToPlay.addActionListener(this); bPlay.addActionListener(this); bBack.addActionListener(this);
        bHowToPlay.setFocusable(false); bPlay.setFocusable(false); bBack.setFocusable(false);
        add(bHowToPlay); add(bPlay); add(bBack);

        //Labels settings
        setLabelsSettings();


        board = new Board();
        boardManager = new BoardManager();
        painter = new Painter();
        painter.setStartingPosition(1, 1);
        judge = new Judge();
        score = new Score();
        amountOfPaintableFields = 0;
        leastPossibleMoves = 0;
        currentMapNumber = 1;

        add(logo);
        for (JLabel jLabel : desc) add(jLabel);
        add(moves);
        for(JLabel jLabel : results) add(jLabel);
        for(int i=0;i<19;i++) {
            for(int j=0;j<18;j++) {
                add(board.getTile2DArray()[i][j]);
            }
        }

        setStartingElementsVisibility();

        setLayout(null);

        setFrameSettings();
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        this.addKeyListener(this);
        if(src==bPlay) {
            setElementsVisibilityAfterPlayPressed();
            startMap(1);
        }
        else if(src==bHowToPlay)
            setElementsVisibilityAfterHowToPlayPressed();
        else if(src==bBack)
            setStartingElementsVisibility();
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_RIGHT
                || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(e.getKeyCode() == KeyEvent.VK_UP) {
                makeMove(1, painter, board.getTile2DArray());
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                makeMove(2, painter, board.getTile2DArray());
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                makeMove(3, painter, board.getTile2DArray());
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                makeMove(4, painter, board.getTile2DArray());
            }
            if(judge.areAllTilesPainted(currentMapNumber, board.getTile2DArray())) {
                boardManager.cleanBoard(board.getTile2DArray());
                score.getMapsScores().put(currentMapNumber, amountOfMoves);
                currentMapNumber++;
                if(currentMapNumber == 5) {
                    currentMapNumber = 1;
                    setSummaryElementsVisibility();
                }
                else {
                    amountOfMoves = 0;
                    startMap(currentMapNumber);
                }
            }
        }
        else if(e.getKeyCode()== KeyEvent.VK_P) {
            amountOfMoves = 0;
            moves.setText("Moves amount: " + amountOfMoves);
            boardManager.cleanBoard(board.getTile2DArray());
            startMap(currentMapNumber);
        }
        else if(e.getKeyCode()== KeyEvent.VK_ESCAPE) {
            score = new Score();
            amountOfMoves = 0;
            currentMapNumber=1;
            setStartingElementsVisibility();
            boardManager.cleanBoard(board.getTile2DArray());
        }
    }

    private void startMap(int mapNumber) {
        boardManager.loadMap(mapNumber, painter, board.getTile2DArray(), amountOfPaintableFields, leastPossibleMoves);
    }

    private void makeMove(int side, Painter painter, Tile[][] tile2DArray) {

        switch (side) {

            //up
            case 1: {
                tile2DArray[painter.getX()][painter.getY()].setPainted(true);
                tile2DArray[painter.getX()][painter.getY()].setBackground(Color.ORANGE);
                int newPainterXPosition = painter.getX();
                boolean didMoveHappen = false;
                for(int i=painter.getX()-1; i>=0; i--) {
                    if (!tile2DArray[i][painter.getY()].isPaintable()) {
                        if(!didMoveHappen) { }

                        break;
                    }
                    else {
                        tile2DArray[i][painter.getY()].setPainted(true);
                        newPainterXPosition = i;
                        didMoveHappen=true;
                        tile2DArray[i][painter.getY()].setBackground(Color.ORANGE);
                    }
                }
                tile2DArray[newPainterXPosition][painter.getY()].setBackground(Color.YELLOW);
                painter.setX(newPainterXPosition);
                moves.setText("Moves amount: " + ++amountOfMoves);
            } break;

            //right
            case 2: {
                tile2DArray[painter.getX()][painter.getY()].setPainted(true);
                tile2DArray[painter.getX()][painter.getY()].setBackground(Color.ORANGE);
                int newPainterYPosition = painter.getY();
                boolean didMoveHappen = false;
                for(int i=painter.getY()+1; i<tile2DArray[painter.getY()].length; i++) {
                    if(!tile2DArray[painter.getX()][i].isPaintable()) {
                        if(!didMoveHappen) { }

                        break;
                    }
                    else {
                        tile2DArray[painter.getX()][i].setPainted(true);
                        newPainterYPosition = i;
                        didMoveHappen=true;
                        tile2DArray[painter.getX()][newPainterYPosition].setBackground(Color.YELLOW);
                        tile2DArray[painter.getX()][i].setBackground(Color.ORANGE);
                    }
                }
                tile2DArray[painter.getX()][newPainterYPosition].setBackground(Color.YELLOW);
                painter.setY(newPainterYPosition);
                moves.setText("Moves amount: " + ++amountOfMoves);
            } break;

            //down
            case 3: {
                tile2DArray[painter.getX()][painter.getY()].setPainted(true);
                tile2DArray[painter.getX()][painter.getY()].setBackground(Color.ORANGE);
                int newPainterXPosition = painter.getX();
                boolean didMoveHappen = false;

                for(int i=painter.getX()+1; i<tile2DArray.length; i++) {
                    if(!tile2DArray[i][painter.getY()].isPaintable()) {
                        if(!didMoveHappen) { }

                        break;
                    }
                    else {
                        tile2DArray[i][painter.getY()].setPainted(true);
                        newPainterXPosition = i;
                        didMoveHappen=true;
                        tile2DArray[newPainterXPosition][painter.getY()].setBackground(Color.YELLOW);
                        tile2DArray[i][painter.getY()].setBackground(Color.ORANGE);
                    }
                }
                tile2DArray[newPainterXPosition][painter.getY()].setBackground(Color.YELLOW);
                painter.setX(newPainterXPosition);
                moves.setText("Moves amount: " + ++amountOfMoves);
            } break;

            //left
            case 4: {
                tile2DArray[painter.getX()][painter.getY()].setPainted(true);
                tile2DArray[painter.getX()][painter.getY()].setBackground(Color.ORANGE);
                int newPainterYPosition = painter.getY();
                boolean didMoveHappen = false;

                for(int i=painter.getY()-1; i>=0; i--) {
                    if(!tile2DArray[painter.getX()][i].isPaintable()) {
                        if(!didMoveHappen) { }

                        break;
                    }
                    else {
                        tile2DArray[painter.getX()][i].setPainted(true);
                        newPainterYPosition = i;
                        didMoveHappen=true;
                        tile2DArray[painter.getX()][newPainterYPosition].setBackground(Color.YELLOW);
                        tile2DArray[painter.getX()][i].setBackground(Color.ORANGE);
                    }
                }
                tile2DArray[painter.getX()][newPainterYPosition].setBackground(Color.YELLOW);
                painter.setY(newPainterYPosition);
                moves.setText("Moves amount: " + ++amountOfMoves);
            } break;
            default: break;
        }

    }

    private void setSummaryElementsVisibility() {
        bPlay.setVisible(false);
        bPlay.setVisible(false);
        bHowToPlay.setVisible(false);
        bBack.setVisible(true);
        logo.setVisible(true);
        for (JLabel jLabel : desc) jLabel.setVisible(false);
        moves.setVisible(false);
        for(JLabel jLabel : results) jLabel.setVisible(false);
        for(int i=0;i<19;i++) {
            for(int j=0;j<18;j++) {
                board.getTile2DArray()[i][j].setVisible(false);
            }
        }
        for(int i=0; i<results.length;i++) {
            int mapScore = score.getMapsScores().get(i+1);
            int leastAmountOfMoves = BoardManager.Maps.mapsSettings.get(i).getLeastPossibleAmountOfMoves();
            if(leastAmountOfMoves==mapScore)
                results[i].setText("Map " + (i+1) + " - amount of moves: " + mapScore + " - Congratz! Best possible score. ");
            else if (mapScore>leastAmountOfMoves && mapScore<=leastAmountOfMoves+2)
                results[i].setText("Map " + (i+1) + " - amount of moves: " + mapScore + " - Good job! You were very close. ");
            else if (mapScore>leastAmountOfMoves+2 && mapScore<=leastAmountOfMoves+5)
                results[i].setText("Map " + (i+1) + " - amount of moves: " + mapScore + " - Not bad, but you could do better. ");
            else if (mapScore>leastAmountOfMoves+5)
                results[i].setText("Map " + (i+1) + " - amount of moves: " + mapScore + " - There is a shorter way, try again. ");
        }

        for(int i=0; i<results.length;i++) {
            results[i].setVisible(true);
        }

    }

    private void setStartingElementsVisibility() {
        bPlay.setVisible(true);
        bHowToPlay.setVisible(true);
        bBack.setVisible(false);
        logo.setVisible(true);
        for (JLabel jLabel : desc) jLabel.setVisible(false);
        moves.setVisible(false);
        for(JLabel jLabel : results) jLabel.setVisible(false);
        for(int i=0;i<19;i++) {
            for(int j=0;j<18;j++) {
                board.getTile2DArray()[i][j].setVisible(false);
            }
        }
    }

    private void setElementsVisibilityAfterHowToPlayPressed() {
        bPlay.setVisible(false);
        bHowToPlay.setVisible(false);
        bBack.setVisible(true);
        logo.setVisible(true);
        for (JLabel jLabel : desc) jLabel.setVisible(true);
        moves.setVisible(false);
        for(JLabel jLabel : results) jLabel.setVisible(false);
        for(int i=0;i<19;i++) {
            for(int j=0;j<18;j++) {
                board.getTile2DArray()[i][j].setVisible(false);
            }
        }
    }

    private void setElementsVisibilityAfterPlayPressed() {
        bPlay.setVisible(false);
        bHowToPlay.setVisible(false);
        bBack.setVisible(false);
        logo.setVisible(false);
        for (JLabel jLabel : desc) jLabel.setVisible(false);
        moves.setVisible(true);
        for(JLabel jLabel : results) jLabel.setVisible(false);
        for(int i=0;i<19;i++) {
            for(int j=0;j<18;j++) {
                board.getTile2DArray()[i][j].setVisible(true);
            }
        }
    }

    private void setLabelsSettings() {
        logo = new JLabel("Paint-It!");
        logo.setBounds(270, 100, 300, 100);
        logo.setFont(new Font("SansSerif",Font.BOLD, 40));
        logo.setForeground(Color.YELLOW);

        desc = new JLabel[3];
        desc[0] = new JLabel("You can move your painter by pressing the arrow keys. ");
        desc[1] = new JLabel("Your task is to paint all the fields in the least possible amount of moves. ");
        desc[2] = new JLabel("'P' key starts the map again, and 'ESC' take you to menu. ");

        desc[0].setFont(new Font("SansSerif", Font.BOLD, 16));
        desc[1].setFont(new Font("SansSerif", Font.BOLD, 16));
        desc[2].setFont(new Font("SansSerif", Font.BOLD, 16));

        desc[0].setBounds(140, 300, 600, 40);
        desc[1].setBounds(90, 320, 600, 40);
        desc[2].setBounds(130, 340, 600, 40);

        desc[0].setForeground(Color.white);
        desc[1].setForeground(Color.white);
        desc[2].setForeground(Color.white);

        moves = new JLabel("Moves amount: 0");
        moves.setFont(new Font("SansSerif", Font.BOLD, 20));
        moves.setBounds(265, 525, 200, 30);
        moves.setForeground(Color.white);

        results = new JLabel[4];
        for (int i=0;i<4;i++) {
            results[i] = new JLabel();
            results[i].setFont(new Font("SansSerif", Font.BOLD, 16));
            results[i].setBounds(100, 200+i*40, 650, 30);
            results[i].setForeground(Color.white);
        }

    }

    private void setButtonsSettings() {
        bPlay = new JButton("Play!");
        bPlay.setBounds(115, 350, 150, 50);
        bHowToPlay = new JButton("How to play?");
        bHowToPlay.setBounds(440, 350, 150, 50);
        bBack = new JButton("Back");
        bBack.setBounds(275, 400, 150, 50);
    }

    private void setFrameSettings() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocation(400, 100);
        setSize(700, 600);
        getContentPane().setBackground(Color.black);
    }

}
