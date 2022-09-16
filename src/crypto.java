import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class crypto {
    // Holds the value of the sum of the numbers
    // skriva ut två ord som är crypterade i binära tal.    binära talet minus
    // key för att få ut det crypterade ordet
    private static int calculationValue;

    String message= "hej";
    String key="da";

    public void addTwoNumbers(int x, int y){
        calculationValue = x + y;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(calculationValue));
    }
}





//filnam medelande key

