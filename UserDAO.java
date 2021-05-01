package englishfunny;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/projapp?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "phamthinga2001";
    private static final String INSERT_USERS_SQL = "INSERT INTO user" + " (id ,username, password, email, chart, fullname,avtid ) VALUES " + " (?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,username,password,email,chart, fullname, avtid from user where id =?";
    private static final String SELECT_USER_BY_USERNAME = "select id,username,password,email,chart, fullname, avtid from user where username =?";
    private static final String SELECT_ALL_USERS = "select * from user";
    private static final String DELETE_USERS_SQL = "delete from user where id = ?;";
    private static final String UPDATE_USERS_SQL = "update user set username = ?,password= ?,chart=?, email=?, fullname =?, avtid =? where id = ?;";
    public UserDAO() {}
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername,jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void insertUser(UserModel user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = getConnection(); PreparedStatement
            preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, user.getID());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassWord());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getChart());
            preparedStatement.setString(6, user.getFullName());
            preparedStatement.setInt(7, user.getAvtID());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    public UserModel selectUser(int id) {
        UserModel user = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String chart = rs.getString("chart");
                int avtid = rs.getInt("avtid");
                

                user = new UserModel(id, username, password, email, chart, fullname, avtid);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }
    public UserModel selectUser(String username) {
        UserModel user = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_USERNAME);) {
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String _username = rs.getString("username");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String chart = rs.getString("chart");
                int avtid = rs.getInt("avtid");
                

                user = new UserModel(id, _username, password, email, chart, fullname, avtid);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }
    public ArrayList <UserModel> selectAllUsers() {
        ArrayList <UserModel> users = new ArrayList <> ();
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String _username = rs.getString("username");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String chart = rs.getString("chart");
                int avtid = rs.getInt("avtid");

                users.add(new UserModel(id, _username, password, email, chart, fullname, avtid));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    public boolean updateUser(UserModel user) throws SQLException {
        boolean rowUpdated = false;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
           
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassWord());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getChart());
            statement.setString(5, user.getFullName());
            statement.setInt(6, user.getAvtID());
            statement.setInt(7, user.getID());
            rowUpdated = statement.executeUpdate() > 0;
        }catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdated;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException)e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}