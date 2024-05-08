import java.awt.*;
import javax.swing.*;
public class JMenuExample extends JFrame{
	public JMenuExample(){
		super("Menus");
		setSize(450, 220);
		JMenuBar mb;
		JMenu m;
		mb = new JMenuBar();
		setJMenuBar(mb);
		mb.add(m = new JMenu("File"));
		m.add(new JMenuItem("open"));
		m.add(new JMenuItem("save"));
		m.add(new JMenuItem("save as"));
		m.add(new JMenuItem("close"));
		mb.add(m = new JMenu("Edit"));
		m.add(new JMenuItem("undo"));
		m.add(new JMenuItem("cut"));
		m.add(new JMenuItem("copy"));
		m.add(new JMenuItem("paste"));
		JPanel p= new JPanel();
		p.add(new JTextArea());
		add(p);
		setVisible(true);

	}
	public static void main(String[] args) {
		new JMenuExample();
		
	}
}