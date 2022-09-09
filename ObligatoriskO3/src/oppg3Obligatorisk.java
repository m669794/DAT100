import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppg3Obligatorisk {

	public static void main(String[] args) {
		int x;
		do {
		String nTxt = showInputDialog("Skriv inn eit tall større enn 0");
		int n = parseInt(nTxt);
		x = n;
		int i,fakultet=1;
		for(i=1;i<=n;i++)
			{    
			fakultet=fakultet*i; 
			}
		if(n > 0)
			System.out.println("Fakultet av "+ n +" er: "+fakultet);
		else
			System.out.println("Skriv inn eit tall større enn 0");
		} while(x <= 0);
	}

}
