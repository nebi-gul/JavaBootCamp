package interfaces;

public class OracleCustomerDao /*extends OracleCustomerDao*/ implements CustomerDao, Repository{//
	/* Class'lar birden fazla interface'i implemente edebilir.
	 * Class'lar sadece bir tana Class'� extends edebilir.
	 * Bir class extends edilecekse implements den �nce yaz�l�r. yukar�da bunu �rneklemek i�in yazd�k extends OracleCustomerDao'yu 
	 * yani bu syntax(s�z dizimi) ile yaz�l�r
	  */

	@Override
	public void add() {
		System.out.println("Oracle ile eklendi");
	}

}
