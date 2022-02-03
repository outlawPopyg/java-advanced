package generics.game;
import java.util.*;

public class Team <T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participantList.add(participant);
        System.out.println("В команду был добавлен " + participant.getName());
    }

    public void playWith(Team<T> anotherTeam) {
        String winnerName;
        Random rand = new Random();
        int c = rand.nextInt(2);

        if (c == 0) {
            winnerName = this.name;
        } else {
            winnerName = anotherTeam.name;
        }

        System.out.println("Победила команда " + winnerName);
    }
}
