package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves(); // método abstrato que depende da implementação na classe concreta retorna uma matriz de booleanos baseada em possiveis movimentos

    public boolean possibleMove(Position position) {    //retorna true ou false para um movimento indicado a partir de uma posição dada e que será analisada  a partir do método abstrato
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean mat[][] = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
