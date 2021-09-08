package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class OppgaveB01 {

	public static void main(String[] args) {
		String nedreString = showInputDialog("Nedre?");
		int nedreTall = Integer.parseInt(nedreString);
		
		String ovreString = showInputDialog("Øvre?");
		int ovreTall = Integer.parseInt(ovreString);
		
		for (int i = nedreTall; i <= ovreTall; i++) {
			if(i % 2 != 0) {
				String utTekst = "Resultat" + i;
				showMessageDialog(null, utTekst);	
				
			}
		}
		
		
	}
		
}

