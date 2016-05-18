import java.util.Observable;

/**
 * Created by Bryan Quinn on 5/17/2016.
 *
 * Represent the model of the
 */
public class Model extends Observable{

    private int dimension;
    private char[][] board;
    private char winner;

    Model(int dimension){
        this.dimension = dimension;
        this.board = new char[dimension][dimension];
    }

    int getDim(){
        return this.dimension;
    }

    void addX(int col, int row){
        if (this.board[col][row] != 'X') {
            this.board[col][row] = 'X';
        }
        setChanged();
        notifyObservers();
    }

    char getPosition(int col, int row){
        return board[col][row];
    }

    public void addO(int col, int row){
        this.board[col][row] = 'O';
        notifyObservers();
    }
}
