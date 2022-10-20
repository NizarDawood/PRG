import javax.swing.*;

public class view {

    public static void main(String[] args) {


    }

    private JPanel mainPanel;
    private JTextArea text;
    private JTextField key;
    private JButton button;
    private JTextPane svar;


    public view() {

    }
        public JPanel mainPanel () {
            return mainPanel;
        }


        public String getText () {
            return text.getText();
        }
        public String getKey () {
            return key.getText();
        }
        public void setsvar (String c){
            svar.setText(c);
        }


    }
}



//public class view {
//    private JTextArea text = new JTextArea();
//    private JTextField key = new JTextField();
//    private JButton button = new JButton();
//    private JTextPane svar = new JTextPane();
//    private JPanel mainPanel = new JPanel();
//
//    controllerview(){
//        calcPanel.add(text);
//        calcPanel.add(key);
//        calcPanel.add(button);
//        calcPanel.add(svar);
//
//    }
//        JPanel calcPanel = new JPanel();
//
//        public int getText() {
//            return Integer.parseInt(text.getText());
//        }
//
//        public int getKey() {
//            return Integer.parseInt(key.getText());
//        }
//    public void setCalcSolution(int solution) {
//        calcSolution.setText(Integer.toString(solution));
//    }
//
//}
