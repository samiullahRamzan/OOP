public class PhoneNumber {
    private String countryCode;
    private String cityCode;
    private String lineNumber;

    public PhoneNumber(String countryCode, String cityCode, String lineNumber) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.lineNumber = lineNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}
