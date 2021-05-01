/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;


/**
 *
 * @author Administrator
 */
public class UserModel {
    private int ID;
    private String userName;
    private String passWord;
    private String Email;
    private String Chart;
    private String fullName;
    private int avtID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getChart() {
        return Chart;
    }

    public void setChart(String Chart) {
        this.Chart = Chart;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAvtID() {
        return avtID;
    }

    public void setAvtID(int avtID) {
        this.avtID = avtID;
    }

    public UserModel(int ID, String userName, String passWord, String Email, String Chart, String fullName, int avtID) {
        this.ID = ID;
        this.userName = userName;
        this.passWord = passWord;
        this.Email = Email;
        this.Chart = Chart;
        this.fullName = fullName;
        this.avtID = avtID;
    }

    public UserModel() {
        
    }
    
    
    
}
