package tennis.players;

import javax.swing.*;
import javax.swing.border.EmptyBorder; // Import EmptyBorder

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TennisCourtUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TennisCourtUI frame = new TennisCourtUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TennisCourtUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME TO FAIRLINE ");
		lblNewLabel.setBounds(141, 36, 148, 36);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PLEASE, SELECT THE TYPE OF GAME");
		lblNewLabel_1.setBounds(101, 121, 226, 16);
		contentPane.add(lblNewLabel_1);

		JButton SNGLPLAYER = new JButton("SINGLE PLAYER");
		SNGLPLAYER.setForeground(new Color(0, 128, 0));
		SNGLPLAYER.setBackground(new Color(0, 128, 0));
		SNGLPLAYER.setBounds(56, 171, 148, 121);
		contentPane.add(SNGLPLAYER);

		JButton DBLEPLAYER = new JButton("DOUBLE PLAYER ");
		DBLEPLAYER.setForeground(new Color(0, 128, 0));
		DBLEPLAYER.setBounds(228, 171, 148, 121);
		contentPane.add(DBLEPLAYER);

		SNGLPLAYER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinglePlayerFrame singlePlayerFrame = new SinglePlayerFrame();
				singlePlayerFrame.setVisible(true);
			}
		});

		DBLEPLAYER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoublePlayerFrame doublePlayerFrame = new DoublePlayerFrame();
				doublePlayerFrame.setVisible(true);
			}
		});
	}
}