import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgB4 {

	public static void main(String[] args) {
		
		String intektTxt = showInputDialog("Kor masse tjente du i år?");
		double intekt = parseInt(intektTxt);
		double sats;
		
		if (intekt <= 164100) {
			System.out.print("Du betaler ikkje skatt, nettointekten din er ");
			System.out.printf("%.2f", intekt);
			System.out.println();
		}
			
		else if(intekt >= 164101 && intekt <= 230950) {
			sats = 0.0093;
			sats = intekt * sats;
			intekt = intekt - sats;
			System.out.print("Trinnskatten din er på trinn 1, sats ligg på 0.93%, nettointekten din er ");
			System.out.printf("%.2f", intekt);
			System.out.println();
		}
		
		else if(intekt >= 230951 && intekt <= 580651) {
			sats = 0.0241;
			sats = intekt * sats;
			intekt = intekt - sats;
			System.out.print("Trinnskatten din er på trinn 2, sats ligg på 2.41%, nettointekten din er ");
			System.out.printf("%.2f", intekt);
			System.out.println();
		}
		
		else if(intekt >= 580651 && intekt <= 934050) {
			sats = 0.1152;
			sats = intekt * sats;
			intekt = intekt - sats;
			System.out.print("Trinnskatten din er på trinn 3, sats ligg på 11.52%, nettointekten din er ");
			System.out.printf("%.2f", intekt);
			System.out.println();
		}
		
		else {
			sats = 0.1452;
			sats = intekt * sats;
			intekt = intekt - sats;
			System.out.print("Trinnskatten din er på trinn 4, sats ligg på 14.52%, nettointekten din er ");
			System.out.printf("%.2f", intekt);
			System.out.println();
		}
	}

}
