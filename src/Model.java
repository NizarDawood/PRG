import java.io.File;
import java.util.Scanner;

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class Model {

    public  static void main(String[] args) {
//Scanner input = new Scanner(new File("file.txt"));
//        String message = String.valueOf(input);

        String message = "EORJEOJR";

        String key = ")/()/";

        Model cryptModel = new Model();
        System.out.println(cryptModel.cryptString(message, key));
    }

    public String cryptString(String message, String key) {

        String resultat = "";
        while (key.length() < message.length()) {
            key = expandkey(key);
        }
        for (int i = 0; i < message.length(); i++) {
            resultat += (char) crypt(message.charAt(i), key.charAt(i));
        }

        return resultat;
    }
    private String expandkey(String key) {
        return key + key;

    }
    public int crypt(int message, int key) {
        return message ^ key;
    }
    private String message;
    private String key;
    public void setMessage(String message) {
        this.message = message;
    }

    public void setkey(String key) {
        this.key = key;
    }



}

    // public void setcrypt{
    //                this.crypt( int message, int key ) = crypt(int message, int key)
    //    }
        //while loop expand key <> message
        //static void cryptoString(String mes, String key,){
          //  String string = "";
















// gör så att det är lika många täken på key och mes
// char at

//filnam medelande key

