package model;

import dao.Continent;

import java.awt.*;

public class Country {
    private String Code;
    private String Name;
    private Continent continent;
    private String Region;

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    private float SurfaceArea;
    private int IndepYear;
    private int Population;
    private float LifeExpectancy;
    private float GNP;
    private float GNPOid;
    private String LocalName;
    private String GovermentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;

    public Country() {
    }

    public Country(String code, String name, Continent continent1,String region, float surfaceArea, int indepYear, int population, float lifeExpectancy, float GNP, float GNPOid, String localName, String govermentForm, String headOfState, int capital, String code2) {
        Code = code;
        Name = name;
        this.continent = continent1;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOid = GNPOid;
        LocalName = localName;
        GovermentForm = govermentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public float getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(float surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(int indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public float getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(float lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public float getGNP() {
        return GNP;
    }

    public void setGNP(float GNP) {
        this.GNP = GNP;
    }

    public float getGNPOid() {
        return GNPOid;
    }

    public void setGNPOid(float GNPOid) {
        this.GNPOid = GNPOid;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovermentForm() {
        return GovermentForm;
    }

    public void setGovermentForm(String govermentForm) {
        GovermentForm = govermentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOid=" + GNPOid +
                ", LocalName='" + LocalName + '\'' +
                ", GovermentForm='" + GovermentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                '}';
    }
}
