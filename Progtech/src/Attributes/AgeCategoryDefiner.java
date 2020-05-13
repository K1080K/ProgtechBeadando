package Attributes;

import Creatures.Castes.Race;

public class AgeCategoryDefiner {

    //region Racial age category Finder Function

    public int RacialAgeCategoryFinder(Race race, int age){
        if(race == Race.DWARF) return DwarfAgeCategories(age);
        else if(race == Race.ORC) return OrcAgeCategories(age);
        else if(race == Race.ELF) return ElfAgeCategories(age);
        else return HumanAgeCategories(age);
    }

    //endregion

    //region Age category selection with functions for all implemented races

    public int DwarfAgeCategories(int age){
        if(25 <= age && age <= 40) return 1;
        else if(41 <= age && age <= 350) return 2;
        else if(351 <= age && age <= 600) return 3;
        else if(601 <= age && age <= 680) return 4;
        else if(681 <= age && age <= 750) return 5;
        else return 6;
    }

    public int OrcAgeCategories(int age){
        if(12 <= age && age <= 14) return 1;
        else if(15 <= age && age <= 25) return 2;
        else if(26 <= age && age <= 35) return 3;
        else if(36 <= age && age <= 50) return 4;
        else if(51 <= age && age <= 60) return 5;
        else return 6;
    }

    public int ElfAgeCategories(int age){
        if(30 <= age && age <= 50) return 1;
        else if(51 <= age && age <= 1400) return 2;
        else if(1401 <= age && age <= 1600) return 3;
        else if(1601 <= age && age <= 1800) return 4;
        else if(1801 <= age && age <= 1900) return 5;
        else return 6;
    }

    public int HumanAgeCategories(int age){
        if(13 <= age && age <= 16) return 1;
        else if(17 <= age && age <= 30) return 2;
        else if(31 <= age && age <= 42) return 3;
        else if(43 <= age && age <= 55) return 4;
        else if(56 <= age && age <= 75) return 5;
        else return 6;
    }

    //endregion
}
