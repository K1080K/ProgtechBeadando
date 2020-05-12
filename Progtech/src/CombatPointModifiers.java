public class CombatPointModifiers {

    //region These functions are adding the combat point modifier which is coming from the attributes

    public int AttackPointModifiers(int strength, int dexterity, int quickness){
        int modfromstr = strength - 10;
        if(modfromstr < 0) modfromstr = 0;
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromstr + modfromdex + modfromquick;
    }

    public int InitiativePointModifiers(int dexterity, int quickness){
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int DefendPointModifiers(int dexterity, int quickness){
        int modfromdex = dexterity - 10;
        if(modfromdex < 0) modfromdex = 0;
        int modfromquick = quickness - 10;
        if(modfromquick < 0) modfromquick = 0;
        return modfromdex + modfromquick;
    }

    public int DamageModifier(int strength){
        int modfromstr = strength - 16;
        if(modfromstr < 0) modfromstr = 0;
        return modfromstr;
    }

    //endregion
}
