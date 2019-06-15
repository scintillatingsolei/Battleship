/**
 * ShipSquare represents the square position of a square of a ship.
 *
 * @author Omri Habot
 * @version 1.0.0
 * @created June 14, 2019
 */
public class ShipSquare {

    private boolean isHit; //tells whether or not the location is hit

    /**
     * Constructor initializes isHit to false.
     */
    public ShipSquare() {
        isHit = false;
    }

    /**
     * Sets isHit to true.
     */
    public void hit() {
        isHit = true;
    }

    /**
     * Tells whether or not the square has been hit.
     * @return whether or not the square has been hit.
     */
    public boolean isHit(){
        return isHit;
    }

}
