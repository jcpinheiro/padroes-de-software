package padroes.p09.observer.cenario03;

import java.awt.Font;
import javax.swing.JLabel;

public class Label extends JLabel {

	private int count;
	private String text;
	
	public Label(String text) {
		super(text);
		this.count = 0;
		this.text = text;
		
		setFont(new Font(getFont().getName(), Font.BOLD, 30));
		increment();
	}
	
	public void increment() {
		setText(String.format("%s (%d)", text, count));
		count++;
	}
}
