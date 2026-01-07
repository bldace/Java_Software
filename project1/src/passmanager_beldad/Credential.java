/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passmanager_beldad;

/**
 *
 * @author Administrator
 */
public class Credential {
    public String username;
    public String encryptedPassword;
    
    public Credential(String username, String encryptedPassword) {
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }
}
