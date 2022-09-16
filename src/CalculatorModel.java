import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class CalculatorModel {
    // Holds the value of the sum of the numbers
    // entered in the view
    int calculationValue;
    int x = 88;
    int y = 22;
    public void addTwoNumbers(){
        calculationValue = x + y;
    }

   // public int getCalculationValue() {
      //  return calculationValue;

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        model.addTwoNumbers();
        System.out.println(Integer.toBinaryString(model.calculationValue));

    }
}





//filnam medelande key

