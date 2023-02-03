package Service;

import Entity.Abstract.Building;
import Entity.House;
import Entity.SummerHouse;
import Entity.Villa;
import Repository.BuildingRepository;
import Repository.BuildingRepositoryImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
//In here I implemented Building Service to use its methods and defined a BuildingRepository object.
// This object provides use BuildingRepositoryImpl methods.
public class BuildingServiceImpl implements BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingServiceImpl() {
        this.buildingRepository=new BuildingRepositoryImpl();
    }

    @Override
    public BigDecimal getTotalHousesPrices() {
        List<House> houses= buildingRepository.getHouseList();
        BigDecimal totalprices=BigDecimal.ZERO;
        for(House h:houses){
            totalprices = totalprices.add(h.getPriceAmount());
        }
        return totalprices;
    }

    @Override
    public BigDecimal getTotalVillasPrices() {
        List<Villa> villas= buildingRepository.getVillaList();
        BigDecimal totalprices=BigDecimal.ZERO;
        for(Villa v:villas){
            totalprices = totalprices.add(v.getPriceAmount());
        }
        return totalprices;
    }

    @Override
    public BigDecimal getTotalSummerHousesPrices() {
        List<SummerHouse> summerHouses= buildingRepository.getSummerHouseList();
        BigDecimal totalprices=BigDecimal.ZERO;
        for(SummerHouse sh:summerHouses){
            totalprices = totalprices.add(sh.getPriceAmount());
        }
        return totalprices;
    }

    @Override
    public BigDecimal getTotalAllBuildingsPrices() {
        List<Building> buildings= buildingRepository.getBuildingList();
        BigDecimal totalprices=BigDecimal.ZERO;
        for(Building all:buildings){
            totalprices = totalprices.add(all.getPriceAmount());
        }
        return totalprices;
    }

    @Override
    public float getAverageHousesSquareMeters() {
        List<House> houses= buildingRepository.getHouseList();
        float totalsm=0;
        for(House h:houses){
            totalsm += h.getSquareMeters();
        }
        return totalsm/houses.size();
    }

    @Override
    public float getAverageVillasSquareMeters() {
        List<Villa> villas= buildingRepository.getVillaList();
        float totalsm=0;
        for(Villa v:villas){
            totalsm += v.getSquareMeters();
        }
        return totalsm/villas.size();
    }

    @Override
    public float getAverageSummerHousesSquareMeters() {
        List<SummerHouse> summerHouses= buildingRepository.getSummerHouseList();
        float totalsm=0;
        for(SummerHouse sh:summerHouses){
            totalsm += sh.getSquareMeters();
        }
        return totalsm/summerHouses.size();
    }

    @Override
    public float getAverageAllBuildingsSquareMeters() {
        List<Building> buildings= buildingRepository.getBuildingList();
        float totalsm=0;
        for(Building all:buildings){
            totalsm += all.getSquareMeters();
        }
        return totalsm/buildings.size();
    }

    @Override
    public List<Building> getAllFilteredBuildings(int roomNumber, int livingRoomNumber) {
        List<Building> buildings= buildingRepository.getBuildingList();
        List filtered= buildings.stream().filter(b->b.getRoomNumber()==roomNumber).filter(b->b.getLivingRoomNumber()==livingRoomNumber).collect(Collectors.toList());
        return filtered;
    }
}
