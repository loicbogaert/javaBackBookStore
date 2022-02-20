package bookStore.springbootbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   private String title;
   private String author;
   private Integer pageNumber;
   private String isbn;
   private Boolean available;

    public Book() {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.isbn = isbn;
        this.available = available;
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

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Entities.Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", isbn='" + isbn + '\'' +
                ", available=" + available +
                '}';
    }
}
