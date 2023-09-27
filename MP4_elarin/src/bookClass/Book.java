package bookClass;

public class Book {
	private String name;
	private Author author;
	private String ISBN;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [" + name + " by " + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public Book(String name, Author author, String ISBN, double price) {
		super();
		setName(name);
		setAuthor(author);
		setISBN(ISBN);
		setPrice(price);
	}

}
