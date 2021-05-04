package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculators = new WomanGameCalculator();
	}

}


//hesaplama kulllanıcı tipinden kullanıcı tipine değişkenlik göstermekte
//iki yolu var
// birincisi farklı olan hesapla metodunu override eder
// ikincisi abstract



//abstract lar base i gizlemek istediğimizde de kullanılır
//abstract sınıflar asla new lenemez
//newlenebilmesi için abstract metodu ezmemiz gerekir. Ama bu çirkin kullanım