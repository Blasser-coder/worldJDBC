package dao;

import DBconnection.DatabaseConnection;
import idao.CountryDAO;
import model.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CountryDAOimp implements CountryDAO {
    PreparedStatement ps = null;
    Connection connection = DatabaseConnection.GetConnection();


    public Set<Country> listaPaises() {
        Set<Country> Countries = new HashSet<Country>();
        String query = "Select * from country";
        try {
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Countries.add(new Country(
                        rs.getString(1),
                        rs.getString(2),
                        Continent.getByName(rs.getString(3).replace(" ", "")) ,
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getFloat(8),
                        rs.getFloat(9),
                        rs.getFloat(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14),
                        rs.getString(15)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Countries;
    }

    public Boolean existePais(String codigoPais) {
        Boolean Bool = false;
        String query = "Select * from country WHERE Code = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, codigoPais);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               if (!rs.wasNull()){
                   Bool = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Bool;
    }

    public Country getCountry(String codigoPais) {
        Country countryReturn = null;
        String query = "Select * from country WHERE Code = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, codigoPais);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                countryReturn = new Country(
                        rs.getString(1),
                        rs.getString(2),
                        Continent.getByName(rs.getString(3).replace(" ", "")) ,
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getFloat(8),
                        rs.getFloat(9),
                        rs.getFloat(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14),
                        rs.getString(15));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countryReturn;
    }

    public Country getPaisDeCiudad(Integer codigoCiudad) {
        Country countryReturn = null;
        String query = "Select CountryCode from city WHERE ID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, codigoCiudad);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String query2 = "Select * from country WHERE Code = '" + rs.getString(1) + "'";
            PreparedStatement ps1 = connection.prepareStatement(query2);
            ResultSet rs2 = ps1.executeQuery();
            while(rs2.next()){
                countryReturn = new Country(
                        rs2.getString(1),
                        rs2.getString(2),
                        Continent.getByName(rs2.getString(3).replace(" ", "")) ,
                        rs2.getString(4),
                        rs2.getFloat(5),
                        rs2.getInt(6),
                        rs2.getInt(7),
                        rs2.getFloat(8),
                        rs2.getFloat(9),
                        rs2.getFloat(10),
                        rs2.getString(11),
                        rs2.getString(12),
                        rs2.getString(13),
                        rs2.getInt(14),
                        rs2.getString(15));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countryReturn;
    }

    public Boolean aniadirPais(Country nuevaCiudad) throws SQLException {
        Boolean Bool = false;
String query = "INSERT INTO country VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(query);
            ps.setString(1, nuevaCiudad.getCode());
            ps.setString(2, nuevaCiudad.getName());
            ps.setString(3, nuevaCiudad.getContinent().name());
            ps.setString(4, nuevaCiudad.getRegion());
            ps.setFloat(5, nuevaCiudad.getSurfaceArea());
            ps.setInt(6, nuevaCiudad.getIndepYear());
            ps.setInt(7, nuevaCiudad.getPopulation());
            ps.setFloat(8, nuevaCiudad.getLifeExpectancy());
            ps.setFloat(9, nuevaCiudad.getGNP());
            ps.setFloat(10, nuevaCiudad.getGNPOid());
            ps.setString(11, nuevaCiudad.getLocalName());
            ps.setString(12, nuevaCiudad.getGovermentForm());
            ps.setString(13, nuevaCiudad.getHeadOfState());
            ps.setInt(14, nuevaCiudad.getCapital());
            ps.setString(15, nuevaCiudad.getCode2());
            ps.executeUpdate();
            connection.commit();
            Bool = true;
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
        }
        return Bool;
    }
}
