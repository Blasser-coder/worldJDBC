package idao;
import model.CountryLenguage;

import java.util.List;
import java.util.Set;

public interface CountryLenguageDAO {
    public List<CountryLenguage> getAllLanguages();
    public Set<CountryLenguage> listaIdiomas(String codigoPais);
}
