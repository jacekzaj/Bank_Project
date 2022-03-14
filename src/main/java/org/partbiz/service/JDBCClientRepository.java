package org.partbiz.service;

import org.partbiz.Client;
import org.partbiz.repository.ClientRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCClientRepository implements ClientRepository {
    public static final String USER="postgres";
    public static final String  PASSWORD="Jacek";
    public static final String JDBC_URL="jdbc:postgres://localhost:5432/test";


    @Override
    public void save(Client client) {
        try(Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            final String name = client.getName();
            final String email = client.getEmail();
            final PreparedStatement statement = connection.prepareStatement("INSERT INTO Users(FIRST_NAME,MAIL) VAlUES(?,?)");
            statement.setString(1,name);
            statement.setString(2,email);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Client findByEmaila(String email) {
        return null;
    }
}
