/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class Scene {
    
    public WelcomeLEFT welcomeLEFT = new WelcomeLEFT();
    public Signup signin = new Signup();
    public Signinform signup = new Signinform();
    public MainMenu mainmenu= new MainMenu();
    public Chart chart = new Chart();
    public LearnMenu learnMenu = new LearnMenu();
    public LISTEN listen = new LISTEN();
    public Write write = new Write();
    public Testmenu testMenu = new Testmenu();
    public Learn learn = new Learn();
    public Flashcard flashcard = new Flashcard();
    public ChangeUserInfo changeinfor = new ChangeUserInfo();
    public UserModel user = new UserModel();
    public Wordmodel word = new Wordmodel();
    public ImageIcon[] avatar = { new ImageIcon("nga1.jpg")};
    public ImageIcon[] ItemImage = {new ImageIcon("bag.jpg","pen.jpg")};
    
    public Image scaleImage(Image image, int w, int h) {
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }
    public ArrayList <Wordmodel> GetWordByTheme(String theme ){
        ArrayList<Wordmodel> result = new ArrayList<>();
        WordDAO wordDAO = new WordDAO();
        ArrayList<Wordmodel> data = wordDAO.selectAllWord();
        for(Wordmodel model: data){
            if(model.getTheme().equals(theme)){
                result.add(model);
            }
        }
        return result;
    }
    

    
}
