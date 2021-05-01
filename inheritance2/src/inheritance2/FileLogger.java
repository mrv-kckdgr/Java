package inheritance2;

public class FileLogger extends Logger {
	//method override
	@Override
	public void log() {
		System.out.println("Dosya Loglandı");
	}
}
