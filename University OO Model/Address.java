public class Address {
    private int streetNumber;
    private String cityOrCounty;
    private String[] addressLines;
    private String postcode;
    private String country;
    
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    public String getCityOrCounty() {
        return cityOrCounty;
    }
    public void setCityOrCounty(String cityOrCounty) {
        this.cityOrCounty = cityOrCounty;
    }
    public String[] getAddressLines() {
        return addressLines;
    }
    public void setAddressLines(String[] addressLines) {
        this.addressLines = addressLines;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
