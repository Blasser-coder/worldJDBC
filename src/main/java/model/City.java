package model;

public class City {
    private int ID;
    private String Name;
    private String CountryName;
    private String District;
    private int Population;

    public City() {
    }

    public City(int ID, String name, String countryName, String district, int population) {
        this.ID = ID;
        Name = name;
        CountryName = countryName;
        District = district;
        Population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}
