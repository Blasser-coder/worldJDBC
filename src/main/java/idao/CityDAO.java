package idao;

import model.City;

import java.util.Set;

public interface CityDAO {

    public Set<City> listaCiudades();
    public Boolean existeCiudad(Integer codigoCiudad);
    public City getCity(Integer codigoCiudad);
    public Set<City> listaCiudades(String nombrePais);
    public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais);
    public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre);
    public void aniadirCiudad(City nuevaCiudad);

}
