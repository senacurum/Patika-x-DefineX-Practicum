import Service.BuildingService;
import Service.BuildingServiceImpl;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
public class Main {

    public static void main(String[] args) {
        BuildingService buildingService = new BuildingServiceImpl();

        System.out.println("\nHouses total price : " + buildingService.getTotalHousesPrices());
        System.out.println("Summerhouses total price : " + buildingService.getTotalSummerHousesPrices());
        System.out.println("Villas total price : " + buildingService.getTotalVillasPrices());
        System.out.println("All buildings total price :" + buildingService.getTotalAllBuildingsPrices());

        System.out.println("\nHouses average square meters : " + buildingService.getAverageHousesSquareMeters());
        System.out.println("Summerhouses average square meters : " + buildingService.getAverageSummerHousesSquareMeters());
        System.out.println("Villas average square meters : " + buildingService.getAverageVillasSquareMeters());
        System.out.println("All buildings average square meters : " + buildingService.getAverageAllBuildingsSquareMeters());

        System.out.println("\nFiltered buildings according to number of rooms and living rooms :\n");

        buildingService.getAllFilteredBuildings(3, 1).forEach(b ->
                System.out.println("Building Type: "+b.getBuildingType()+" - Room: "+b.getRoomNumber()+ " - Living Room: "+b.getLivingRoomNumber())
        );
    }
}
