public class SummarizedAttributeModifiers {

    //region Fields Properties and Constructor

    private RacialAttributeModifiers ram;
    private AgeAttributeModifiers aam;

    public RacialAttributeModifiers getRam() { return ram; }
    public void setRam(RacialAttributeModifiers ram) { this.ram = ram; }

    public AgeAttributeModifiers getAam() { return aam; }
    public void setAam(AgeAttributeModifiers aam) { this.aam = aam; }


    public SummarizedAttributeModifiers(){
        this.ram = new RacialAttributeModifiers();
        this.aam = new AgeAttributeModifiers();
    }

    //endregion

    //region These functions summarizing the racial and the age modifiers into one integer which will change -or not- the main attribute

    public int StrengthModifier(Race race, int age){
        int modifier = getRam().StrengthRacialModifier(race) + getAam().StrengthAgeModifier(race, age);
        return modifier;
    }

    public int DexterityModifier(Race race, int age){
        int modifier = getRam().DexterityRacialModifier(race) + getAam().DexterityAgeModifier(race, age);
        return modifier;
    }

    public int QuicknessModifier(Race race, int age){
        int modifier = getRam().QuicknessRacialModifier(race) + getAam().QuicknessAgeModifier(race, age);
        return modifier;
    }

    public int EnduranceModifier(Race race, int age){
        int modifier = getRam().EnduranceRacialModifier(race) + getAam().EnduranceAgeModifier(race, age);
        return modifier;
    }

    public int HealthModifier(Race race, int age){
        int modifier = getRam().HealthRacialModifier(race) + getAam().HealthAgeModifier(race, age);
        return modifier;
    }

    public int IntelligenceModifier(Race race, int age){
        int modifier = getRam().IntelligenceRacialModifier(race);   //intelligence has no age modifier
        return modifier;
    }
    //will has no modifiers just coming from the dice roll

    //endregion
}
