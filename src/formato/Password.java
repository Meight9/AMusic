/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formato;

/**
 *
 * @author android
 */
public class Password {
    public static String chartoPass(char[] pass){
        String contrasena="";
        for(char cont:pass){
            contrasena+=cont;
        }
        return MD5(contrasena);
    }
    
    public static String MD5(String contrasena){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(contrasena.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
    
}