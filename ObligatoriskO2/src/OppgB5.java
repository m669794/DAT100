import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgB5 {

	public static void main(String[] args) {
		int studenter = 10;
		
		
		for (int i = 0; i < studenter; i++) 
		{
		String poengsumTxt = showInputDialog("Kor mange poeng fekk du?");
		int poengsum = parseInt(poengsumTxt);
		if (poengsum >= 90 && poengsum <= 100)
			System.out.println("Karakteren din er A");
		else if(poengsum >= 80 && poengsum <= 89)
			System.out.println("Karakteren din er B");
		else if(poengsum >= 60 && poengsum <= 79)
			System.out.println("Karakteren din er C");
		else if(poengsum >= 50 && poengsum <= 59)
			System.out.println("Karakteren din er D");
		else if(poengsum >= 40 && poengsum <= 49)
			System.out.println("Karakteren din er E");
		else if(poengsum >= 0 && poengsum <= 39)
			System.out.println("Karakteren din er F");
		else 
			{
			i--;
			System.out.println("Ugyldig poengsum, prøv igjen");
			}
		}
	}

}
