public class Address {
    private String streetAddress;
    private String town;
    private String city;
    static final String country;
    PhoneNumber phoneNumber;
    static {
        country="Pakistan";
    }

    public Address(String streetAddress, String town, String city) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.city = city;
    }

    public Address(String streetAddress, String town, String city,PhoneNumber phoneNumber) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.city = city;
        this.phoneNumber=phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
