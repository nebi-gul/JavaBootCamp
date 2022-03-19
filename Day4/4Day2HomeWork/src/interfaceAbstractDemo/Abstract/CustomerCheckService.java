package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {//Yarýn Nero firmasýda Mernis sorgulamasý isteyebilir o yüzden buraya yazdýk
	
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
	
}
