package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import connectDB.CreateDatabase;


public class Account {
    private  static final String Save="insert into login(username, password) VALUE (?,?)";
    java.sql.Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet=null;
    public void saveAcount(String username,String password){

        try {
            Connection connection= CreateDatabase.getConnection();
            preparedStatement=connection.prepareStatement(Save);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.executeUpdate();
        } catch (SQLException e ) {
            throw new RuntimeException(e);

        }


    }


}
