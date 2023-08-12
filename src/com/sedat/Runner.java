package com.sedat;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		Book book1 = new Book("Sefiller","Victor Hugo","ISBN.978-975-6856-00-9",1862);
		Book book2 = new Book("Suç ve Ceza","Dostoyevski","ISBN.9789750516146",1866);
		
		library.addBook(book1);
		library.addBook(book2);
		// book1.setPublicationYear(1655);
		
		// ben burada kitapların ismini yazarını ve basım yılını degistiremem fakat isbn numarasını degistirmek istiyorum.
		// bunu yapmak için book sınfındaki setterları  silebilirim ya da yoruma alabilirim.
		
		List<Book> allBooks =library.getBooks();
		
		library.displayBooksToConsole(allBooks);
		library.writeToFile(allBooks);
		
		
		Book book3 = new Book("Beyaz Dis","Jack London","ISBN.3495834095",1945);
		
		library.addBook(book3);
		library.removeBook(book2);
		library.displayBooksToConsole(allBooks);
		
		// simdi kitap arama methodumuzun calısıp calısmadıgını kontrol edelim.Eğer kitap bulunuyorsa bilgilerini yazdırsın
		// bulunmuyorsa bulunamadı yazdırsın.
		
		
		library.findBookByTitle("Sefiller");
		library.findBookByTitle("Cin ali tatilde");
		
		Book book4 = new Book("İnsan Ne İle Yasar","Tolstoy","ISBN.3564556636724");
		book4.setPublicationYear(1885);
		System.out.println(book4.getPublicationYear());
		System.out.println();
		
		library.displayBooksToConsole(allBooks); // böyle yaptıgımda insan ne ile yaşar çıkmadı çünkü henüz listeye eklemedik.
		library.addBook(book4);

		library.displayBooksToConsole(allBooks);
		
		library.findBookByTitle("insan ne ile yasar"); // equalsIgnoreCase komutu oldugundan kücük harf büyük harf duyarlılıgı ortadan kalktı.
		
		/*
		 * Simdi bu kitaplar önceden yayınlanmıs olmalarına ragmen ben yeniden yayınlayacagım.Kitabın ismini yazarını ve ISO tarafından verilen ISBN
		 * numarasını degistiremem.Fakat yayın yılını degistirmis olucam
		 * Bu sebeple setter methodlarından sadece setPublicationYear methodunu acık bırakıp digerlerine yoruma alacağım.
		 * Sonrasında yeni bir kitap üretip teker teker bilgilerini degistirmeye calısacagım.Konsolda cıktısını kontrol edelim.
		 * Fakat istedigim zaman kitap bilgilerinin hepsine erismek istiyorum bu sebeple getter methodları acık bırakacagım.
		 * 
		 */
		
		Book book5 = new Book("Fareler ve İnsanlar","John Steinbeck","ISBN.9842534635825",1937);
		book5.setPublicationYear(2023);
		library.addBook(book5);
		library.displayBooksToConsole(allBooks); // consolda gördüğünüz üzere yayın yılını 2023 olarak revize ettim diger bilgiler kitabın kendi bilgileri.
		
		Book book6 = new Book("Dirilis","Tolstoy","ISBN.9572346785916");
		book6.setPublicationYear(2023);
		library.addBook(book6);
		library.findBookByTitle("DiriLiS"); // Publication year 'i icermeyen yapıcı methodumuzu kullanarak bu degiskeni set metoduyla sonradan 
		// kendimiz setledik.Listeye ekledik ve findBook methoduyla bulup özelliklerini yazdırdık.
		
		

		
				
		
		
		
		
		
		
		

	}

}
