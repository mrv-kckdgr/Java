package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType==1) {
			System.out.println("Veri tabanına loglandı");
		}else if(logType==2) {
			System.out.println("Email gönderildi");			
		}else {
			System.out.println("Dosyaya loglandı");
		}
	}
}


// 1 ->Database
// 2 ->Mail
// 3 ->File