public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }
    @Override
    public String getColor(){
        return this.color;
    }
}
