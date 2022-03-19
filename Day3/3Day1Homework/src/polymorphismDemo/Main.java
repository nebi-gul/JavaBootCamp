package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		EMailLogger logger= new EMailLogger();
		logger.log("Log mesajý");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DataBaseLogger(), new EMailLogger(), new ConsoleLogger()};
		//Buna polimorfizm denir. Kalýtým verilen base sýnýf kendini extends eden sýnýflarýn referansýný tutabilir.
		for (BaseLogger loggerr : loggers) {
			loggerr.log("Log mesaj");
		}
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();
		
		
	}

}
