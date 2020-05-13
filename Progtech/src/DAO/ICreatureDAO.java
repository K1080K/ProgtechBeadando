package DAO;

import Creatures.Creature;

public interface ICreatureDAO {

    void addCreature(Creature creature);
    void removeCreature(Creature creature);
}
