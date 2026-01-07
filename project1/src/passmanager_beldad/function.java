/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passmanager_beldad;

import java.util.HashMap;

/**
 *
 * @author Administrator
 */
public class function {

    HashMap<String, Credential> vault = new HashMap<>();

    public String save(String platform, String username, String password) {
        if (platform.isEmpty() || username.isEmpty() || password.isEmpty()) {
            return "";
        }
        vault.put(platform, new Credential(username, CryptoUtil.encrypt(password)));

        return "succes";
    }

    public String search(String platform) {
        if (!vault.containsKey(platform)) {
            return "not found";
        }

        Credential cred = vault.get(platform);
        return "platform: " + platform
                + "\nUsername: " + cred.username
                + "\nPassword: " + CryptoUtil.decrypt(cred.encryptedPassword);
    }

    public String delete(String platform) {
        if (!vault.containsKey(platform)) {
            return "not found";
        }
        
        vault.remove(platform);
        return "succesfully deleted that account";

    }
}
