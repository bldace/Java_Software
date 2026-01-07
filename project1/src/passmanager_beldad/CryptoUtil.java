/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passmanager_beldad;

import java.util.Base64;

/**
 *
 * @author Administrator
 */
class CryptoUtil {

    public static String encrypt(String plainText) {

        return Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    public static String decrypt(String encryptedText) {
        return new String(Base64.getDecoder().decode(encryptedText));
    }
}
