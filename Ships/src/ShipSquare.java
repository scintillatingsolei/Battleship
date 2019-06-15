public class ShipSquare {
    private boolean isHit; //tells whether or not the location is hit

    public ShipSquare() {
        isHit = false;
    }

    public void hit() {
        isHit = true;
    }

    public boolean isHit(){
        return isHit;
    }
}
