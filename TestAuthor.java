import java.lang.System;

public class TestAuthor {
	public static void main() {
		Author A1 = new Author();
		Author A2 = new Author("Oleg", "olegnetut@mail.ru", true);
		A1.setEmail("olegtut@mail.ru");
		System.out.println(A2);
	}
}
