package Entity.Enums;
/*
@Title:Assaignment1
@author:Senanur Curum
@version:java version "17.0.6"
@Date:2023-01-17
*/
// Created Enum for in case of using many of the same type buildings. It helps write clearer and more readable code
public enum BuildingTypeEnum {
    House("House"),
    SummerHouse("Summerhouse"),
    Villa("Villa");
    public final String label;
    BuildingTypeEnum(String label) {
        this.label=label;
    }
}
