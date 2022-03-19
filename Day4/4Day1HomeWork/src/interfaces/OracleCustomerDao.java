package interfaces;

public class OracleCustomerDao /*extends OracleCustomerDao*/ implements CustomerDao, Repository{//
	/* Class'lar birden fazla interface'i implemente edebilir.
	 * Class'lar sadece bir tana Class'ý extends edebilir.
	 * Bir class extends edilecekse implements den önce yazýlýr. yukarýda bunu örneklemek için yazdýk extends OracleCustomerDao'yu 
	 * yani bu syntax(söz dizimi) ile yazýlýr
	  */

	@Override
	public void add() {
		System.out.println("Oracle ile eklendi");
	}

}
