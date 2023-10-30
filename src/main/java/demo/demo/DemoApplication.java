package demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Creare un obiect de tip Paragraph
		Paragraph paragraph1 = new Paragraph("Acesta este primul paragraf.");
		Paragraph paragraph2 = new Paragraph("Acesta este al doilea paragraf.");

		// Creare un obiect de tip Author
		Author author = new Author("Numele Autorului"); // Schimbați "Numele Autorului" cu numele autorului real.

		// Creare un obiect de tip Chapter
		Chapter chapter1 = new Chapter("Capitolul 1");

		// Creare un obiect de tip SubChapter
		SubChapter subChapter1 = new SubChapter("Subcapitolul 1.1");

		// Adăugare paragrafe la subcapitol
		subChapter1.addParagraph(paragraph1);
		subChapter1.addParagraph(paragraph2);

		// Adăugare subcapitol la capitol
		chapter1.addSubChapter("Natura");

		// Creare o carte și adăugarea capitolului la aceasta
		Book discoTitanic = new Book("Disco Titanic", author, chapter1);
		discoTitanic.setTableOfContents(new TableOfContents(discoTitanic));

		// Afisarea continutului cărții
		discoTitanic.print();
	}

}
