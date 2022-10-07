import java.io.File;
import java.util.Scanner;

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class Model {

            public static  void main(String[] args) {

                // scanna fil gör om filen till string
                Scanner input = new Scanner(new File("file.txt"));
                String message = String.valueOf(input);
                String key = ")/()/";

                Model cryptModel = new Model();
                System.out.println(cryptModel.cryptString(message, key));
            }

    public String cryptString(String message, String key){

            String resultat = "";

            for (int i = 0; i < message.length(); i++) {
             resultat += (char)crypt(message.charAt(i),key.charAt(i));}

            return resultat;
        }
        public  int crypt(int message, int key){
            return message ^ key;
        }
 public String setmessage{
                this.message = message
    }

    // public void setcrypt{
    //                this.crypt( int message, int key ) = crypt(int message, int key)
    //    }
        //while loop expand key <> message
        //static void cryptoString(String mes, String key,){
          //  String string = "";

            //for (int i = 0; i < string.length(); i++) {
              //  char c = string.charAt(i);
             //   System.out.println(c); wile


            }











// gör så att det är lika många täken på key och mes
// char at

//filnam medelande key

