package dao;

import DBconnection.DatabaseConnection;
import idao.CountryLenguageDAO;
import model.Country;
import model.CountryLenguage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryLenguageDAOimp implements CountryLenguageDAO {
    PreparedStatement ps = null;
    Connection connection = DatabaseConnection.GetConnection();

    public List<CountryLenguage> getAllLanguages() {
        List<CountryLenguage> lenguages = new ArrayList<CountryLenguage>();
        try{
            String query = "select distinct Language from countrylanguage";
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                lenguages.add(new CountryLenguage(
                        rs.getString(1),
                        rs.getString(2),
                        IsOfficial.getByName(rs.getString(3)) ,
                        rs.getFloat(4)));
            }
        } catch (SQLException E){
            E.printStackTrace();
        }
        return lenguages;
    }

    public Set<CountryLenguage> listaIdiomas(String codigoPais) {
        Set<CountryLenguage> lenguages =new HashSet<CountryLenguage>();
        try{
            String query = "select * from countrylanguage " +
                    " INNER JOIN country ON countrylanguage.CountryCode = country.Code" +
                    "WHERE country.Code = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, codigoPais);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                lenguages.add(new CountryLenguage(
                        rs.getString(1),
                        rs.getString(2),
                        IsOfficial.getByName(rs.getString(3)) ,
                        rs.getFloat(4)));
            }
        } catch (SQLException E){
            E.printStackTrace();
        }
        return lenguages;
    }
}
