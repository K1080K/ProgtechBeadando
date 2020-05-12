import java.util.ArrayList;

public class CreatureDAO {

    private static CreatureDAO single_instance = null;

    public ArrayList<Creature> creatures;

    private CreatureDAO(){
        creatures = new ArrayList<>();
    }

    public static CreatureDAO getInstance() {
        if (single_instance == null)
            single_instance = new CreatureDAO();
        return single_instance;
    }
}

