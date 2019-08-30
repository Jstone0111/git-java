
package lol;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lol extends JFrame implements ActionListener 
{
	private JLabel msgs;
	private JPanel board;
	private JButton[][] brdgamebutton;
	private char[][] figures;
	private boolean turnX;

	public Lol() {

		super("Lol");
		this.setLayout(new BorderLayout());
		this.setSize(500, 500);
		msgs = new JLabel("This is now player X's turn.");
		msgs.setVisible(true);
		this.add(msgs, BorderLayout.NORTH);

		board = new JPanel(new GridLayout(3, 3));
		board.setVisible(true);
		brdgamebutton = new JButton[3][3];
		figures = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				brdgamebutton[i][j] = new JButton(" ");
				brdgamebutton[i][j].setEnabled(true);
				brdgamebutton[i][j].addActionListener(this);
				brdgamebutton[i][j].setActionCommand(i + " " + j);
				brdgamebutton[i][j].setVisible(true);
				board.add(brdgamebutton[i][j]);
				figures[i][j] = '.';
			}
		}
		this.add(board, BorderLayout.CENTER);
		turnX = true;
	}

	private boolean won(char playerMark, char[][] board)
	{
		for (int row = 0; row < 3; row++) 
		{
			int count = 0;
			for (int col = 0; col < 3; col++) 
			{
				if (board[row][col] == playerMark)
					count++;
				else
					count = 0;
			}

			if (count == 3)
				return true;
		}

		for (int col = 0; col < 3; col++)
		{
			int count = 0;
			for (int row = 0; row < 3; row++)
			{
				if (board[row][col] == playerMark)
					count++;
				else
					count = 0;
			}

			if (count == 3)
				return true;
		}
		if (board[1][1] == playerMark && board[0][0] == playerMark && board[2][2] == playerMark)
			return true;

		if (board[1][1] == playerMark && board[0][2] == playerMark && board[2][0] == playerMark)
			return true;
		return false;
	}

	private boolean tie(char[][] board) 
	{

		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (board[i][j] == '.')
					return false;
			}
		}

		return true;
	}

	public void actionPerformed(ActionEvent e) 
	{

		String s = e.getActionCommand();
		if (s.length() == 3) {

			Scanner input = new Scanner(s);
			String rowString = input.next();
			String colString = input.next();

			int row = Integer.parseInt(rowString);
			int col = Integer.parseInt(colString);

			JButton button = brdgamebutton[row][col];

			if (button.isEnabled()) {
				if (turnX) {
					msgs.setText("This is now player O's turn.");
					button.setText("X");
					figures[row][col] = 'X';
					button.setEnabled(false);
					turnX = false;
				} else {
					msgs.setText("This is now player X's turn.");
					button.setText("O");
					figures[row][col] = 'O';
					button.setEnabled(false);
					turnX = true;
				}
			}
			if (tie(figures))
			{
				msgs.setText("Tie Game! ");
				for (int i = 0; i < 3; i++)
					for (int j = 0; j < 3; j++)
						brdgamebutton[i][j].setEnabled(false);
			}
			if (won('X', figures))
			{
				msgs.setText("Player X has won!");
				for (int i = 0; i < 3; i++)
					for (int j = 0; j < 3; j++)
						brdgamebutton[i][j].setEnabled(false);
			}

			if (won('O', figures))
			{
				msgs.setText("Player O has won!");
				for (int i = 0; i < 3; i++)
					for (int j = 0; j < 3; j++)
						brdgamebutton[i][j].setEnabled(false);
			}
		}
	}   

    public static void main(String[] args) {
        
    Lol tictac = new Lol();
		tictac.setVisible(true);
	}
}

