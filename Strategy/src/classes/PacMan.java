package classes;

import interfaces.Moves;

public class PacMan {
    private Moves movements;

    public void setMovements(Moves movements) {
        this.movements = movements;
    }

    public void move(){
        movements.movement();
    }
}
