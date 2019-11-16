package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int sksk = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String poo = JOptionPane.showInputDialog("what type of organism uses Hydroflask?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(poo = "vsco girl") {
			sksk = sksk + 1;
			JOptionPane.showMessageDialog(null, "not incorrect! your score is " + sksk);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "not correct! the answer was: vsco girl. your score is " + sksk);
		}
		// 6. Add some more riddles
		String e = JOptionPane.showInputDialog("what animal eats small annoying bois?");
		if(e = "anteater") {
			sksk = sksk + 1;
			JOptionPane.showMessageDialog(null, "not incorrect! your score is " + sksk);
		}
		else {
			JOptionPane.showMessageDialog(null, "not correct! the answer was: anteater. your score is " + sksk);
		}
		// 2. Make a pop up to show the score.
		//E
	}
}

