
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class CaesarCipher {
    public String encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphapet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String shiftedAlphapet = alphapet.substring(key,26)+alphapet.substring(0,key)+alphapet.substring(key+26)+alphapet.substring(26,key+26);
        
        for (int i=0;i<input.length();i++){
            char currChar = encrypted.charAt(i);
            int idx = alphapet.indexOf(currChar);
            if (idx !=-1){
                encrypted.setCharAt(i, shiftedAlphapet.charAt(idx));
            }
        }
        return encrypted.toString();
    }

    
    public void testCaesar(){
    int key = 23;
    FileResource fr = new FileResource();
    String message = fr.asString();
    String encrypted = encrypt(message,key);
    System.out.println(encrypted);
    }
}
