import java.util.Objects;

class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return author.equals(author1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}

class Book {
    private String bookName;
    private Author author;
    private int publishingYear;


    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " + '\'' + bookName + '\'' +
                ", Автор: " + author.toString() +
                ", год публикации: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }
}

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("L. Tolstoy");
        Author author2 = new Author("D. Karizi");

        Book warAndPeace = new Book("War and Peace", author1, 1876);
        Book whisperer = new Book("Whisperer", author2, 2011);

        whisperer.setPublishYear(2012);
        System.out.println(warAndPeace);
        System.out.println(whisperer);
    }
}