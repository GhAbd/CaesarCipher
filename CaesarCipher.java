
/**
 * CaesarCipher encrypts a file with a classic ciphering method
 * 
 * @author Abdalrahman Ghazal 
 * @version V0.1
 */
import edu.duke.*;

public class CaesarCipher {
    public String encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alphabet.substring(key,26)+alphabet.substring(0,key)+alphabet.substring(key+26)+alphabet.substring(26,key+26);
        
        for (int i=0;i<input.length();i++){
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx !=-1){
                encrypted.setCharAt(i, shiftedAlphabet.charAt(idx));
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
