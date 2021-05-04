package interfacesCourse;

public class MySqlDal implements CustomerDal, Repository {

	@Override
	public void add() {
		System.out.println("MySQL eklendi");
		
	}

}
