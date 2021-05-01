package reCapKodlamaio;

public class StudentManager extends UserManager {
	
	public void addComment(String comment) {
		System.out.println("*********Comment Add***********");
		System.out.println("Öğrenci yorumunuz başarılı bir şekilde eklendi.\nYorumunuz: " + comment);
		System.out.println("*********Comment Add Finish***********\n");
	}
	
	public void listComment(String[] comment) {
		System.out.println("*********Comment List***********");
		System.out.println("Öğrenci yorumunuz başarılı bir şekilde listelendi. Yorumlarınız aşağıdaki gibidir:" );
		for(int i=0; i<comment.length; i++) {
			System.out.println(comment[i]);
		}
		System.out.println("*********Comment List Finish***********\n");
	}

}
