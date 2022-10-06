
// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class Model {

            public static  void main(String[] args) {

                String m = "hel";
                String k = "hej";

                Model cryptModel = new Model();
                System.out.println(cryptModel.cryptString(m, k));
            }

    public String cryptString(String m, String k){

            String resultat = "";

            for (int i = 0; i < m.length(); i++) {
             resultat += (char)crypt(m.charAt(i), k.charAt(i);}

            return resultat;
        }
        public  int crypt(int m, int k){
            return m ^ k;
        }

        //expand key
        //static void cryptoString(String mes, String key,){
          //  String string = "";

            //for (int i = 0; i < string.length(); i++) {
              //  char c = string.charAt(i);
             //   System.out.println(c); wile


            }


}








// gör så att det är lika många täken på key och mes
// char at

//filnam medelande key

