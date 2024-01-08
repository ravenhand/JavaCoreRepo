package task12;

public class SemiFinal implements Sports, Event{
    private String awayTeam;
    private String location;
    private String homeTeam;
    private String eventName;
    private String sportType;
    @Override
    public void setEventName() {
        eventName = "világbajnoki elődöntő";
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }


    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    @Override
    public String toString() {
        return "SemiFinal{" +
                "awayTeam='" + awayTeam + '\'' +
                ", location='" + location + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", eventName='" + eventName + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
