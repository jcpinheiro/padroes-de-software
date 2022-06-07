package padroes.p09.observer.cenario03;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {

    public Button(String text, Label... labels) {
        super(text);

        addActionListener(e -> {
                for (Label label : labels) {
                    label.increment();
                }
        });
    }
}
