import Creatures.Castes.*;
import Creatures.CharacterGenerator;
import Creatures.Enemies.*;
import DAO.CreatureDAO;
import Equipments.*;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidAttributeException;
import Fight.*;

public class Main {

    public static void main(String[] args) throws InvalidAttributeException, InvalidAgeException, InterruptedException {

        Wolf f1 = new Wolf("Farkas1");
        Wolf f2 = new Wolf("Farkas2");

        CreatureDAO dao = CreatureDAO.getInstance();
        CharacterGenerator cg = new CharacterGenerator();
        cg.GetCharacter(dao.creatures);
        dao.creatures.add(f1);
        dao.creatures.add(f2);

        EquipmentGenerator eg = new EquipmentGenerator();
        eg.EquipWeapon(dao.creatures);

        FightGenerator na = new FightGenerator();
        na.Combat(dao.creatures);


    }
}