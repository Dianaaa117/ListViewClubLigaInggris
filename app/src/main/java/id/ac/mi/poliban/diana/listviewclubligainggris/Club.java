package id.ac.mi.poliban.diana.listviewclubligainggris;

public class Club {
    private String club;
    private String clubName;
    private String clubDetail;

    public Club(String club, String clubName, String clubDetail) {
        this.club = club;
        this.clubName = clubName;
        this.clubDetail = clubDetail;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDetail() {
        return clubDetail;
    }

    public void setClubDetail(String clubDetail) {
        this.clubDetail = clubDetail;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getClubName(), getClubDetail());
    }
}
