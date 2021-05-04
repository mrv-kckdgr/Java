package abstractClasses;

public abstract class GameCalculator {
	//fakat hesaplaya gelince kim implemente ediyorsa hesaplayı içermek zorunda fakat
	// hesaplayı override etmek zorunda yani kendi hesaplasını yazmak zorunda
	public abstract void hesapla();
		
	
	//final ile override edilmesini istemiyorum demek isteriz
	//GameCalculator ı kim kullanıyorsa gameOver'ı olduğu gibi kullanmak zorunda
	//hiçbir zaman değişmeyecek bir kuraldır
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

//Tüm kullanıcılar için puan hesaplaması olması zorunlu bir sistem
//ama bunu kullanıcı türüne göre herkes override edecek

//abstract benim bir methodum var içeriğini base de belirlemek istemiyorum
//kim inherite ediyorsa hesaplayı override etmek zorunda
//yani kendi kodunu yazmak zorunda

//abstract bir class ın abstract olabilmesi için abstract imzası ile beslenmesi lazım
