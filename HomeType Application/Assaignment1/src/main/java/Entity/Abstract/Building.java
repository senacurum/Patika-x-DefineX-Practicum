/* Created a Building abstract class with its variables for its subclasses e.g. House,SummerHouse,Villa
*  This provides implementations for of the abstract methods in its parent class */

package Entity.Abstract;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
@Getter
@Setter
// Used @Getter @Setter annotations for reduce lines of code
public abstract class Building {
    private int roomNumber;
    private int livingRoomNumber;
    private int squareMeters;
    private BigDecimal priceAmount;
    private String buildingType;

    public Building(int roomNumber, int livingRoomNumber, int squareMeters, BigDecimal priceAmount,String buildingType) {
        this.roomNumber = roomNumber;
        this.livingRoomNumber = livingRoomNumber;
        this.squareMeters = squareMeters;
        this.priceAmount = priceAmount;
        this.buildingType=buildingType;
    }
    @Override
    public String toString() {
        return buildingType +"{"+
                "roomNumber=" + roomNumber +
                "livinRoomNumber'" + livingRoomNumber + "priceAmmount" +priceAmount+
                ", squaremetre=" + squareMeters +
                '}';
    }
}


