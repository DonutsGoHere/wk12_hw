public class Pilot {

    private String name;
    private String rank;
    private String licenceNumber;

    public Pilot(String name, String rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }
    public String getName() {
        return this.name;
    }

    public String getRank() {
        return this.rank;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }
}
