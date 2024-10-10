import javax.swing.*;

public class Forca extends JFrame {
    private final WordDB wordDB;

    // counts the number
    private int incorrectGuesses;
    public Forca(){

        super("JOGO DA FORCA (Java Ed.)");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        addguiComponents();

    }
    private void addguiComponents(){


    }
}
