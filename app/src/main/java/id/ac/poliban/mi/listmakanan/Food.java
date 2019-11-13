package id.ac.poliban.mi.listmakanan;

public class Food {
    private String flag;
    private String countryName;
    private String countryDesc;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDesc() {
        return countryDesc;
    }

    public void setCountryDesc(String countryDesc) {
        this.countryDesc = countryDesc;
    }

    public Food(String flag, String countryName, String countryDesc) {
        this.flag = flag;
        this.countryName = countryName;
        this.countryDesc = countryDesc;
    }
}
