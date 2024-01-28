package tennis.players;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SinglePlayerFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	public SinglePlayerFrame() {
		setTitle("Single Player Mode");
		setSize(381, 204);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Single Game - Player Name ");
		lblNewLabel.setBounds(25, 23, 174, 16);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Player 1");
		lblNewLabel_1.setBounds(25, 51, 61, 16);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Player 2");
		lblNewLabel_2.setBounds(25, 80, 61, 16);
		getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(82, 46, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(82, 75, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton NXTBUTTON = new JButton("NEXT");
		NXTBUTTON.setBounds(25, 123, 117, 29);
		getContentPane().add(NXTBUTTON);

		JButton BCKBUTTON = new JButton("BACK");
		BCKBUTTON.setBounds(198, 123, 117, 29);
		getContentPane().add(BCKBUTTON);

		NXTBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TennisCourtSimulation tennisCourtMapFrame = new TennisCourtSimulation();
				tennisCourtMapFrame.setVisible(true);
				dispose();
			}
		});

		BCKBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TennisCourtUI tennisCourtUI = new TennisCourtUI();
				tennisCourtUI.setVisible(true);
				dispose();
			}
		});

	}
}