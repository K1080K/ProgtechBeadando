import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;

public class Main {

    public static void main(String[] args) throws InvalidAttributeException, InvalidAgeException, InterruptedException {
        Warrior w = new Warrior("Répa", true, true,51, Race.DWARF, Caste.WARRIOR, 1);
        Knight k = new Knight("Micsu", true, true,21, Race.HUMAN, Caste.KNIGHT, 1);
        Wolf f1 = new Wolf("Farkas1", false, true);
        Wolf f2 = new Wolf("Farkas2", false, true);

         CreatureDAO dao = CreatureDAO.getInstance();
         dao.creatures.add(w);
         dao.creatures.add(k);
         dao.creatures.add(f1);
         dao.creatures.add(f2);

         EquipmentGenerator eg = new EquipmentGenerator();
         eg.EquipWeapon(dao.creatures);

         FightGenerator na = new FightGenerator();
         na.Combat(dao.creatures);


    }
}