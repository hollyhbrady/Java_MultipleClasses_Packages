package people.staff;

public class Pilot extends Staff{

    private String licenseNo;

    public Pilot(String name, Rank rank, String licenseNo) {
        super(name, rank);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
