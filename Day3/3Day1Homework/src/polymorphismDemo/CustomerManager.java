package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		
	}
	
	public void add() {
		System.out.println("Müþteri eklendi");
		
		this.logger.log("Log mesajý");
		
		
		
		/*DataBaseLogger dataBaseLogger = new DataBaseLogger();new leyerek kullanmak kötü kullanýmdýr. 
		Baðýmlýlýk oluþturur. Bunun yerine yapýcý metot da yaptýðýmýzý yaparsak gevçek baðlý olur daha iyidr 
		dataBaseLogger.log("Log mesaj");*/
	}
}
