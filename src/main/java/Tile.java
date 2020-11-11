import javax.swing.*;

public class Tile extends JPanel {

    private boolean isPaintable;

    private boolean isPainted;

    public Tile() {
        isPaintable = false;
        isPainted = false;
    }

    public boolean isPaintable() {
        return isPaintable;
    }

    public void setPaintable(boolean paintable) {
        isPaintable = paintable;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }
}
