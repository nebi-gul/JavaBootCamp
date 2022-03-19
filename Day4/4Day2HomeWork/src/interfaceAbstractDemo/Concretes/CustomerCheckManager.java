package interfaceAbstractDemo.Concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{/*Þuan sadece Starbucks istiyor mernisi ama yarýn Nero firmasýda 
Mernis sorgulamasý isteyebilir o yüzden CustomerCheckManager class'ýný yazdýk. */

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		/*Buraya yazmak kötü koddur. Buraya mernis kodu yazarsak servis çalýþmayýnca sistemde çalýþmaz. Baðýmlýlýk oluþur. 
		  Dýþ servisi sisteme adapte ederken Adapter denen desing pattern kullanýlýr. Adapter klasörünü oluþturduk içine bak*/
		/*Aþaðýdaki kodu sildik Adapter klasörüne bak.
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
