public class CabinCrew {

    private String name;

    private String rank;

    public CabinCrew(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public String getRank() {
        return this.rank;
    }

    public String speakToPassengers() {
        return "Good afternoon, please don't panic but the engines have fallen off. That is all.";
    }
}
