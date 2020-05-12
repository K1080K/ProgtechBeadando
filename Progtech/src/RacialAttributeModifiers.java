public class RacialAttributeModifiers {

    //region Racial attribute modifier functions

    public int StrengthRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 2;
        }
        else if(race == Race.ELF){
            modifier = -2;
        }
        return modifier;
    }

    public int DexterityRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = -1;
        }
        else if(race == Race.ORC){
            modifier = -1;
        }
        else if(race == Race.ELF){
            modifier = 2;
        }
        return modifier;
    }

    public int QuicknessRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = -1;
        }
        else if(race == Race.ORC){
            modifier = -1;
        }
        else if(race == Race.ELF){
            modifier = 1;
        }
        return modifier;
    }

    public int EnduranceRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 1;
        }
        else if(race == Race.ELF){
            modifier = -1;
        }
        return modifier;
    }

    public int HealthRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 2;
        }
        return modifier;
    }

    public int IntelligenceRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = -1;
        }
        else if(race == Race.ORC){
            modifier = -3;
        }
        return modifier;
    }

    //endregion
}
