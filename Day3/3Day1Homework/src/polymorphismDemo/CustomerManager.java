package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		
	}
	
	public void add() {
		System.out.println("M��teri eklendi");
		
		this.logger.log("Log mesaj�");
		
		
		
		/*DataBaseLogger dataBaseLogger = new DataBaseLogger();new leyerek kullanmak k�t� kullan�md�r. 
		Ba��ml�l�k olu�turur. Bunun yerine yap�c� metot da yapt���m�z� yaparsak gev�ek ba�l� olur daha iyidr 
		dataBaseLogger.log("Log mesaj");*/
	}
}
