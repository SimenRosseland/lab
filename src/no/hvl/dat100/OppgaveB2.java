package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Math.*;

public class OppgaveB2 {

	public static void main(String[] args) {

		double v = 1.0;

		String xString = showInputDialog("X?");
		double xTall = Double.parseDouble(xString);

		String nString = showInputDialog("N?");
		int nTall = Integer.parseInt(nString);

		System.out.println("Tall " + Math.pow(xTall, nTall));

		while (nTall > 0) {
			v = v * xTall;
			nTall--;
		}
		System.out.println("Sum:" + v);

	}

}
