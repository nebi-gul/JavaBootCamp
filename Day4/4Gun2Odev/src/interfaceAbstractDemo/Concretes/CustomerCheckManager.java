package interfaceAbstractDemo.Concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{/*�uan sadece Starbucks istiyor mernisi ama yar�n Nero firmas�da 
Mernis sorgulamas� isteyebilir o y�zden CustomerCheckManager class'�n� yazd�k. */

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		/*Buraya yazmak k�t� koddur. Buraya mernis kodu yazarsak servis �al��may�nca sistemde �al��maz. Ba��ml�l�k olu�ur. 
		  D�� servisi sisteme adapte ederken Adapter denen desing pattern kullan�l�r. Adapter klas�r�n� olu�turduk i�ine bak*/
		/*A�a��daki kodu sildik Adapter klas�r�ne bak.
		 * tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new KPSPublicSoapProxy() {
			
			@Override
			public boolean TCKimlikNoDogrula(long TCKimlikNo, String ad, String soyad, int dogumYili) throws RemoteException {
				// TODO Auto-generated method stub
				return false;
			}
		};*/
		
		return true;
	}

}
