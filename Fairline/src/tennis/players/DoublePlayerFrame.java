package tennis.players;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class DoublePlayerFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public DoublePlayerFrame() {
		setTitle("Double Player Mode");
		setSize(400, 378);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Double Game - Players Name");
		lblNewLabel.setBounds(24, 30, 259, 16);
		getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(24, 71, 350, 94);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Team A");
		lblNewLabel_1.setBounds(16, 43, 61, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Player 1");
		lblNewLabel_2.setBounds(85, 19, 61, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Player 2");
		lblNewLabel_3.setBounds(85, 60, 61, 16);
		panel.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(158, 14, 130, 26);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(158, 55, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(24, 177, 350, 102);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("Player 1");
		lblNewLabel_2_1.setBounds(82, 17, 61, 16);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Player 2");
		lblNewLabel_3_1.setBounds(82, 57, 61, 16);
		panel_1.add(lblNewLabel_3_1);

		JLabel lblNewLabel_1_1 = new JLabel("Team B");
		lblNewLabel_1_1.setBounds(16, 39, 61, 16);
		panel_1.add(lblNewLabel_1_1);

		textField_2 = new JTextField();
		textField_2.setBounds(155, 12, 130, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(155, 52, 130, 26);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JButton NXTBUTTON = new JButton("NEXT");
		NXTBUTTON.setBounds(24, 301, 117, 29);
		getContentPane().add(NXTBUTTON);

		JButton PRVBUTTON = new JButton("PREVIOUS");
		PRVBUTTON.setBounds(257, 301, 117, 29);
		getContentPane().add(PRVBUTTON);

		NXTBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TennisCourtSimulation tennisCourtMapFrame = new TennisCourtSimulation();
				tennisCourtMapFrame.setVisible(true);
				dispose();
			}
		});

		PRVBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TennisCourtUI tennisCourtUI = new TennisCourtUI();
				tennisCourtUI.setVisible(true);
				dispose();
			}
		});
	}
}