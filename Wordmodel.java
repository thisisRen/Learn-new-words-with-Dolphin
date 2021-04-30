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
public class Wordmodel {
    private int ID;
    private String Theme;
    private String word;
    private String translate;
    private int image;
    private int voice;



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    public Wordmodel() {
    }

    public Wordmodel(int ID, String Theme, String word, String translate, int image, int voice) {
        this.ID = ID;
        this.Theme = Theme;
        this.word = word;
        this.translate = translate;
        this.image = image;
        this.voice = voice;
    }
}
 

    