package Repository;

import Entity.Abstract.Building;
import Entity.Enums.BuildingTypeEnum;
import Entity.House;
import Entity.SummerHouse;
import Entity.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
public class BuildingRepositoryImpl implements BuildingRepository{
    private static final List<Building> buildings = new ArrayList<>(
            Arrays.asList(
                    new House(5, 1, 220, BigDecimal.valueOf(3500.000)),
                    new House(3, 1, 100, BigDecimal.valueOf(1500.000)),
                    new House(1, 0, 60, BigDecimal.valueOf(650.000)),
                    new SummerHouse(2, 1, 70, BigDecimal.valueOf(800.000)),
                    new SummerHouse(3, 1, 95, BigDecimal.valueOf(1400.000)),
                    new SummerHouse(1, 1, 65, BigDecimal.valueOf(700.000)),
                    new Villa(3, 1, 115, BigDecimal.valueOf(1700.000)),
                    new Villa(5, 1, 240, BigDecimal.valueOf(4000.000)),
                    new Villa(4, 1, 125, BigDecimal.valueOf(2500.000))
            )
    );
    @Override
    public List<Building> getBuildingList() {
        return buildings;
    }

    @Override
    public List<House> getHouseList() {
        ArrayList<House> houses = new ArrayList<House>();

        for (Building item:buildings) {
            if(item.getBuildingType().equals(BuildingTypeEnum.House.label)) {
                houses.add((House)item);
            }
        }
        return houses;
    }
    @Override
    public List<Villa> getVillaList() {
        ArrayList<Villa> villas = new ArrayList<Villa>();
        for (Building item:buildings) {
            if(item.getBuildingType().equals(BuildingTypeEnum.Villa.label))
                villas.add((Villa) item);
        }
        return villas;
    }
    @Override
    public List<SummerHouse> getSummerHouseList() {
        ArrayList<SummerHouse> summerHouses = new ArrayList<SummerHouse>();
        for (Building item:buildings) {
            if(item.getBuildingType().equals(BuildingTypeEnum.SummerHouse.label))
                summerHouses.add((SummerHouse) item);
        }
        return summerHouses;
    }
}
