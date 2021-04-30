package englishfunny;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WordDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/projapp?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "phamthinga2001";
    private static final String INSERT_WORD_SQL = "INSERT INTO tbword" + " (id ,theme, word, translate, image, voice ) VALUES " + " (?,?, ?, ?, ?, ?);";
    private static final String SELECT_WORD_BY_ID = "select id ,theme, word, translate, image, voice from tbword where id =?";
    private static final String SELECT_WORD_BY_WORD = "select id ,theme, word, translate, image, voice from tbword where word =?";
    private static final String SELECT_WORD_BY_THEME = "select * from theme";
    private static final String SELECT_ALL_WORD = "select * from tbword";
    private static final String DELETE_WORD_SQL = "delete from tbword where id = ?;";
    private static final String UPDATE_WORD_SQL = "update tbword set theme=?, word=?, translate=?, image=?, voice=? where id = ?;";
    public WordDAO() {}
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
    public void insertWord(Wordmodel wordData) throws SQLException {
        System.out.println(INSERT_WORD_SQL);
        try (Connection connection = getConnection(); PreparedStatement
            preparedStatement = connection.prepareStatement(INSERT_WORD_SQL)) {
            preparedStatement.setInt(1, wordData.getID());
            preparedStatement.setString(2, wordData.getTheme());
            preparedStatement.setString(3, wordData.getWord());
            preparedStatement.setString(4, wordData.getTranslate());
            preparedStatement.setInt(5, wordData.getImage());
            preparedStatement.setInt(6, wordData.getVoice());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    public Wordmodel selectWord(int id) {
        Wordmodel wordData = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_WORD_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String theme = rs.getString("theme");
                String word = rs.getString("word");
                String translate = rs.getString("translate");
                int image = rs.getInt("image");
                int voice = rs.getInt("voice");

                wordData = new Wordmodel(id,theme, word, translate, image, voice);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return wordData;
    }
    public Wordmodel selectWord(String word) {
        Wordmodel wordData = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_WORD_BY_WORD);) {
            preparedStatement.setString(1, word);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String theme = rs.getString("theme");
                String _word = rs.getString("word");
                String translate = rs.getString("translate");
                int image = rs.getInt("image");
                int voice = rs.getInt("voice");
                

                wordData = new Wordmodel(id,theme, _word, translate, image, voice);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return wordData;
    }
    public Wordmodel selectWordbyTheme(String theme) {
        Wordmodel wordData = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_WORD_BY_THEME);) {
            preparedStatement.setString(1,theme );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String _theme = rs.getString("theme");
                String word = rs.getString("word");
                String translate = rs.getString("translate");
                int image = rs.getInt("image");
                int voice = rs.getInt("voice");
                

                wordData = new Wordmodel(id,_theme, word, translate, image, voice);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return wordData;
    }
    
    public ArrayList <Wordmodel> selectAllWord() {
        ArrayList <Wordmodel> wordData = new ArrayList <> ();
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_WORD);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String theme =rs.getString("theme");
                String _word = rs.getString("word");
                String translate = rs.getString("translate");
                int image = rs.getInt("image");
                int voice = rs.getInt("voice");
                

                wordData.add(new Wordmodel(id,theme, _word, translate, image, voice));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return wordData;
    }
    public boolean deleteWord(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_WORD_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    public boolean updateWord(Wordmodel wordData) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_WORD_SQL);) {
            statement.setInt(1, wordData.getID());
            statement.setString(2, wordData.getTheme());
            statement.setString(3, wordData.getWord());
            statement.setString(4, wordData.getTranslate());
            statement.setInt(5, wordData.getImage());
            statement.setInt(6, wordData.getVoice());
            rowUpdated = statement.executeUpdate() > 0;
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