import Implementacoes.MoveDown;
import Implementacoes.MoveLeft;
import Implementacoes.MoveRight;
import Implementacoes.MoveUp;
import classes.PacMan;

public class App {
    public static void main(String[] args) throws Exception {
        MoveUp up = new MoveUp();
        MoveDown down = new MoveDown();
        MoveLeft left = new MoveLeft();
        MoveRight right = new MoveRight();

        PacMan pacMan = new PacMan();

        pacMan.setMovements(up);
        pacMan.move();
        pacMan.move();
        pacMan.setMovements(down);
        pacMan.move();
        pacMan.setMovements(right);
        pacMan.move();
        pacMan.move();
        pacMan.move();
        pacMan.setMovements(left);
        pacMan.move();
        pacMan.move();
    }
}
