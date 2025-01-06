package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title;
	private String author;
	private int year;
	private double cost;
	
	//No-Argument Constructor
	public Books() {
	}
	
	//Argument Constructor
	public Books(int bookId, String title, String author, int year, double cost) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.year = year;
		this.cost = cost;
	}
	
	//Public Getter & Setter
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//toString
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", title=" + title + ", author=" + author + ", year=" + year + ", cost="
				+ cost + "]";
	}

}
