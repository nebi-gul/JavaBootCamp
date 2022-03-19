package interfaceAbstractDemo.Entities;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.Entity;

public class Customer implements Entity{
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;
	
	
	
}
