package interfaces;

public class OracleCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Added to the Oracle");
	}

}
