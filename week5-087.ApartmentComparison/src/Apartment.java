
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceOfApartment;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.priceOfApartment = pricePerSquareMeter * squareMeters;
    }

    public boolean larger(Apartment otherApartment){
        if (this.squareMeters> otherApartment.squareMeters){
            return true;
        }
        else return false;
    }

    public int priceDifference(Apartment otherApartment){
        if (this.priceOfApartment>otherApartment.priceOfApartment){
            return this.priceOfApartment - otherApartment.priceOfApartment;
        }
        else return otherApartment.priceOfApartment - this.priceOfApartment;

    }
    
}
