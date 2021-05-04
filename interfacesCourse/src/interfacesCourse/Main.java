package interfacesCourse;

public class Main {

	public static void main(String[] args) {
		//CustomerDal customerDal=new OracleCustomerDal();
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}
}


// interface ler de abstract lar gibi newlenemezler
//interface onu implemente eden class ın referansını tutabilir
//bir class birden fazla interface i implemente edebilir