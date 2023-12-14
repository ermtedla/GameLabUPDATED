import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.event.*;

public class GameGUI extends JFrame implements KeyListener {

	private JTextArea textArea;
	
	public void print(String s) {
		textArea.append(s+"\n\n");
	}
	
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == '\n') {
			
		}
	}
	
	public GameGUI() {
		setTitle("Text Game");
		setSize(755, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		textArea = new JTextArea();
		textArea.setFont(new Font(null, Font.PLAIN, 26));
		textArea.setRows(20);
		textArea.setColumns(20);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		DefaultCaret caret = (DefaultCaret) textArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		JScrollPane scroll = new JScrollPane(textArea);
		add(scroll, BorderLayout.CENTER);
		
		inputBox = new JTextField();
		inputBox = setFont(new Font(null, Font.PLAIN, 26));
		inputBox.addKeyListener(this);
		add(inputBox, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
