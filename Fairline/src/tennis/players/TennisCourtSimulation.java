package tennis.players;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class TennisCourtSimulation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TennisCourtSimulation frame = new TennisCourtSimulation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TennisCourtSimulation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(58, 50, 312, 144);
		contentPane.add(panel);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(58, 237, 117, 29);
		contentPane.add(btnNewButton);

		JButton BCKBUTTON = new JButton("BACK ");
		BCKBUTTON.setBounds(253, 237, 117, 29);
		contentPane.add(BCKBUTTON);

		BCKBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinglePlayerFrame singlePlayerFrame = new SinglePlayerFrame();
				singlePlayerFrame.setVisible(true);
				dispose();
			}
		});
	}
}