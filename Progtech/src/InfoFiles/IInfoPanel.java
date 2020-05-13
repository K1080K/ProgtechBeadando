package InfoFiles;

import Creatures.Castes.Character;
import Creatures.Creature;

public interface IInfoPanel {
    String Info(Creature creature);
    String CharacterInfo(Character character);
}
