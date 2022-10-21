import dao.CityDAOimp;
import dao.Continent;
import dao.CountryDAOimp;
import model.City;
import model.Country;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CountryDAOimp co = new CountryDAOimp();
        CityDAOimp c = new CityDAOimp();
        Country c11 = new Country();
        Set<City> c1 = new HashSet<City>();
        Set<Country> co1 = new HashSet<Country>();
      co1 = co.listaPaises();
        for (Country cc : co1) {
            System.out.println(cc.toString());
        }
        System.out.println("------------------------------------------");
        c11 = co.getPaisDeCiudad(7);
        System.out.println(c11.toString());
    }
}
