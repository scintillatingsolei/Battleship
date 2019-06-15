/**
 * Ship represents one of the ship pieces on the battleship board.
 */
public class Ship{
    private ShipSquare[] ship; //an array of ShipSquares that represents a single ship
    /**
     * Constructs a ship according to the passed size.
     * @param shipSize the size of the ship to be created. (The size must be between 3 and 5)
     */
    public Ship(int shipSize){
        if(shipSize < 3 || shipSize > 5){
            throw new IllegalArgumentException("The size must be between 3 and 5.");
        }
        else{
            ship = new ShipSquare[shipSize];
            for(int i = 0; i < ship.length; i++)
                ship[i] = new ShipSquare();
        }
    }
    /**
     * Returns whether or not the ship has sunken.
     * @return whether or not the ship has sunken.
     */
    public boolean sunken(){
        boolean result = true;

        for(int i = 0; i < ship.length; i++)
            if(!(ship[i].isHit()))
                result = false;

        return result;
    }
}
