import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.View;
import java.awt.event.ActionListener;

public class view {

    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;
    private JTextPane textPane1;


  //  public view() {}


        public JPanel panel () {

            return mainPanel;
        }
        public String getmessage () {

            return textArea1.getText();
        }
        public String getKey () {

            return textField1.getText();
        }

    public void getcrypterad (String c) {
        textPane1.setText(c);
    }
    public void setCryptListener(ActionListener cryptListener) {
        button1.addActionListener(cryptListener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("view");
        frame.setContentPane(new view().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
