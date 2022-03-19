package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		EMailLogger logger= new EMailLogger();
		logger.log("Log mesaj�");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DataBaseLogger(), new EMailLogger(), new ConsoleLogger()};
		//Buna polimorfizm denir. Kal�t�m verilen base s�n�f kendini extends eden s�n�flar�n referans�n� tutabilir.
		for (BaseLogger loggerr : loggers) {
			loggerr.log("Log mesaj");
		}
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();
		
		
	}

}
