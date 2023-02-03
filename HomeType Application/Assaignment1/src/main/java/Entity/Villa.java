package Entity;

import Entity.Abstract.Building;
import Entity.Enums.BuildingTypeEnum;

import java.math.BigDecimal;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
public class Villa extends Building {

    public Villa(int roomNumber, int livingRoomNumber, int squareMeters, BigDecimal priceAmount) {
        super(roomNumber, livingRoomNumber, squareMeters, priceAmount, BuildingTypeEnum.Villa.label);
    }
}
