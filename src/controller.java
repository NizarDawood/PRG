import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller extends JFrame {

        Model model;
        view view;
        public controller(Model m, view v) {
            this.model = m;
            this.view = v;


        }
    private class cryptListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setMessage(view.getmessage());
            model.setKey(view.getKey());
            model.cryptString();
            view.setcrypterad(model.getcrypterad());
        }
    }

    
}
