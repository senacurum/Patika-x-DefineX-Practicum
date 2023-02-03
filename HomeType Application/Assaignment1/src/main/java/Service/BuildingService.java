package Service;

import Entity.Abstract.Building;

import java.math.BigDecimal;
import java.util.List;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
//I declared service methods for use them in BuildingServiceImp
public interface BuildingService {
    BigDecimal getTotalHousesPrices();
    BigDecimal getTotalVillasPrices();
    BigDecimal getTotalSummerHousesPrices();
    BigDecimal getTotalAllBuildingsPrices();
    float getAverageHousesSquareMeters();
    float getAverageVillasSquareMeters();
    float getAverageSummerHousesSquareMeters();
    float getAverageAllBuildingsSquareMeters();
    List<Building> getAllFilteredBuildings(int roomNumber,int livingRoomNumber);
}
