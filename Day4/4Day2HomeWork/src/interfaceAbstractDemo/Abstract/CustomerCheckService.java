package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {//Yar�n Nero firmas�da Mernis sorgulamas� isteyebilir o y�zden buraya yazd�k
	
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
	
}
