import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller extends JFrame {

        Model model;
        View view;
        public controller(model view) {
            Model m = null;
            this.model = m;
            View v = null;
            this.view = v;


        }
    private class cryptListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setMessage(view.getText());
            model.setKey(view.getKey());
            model.cryptString();
            view.setsvar(model.getsvar());
        }
    }

    
}
