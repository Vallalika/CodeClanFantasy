package rooms;

import characters.Player;

import java.util.ArrayList;

public class Party {

    protected ArrayList<Player> party;

    public Party(Player player1, Player player2, Player player3) {
        this.party = new ArrayList<>();
        party.add(player1);
        party.add(player2);
        party.add(player3);
    }

    public ArrayList<Player> getParty() {
        return party;
    }
}
