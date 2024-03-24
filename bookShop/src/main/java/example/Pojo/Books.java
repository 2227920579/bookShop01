package example.Pojo;

public class Books {
    /* 图书ID（Book_ID）：唯一标识一本书的标识符。
    书名（Title）：书的名称。
    作者（Author）：书的作者名称。
    是否可借（Available）：表示书当前是否可借的状态。*/

    int Book_ID;
    String Title;
    String Author;
    int Available;

    public int getAvailable() {
        return Available;
    }

    public void setAvailable(int available) {
        Available = available;
    }

    public Books() {
    }

    public Books(int  Book_ID, String Title, String Author, int supplier) {
        this.Book_ID = Book_ID;
        this.Title = Title;
        this.Author = Author;
    }

    public int getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(int book_ID) {
        Book_ID = book_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String toString() {
        return "Book{Book_ID = " + Book_ID + ", Title = " + Title + ", Author = " + Author +  "}";
    }
}
