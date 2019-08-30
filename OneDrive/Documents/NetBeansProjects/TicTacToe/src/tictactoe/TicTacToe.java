/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TicTacToe extends JFrame implements ActionListener {

	private JButton[][] letter;
	private JButton reset;
	private JButton quit;
	private JLabel winLabel;
	private boolean xMove;

	public TicTacToe() {
		letter = new JButton[3][3];
		for(int i = 0; i < letter.length; i++) {
			for(int j = 0; j < letter[0].length; j++) {
				letter[i][j] = new JButton();
				letter[i][j].addActionListener(this);
			}
		}

		reset = new JButton("Reset");
		reset.addActionListener(this);

		quit = new JButton("Quit");
		quit.addActionListener(this);

		JPanel letterPanel = new JPanel();
		letterPanel.setLayout(new GridLayout(letter.length, 
								 letter[0].length));
		for(int i = 0; i < letter.length; i++)
			for(int j = 0; j < letter[0].length; j++)
				letterPanel.add(letter[i][j]);

		JPanel controlPanel = new JPanel();
		controlPanel.add(reset);
		controlPanel.add(quit);

		winLabel = new JLabel("X to move.");

		JPanel fullPanel = new JPanel();
		fullPanel.setLayout(new BorderLayout());
		fullPanel.add(controlPanel, BorderLayout.SOUTH);
		fullPanel.add(letterPanel, BorderLayout.CENTER);
		fullPanel.add(winLabel, BorderLayout.NORTH);

		Container c = this.getContentPane();
		c.add(fullPanel);
		this.setContentPane(c);
		xMove = true;
	}

	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		if(command.equals("Quit")) {
			System.exit(0);
		}
		else if(command.equals("Reset")) {
			for(int i = 0; i < letter.length; i++) {
				for(int j = 0; j < letter[0].length; j++) {
					letter[i][j].setText("");
				}
			}
			xMove = true;
			winLabel.setText("X to move.");
		}
		else {
			JButton button = (JButton)event.getSource();
			if(button.getText().equals("")) {
				if(xMove) 
					button.setText("X");
				else 
					button.setText("O");

				char winner = checkForWin();
				if(winner == 'X') 
					winLabel.setText("X wins!");
				else if(winner == 'O')										winLabel.setText("O wins!");
				else {

					xMove = !xMove;

					if(xMove) 
						winLabel.setText("X to move.");
					else 
						winLabel.setText("O to move.");
				}
			}
		}
	}

	
 
	private char checkForWin() {
		// If we have all the same thing across the top row,
		// and if that thing is actually a letter (not an
		// unclicked button), then we should return that
		// letter as the winner.
		if(letter[0][0].getText().equals(letter[0][1].getText()) &&
		   letter[0][1].getText().equals(letter[0][2].getText()) &&
		   letter[0][0].getText().length() > 0) {
			return letter[0][0].getText().charAt(0);
		}
                else if(letter[1][0].getText().equals(letter[1][1].getText()) &&
		   letter[1][1].getText().equals(letter[1][2].getText()) &&
		   letter[1][0].getText().length() > 0) {
			return letter[1][0].getText().charAt(0);
		}
                else if(letter[2][0].getText().equals(letter[2][1].getText()) &&
		   letter[2][1].getText().equals(letter[2][2].getText()) &&
		   letter[2][0].getText().length() > 0) {
			return letter[2][0].getText().charAt(0);
		}
                else if(letter[0][0].getText().equals(letter[1][1].getText()) &&
		   letter[1][1].getText().equals(letter[2][2].getText()) &&
		   letter[0][0].getText().length() > 0) {
			return letter[0][0].getText().charAt(0);
		}
                else if(letter[0][2].getText().equals(letter[1][1].getText()) &&
		   letter[1][1].getText().equals(letter[2][0].getText()) &&
		   letter[0][2].getText().length() > 0) {
			return letter[0][2].getText().charAt(0);
		}
                else if(letter[0][0].getText().equals(letter[1][0].getText()) &&
		   letter[1][0].getText().equals(letter[2][0].getText()) &&
		   letter[0][0].getText().length() > 0) {
			return letter[0][0].getText().charAt(0);
		}
                else if(letter[0][1].getText().equals(letter[1][1].getText()) &&
		   letter[1][1].getText().equals(letter[2][1].getText()) &&
		   letter[0][1].getText().length() > 0) {
			return letter[0][1].getText().charAt(0);
		}
                else if(letter[0][2].getText().equals(letter[1][2].getText()) &&
		   letter[1][2].getText().equals(letter[2][2].getText()) &&
		   letter[0][2].getText().length() > 0) {
			return letter[0][2].getText().charAt(0);
		}
		else {
			return '\0';
		}
                
                
	}

	public static void main(String[] args) {

		TicTacToe window = new TicTacToe();

		window.setTitle("Tic Tac Toe");
		window.setSize(400, 400);
		window.setLocation(30, 30);
		WindowListener winList = new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
		};
		window.addWindowListener(winList);
		window.setResizable(true);
		window.setVisible(true);
	}
}
