import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); //tu ustawiam że okienko wyświetla się na środku ekranu
        frame.setResizable(false); // tutaj użytkownik nie może zmieniać wielkości okienka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kiedy użytkownik przyciśnie x na okienku

        pacman pacmanGame = new pacman();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);
    }
}


//tutaj ogólie nie chcemy mieć widocznego okna, dopóki wszystkie komponenty się w nim nie znajdują