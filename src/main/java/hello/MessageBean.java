package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
    private String lang;
    private String nome;
    private String pais;
        
    public MessageBean() {
    }

    public String getMsg() {
        switch(this.lang){
            case "pt":
                msg = "Alô, %s de %s!";
                break;
            case "en":
                msg = "Hello, %s from %s!";
                break;
            case "fr":
                msg = "Bonjour, %s de %s!";
                break;
            case "de":
                msg = "Hallo, %s aus %s!";
                break;
            case "dk":
                msg = "Hej, %s fra %s!";
                break;
        }
        return String.format(msg, nome, pais);
    }

    public void setMsg(String msg) { this.msg = msg; }

    public String getLang() { return lang; }

    public void setLang(String lang) { this.lang = lang; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getPais() { return pais; }

    public void setPais(String pais) { this.pais = pais; }
}
