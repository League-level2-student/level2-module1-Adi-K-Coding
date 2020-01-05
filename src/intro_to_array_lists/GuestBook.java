package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.run();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	
	
	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton) e.getSource();
if(button==addName) {
				String newlyAddedName= JOptionPane.showInputDialog("Enter a name?");
					names.add(newlyAddedName);
}else if(button==viewNames) {
	for (int i = 0; i < names.size(); i++) {
		String s=names.get(i);
		System.out.println("Guest # "+(i+1)+": "+s);
		
	}
}
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
