public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && chessBoard.board[line][column] != null) {
            int dir;
            int start;

            if (color.equals("White")) {
                dir = 1;
                start = 1;
            } else {
                dir = -1;
                start = 6;
            }

            if (line + dir == toLine) {
                return chessBoard.board[toLine][toColumn] == null;
            }

            if (line == start && line + 2 * dir == toLine) {
                return chessBoard.board[toLine][toColumn] == null && chessBoard.board[line + dir][column] == null;
            }

        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}