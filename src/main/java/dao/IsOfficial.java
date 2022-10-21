package dao;

public enum IsOfficial {
    T("True"),
    F("False");


    private String name;

    IsOfficial(String name) {
        this.name = name;
    }


    public static IsOfficial getByName(String name){
        return   IsOfficial.valueOf(name);
    }
}


