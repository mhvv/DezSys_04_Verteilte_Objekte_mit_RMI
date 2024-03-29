package callback;

import java.math.BigDecimal;
import java.rmi.RemoteException;

/**
 * Implementation des Callback Interfaces
 * 
 * @author mhaden
 *
 */
public class PiCallback implements Callback {
	@Override
	/**
	 * Ergebnis empfangen und ausgeben
	 * 
	 * @param pi Ergebnis
	 */
	public void receive(BigDecimal pi) throws RemoteException {
		System.out.println(pi);
	}

}
