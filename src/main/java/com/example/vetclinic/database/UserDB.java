package com.example.vetclinic.database;

import com.example.vetclinic.entitiy.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDB {
    private Connection connection;

    public UserDB() {
        this.connection = DataBase.getConnection();
    }

    public void add(User user) throws SQLException {
        String request = "INSERT INTO Users (phone_number, name, address, password) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(request);
        statement.setString(1, user.getPhoneNumber());
        statement.setString(2, user.getName());
        statement.setString(3, user.getAddress());
        statement.setString(4, user.getPassword());
        statement.executeUpdate();
        statement.close();
    }
    public void delete(int id){
    }
    public void update(User user) {}
    public User get(int id) {

        return null;
    }
}
