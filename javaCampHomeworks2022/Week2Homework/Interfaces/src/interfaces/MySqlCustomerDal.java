package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {
//extends OracleCustomerDal// 

	@Override
	public void add() {
		System.out.println("Added to The MySql");
	}

}
