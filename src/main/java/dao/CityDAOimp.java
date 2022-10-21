package dao;

import DBconnection.DatabaseConnection;
import idao.CityDAO;
import model.City;
import model.Country;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CityDAOimp implements CityDAO {
    PreparedStatement ps = null;
    Connection connection = DatabaseConnection.GetConnection();

    public Set<City> listaCiudades() {
        Set<City> Cities = new HashSet<City>();
        String query = "select * from city";
        try {
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                Cities.add(new City(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Cities;
    }

    public Boolean existeCiudad(Integer codigoCiudad) {


        return null;
    }

    public City getCity(Integer codigoCiudad) {
        City city = null;
        String query = "select * from city ID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, codigoCiudad);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                city = new City(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return city;
    }

    public Set<City> listaCiudades(String nombrePais) {
        Set<City> listaCity = new HashSet<City>();
        String query = "select * from city" +
                        " where CountryCode = (select  Code from country where CountryName = ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombrePais);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listaCity.add(new City(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCity;
    }

    public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais) {
        return null;
    }

    public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre) {
        return null;
    }

    public void aniadirCiudad(City nuevaCiudad) {

    }
}
