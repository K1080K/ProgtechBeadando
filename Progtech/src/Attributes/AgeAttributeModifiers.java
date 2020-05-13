package Attributes;

import Creatures.Castes.Race;

public class AgeAttributeModifiers {

    //region Field and properties and constructor

    private AgeCategoryDefiner acd;

    public AgeCategoryDefiner getAcd() { return acd; }
    public void setAcd(AgeCategoryDefiner acd) { this.acd = acd; }

    public AgeAttributeModifiers(){
        this.acd = new AgeCategoryDefiner();
    }

    //endregion

    //region These functions are giving back the age modifier integers for all main attributes

    public int StrengthAgeModifier(Race race, int age){
        int modifier = 0;
        int age_category = acd.RacialAgeCategoryFinder(race, age);
        switch(age_category){
            case 1:
                modifier = -2;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                modifier = -1;
                break;
            case 5:
                modifier = -3;
                break;
            case 6:
                modifier = -5;
                break;
        }
        return modifier;
    }

    public int DexterityAgeModifier(Race race, int age){
        int modifier = 0;
        int age_category = acd.RacialAgeCategoryFinder(race, age);
        switch(age_category){
            case 1:
                break;
            case 2:
                break;
            case 3:
                modifier = -1;
                break;
            case 4:
                modifier = -2;
                break;
            case 5:
                modifier = -4;
                break;
            case 6:
                modifier = -6;
                break;
        }
        return modifier;
    }

    public int QuicknessAgeModifier(Race race, int age){
        int modifier = 0;
        int age_category = acd.RacialAgeCategoryFinder(race, age);
        switch(age_category){
            case 1:
                break;
            case 2:
                break;
            case 3:
                modifier = -1;
                break;
            case 4:
                modifier = -3;
                break;
            case 5:
                modifier = -5;
                break;
            case 6:
                modifier = -7;
                break;
        }
        return modifier;
    }

    public int EnduranceAgeModifier(Race race, int age){
        int modifier = 0;
        int age_category = acd.RacialAgeCategoryFinder(race, age);
        switch(age_category){
            case 1:
                modifier = -1;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                modifier = -1;
                break;
            case 5:
                modifier = -3;
                break;
            case 6:
                modifier = -5;
                break;
        }
        return modifier;
    }

    public int HealthAgeModifier(Race race, int age){
        int modifier = 0;
        int age_category = acd.RacialAgeCategoryFinder(race, age);
        switch(age_category){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                modifier = -1;
                break;
            case 5:
                modifier = -2;
                break;
            case 6:
                modifier = -4;
                break;
        }
        return modifier;
    }

    //endregion

}
