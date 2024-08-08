import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ParticipantUtility {
    private List<Participant> participantList = new ArrayList<>();

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public void addParticipant(Participant participant) {
        participantList.add(participant);
    }

    public Stream<Participant> viewAllParticipants(String departmentName, String collegeName) {
        return participantList.stream()
                .filter(participant -> participant.getCollegeName().equals(collegeName) &&
                        participant.getDepartmentName().equals(departmentName))
                .sorted(Comparator.comparing(Participant::getParticipantName));
    }
}
