package Repository;

import Entity.Abstract.Building;
import Entity.House;
import Entity.SummerHouse;
import Entity.Villa;
import java.util.List;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
//I declared repository methods for use them in BuildingRepositoryImpl
public interface BuildingRepository {
    List<Building> getBuildingList();
    List<House> getHouseList();
    List<Villa> getVillaList();
    List<SummerHouse> getSummerHouseList();
}

