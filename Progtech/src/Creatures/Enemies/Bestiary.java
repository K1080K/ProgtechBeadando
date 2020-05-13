package Creatures.Enemies;

import Creatures.Creature;

public abstract class Bestiary extends Creature {

    public Bestiary(String name, int gold, boolean party_member, boolean alive) {
        super(name, gold, party_member, alive);
    }
}
