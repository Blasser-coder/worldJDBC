package model;

import dao.IsOfficial;

public class CountryLenguage {
    private String CountryCode;
    private String Lenguage;
    private dao.IsOfficial IsOfficial;
    private float Percentage;

    public CountryLenguage() {
    }


    public CountryLenguage(String countryCode, String lenguage, dao.IsOfficial isOfficial, float percentage) {
        CountryCode = countryCode;
        Lenguage = lenguage;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLenguage() {
        return Lenguage;
    }

    public void setLenguage(String lenguage) {
        Lenguage = lenguage;
    }

    public dao.IsOfficial getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(dao.IsOfficial isOfficial) {
        IsOfficial = isOfficial;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float percentage) {
        Percentage = percentage;
    }
}
