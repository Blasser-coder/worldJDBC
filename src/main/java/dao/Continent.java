package dao;
public enum Continent {
    Asia("Asia"),
    Europe("Europe"),
    NorthAmerica("North" + " " + "America"),
    Africa("Africa"),
    Oceania("Oceania"),
    Antarctica("Antarctica"),
    SouthAmerica("South" + " " + "America");
    private String name;

    Continent(String name) {
        this.name = name;
    }


    public static Continent getByName(String name){
        return   Continent.valueOf(name);
    }
}