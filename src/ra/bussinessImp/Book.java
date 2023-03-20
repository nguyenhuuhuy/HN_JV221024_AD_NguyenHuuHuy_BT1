package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.run.BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements IShop, Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private String author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, String author, float importPrice, float exportPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("nhập mã sách: ");
        this.bookId = sc.nextInt();
        System.out.println("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        this.bookName = sc.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        this.title = sc.nextLine();
        System.out.println("Nhập số trang sách: ");
        this.numberOfPages = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá sách: ");
        this.importPrice = sc.nextInt();
        System.out.println("Số lượng sách: ");
        this.quantity = sc.nextInt();
        System.out.println("trạng thái sách: ");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());
        this.exportPrice = importPrice * RATE;
        System.out.println("vui lòng chọn tác giả cho sách: ");
        for (int i = 0; i < BookManagement.listAuthor.size(); i++) {
            System.out.println("tác giả thứ: " + (i + 1)+" " + BookManagement.listAuthor.get(i).getAuthorName());
        }
        int bookAuthor = sc.nextInt();
        this.author = BookManagement.listAuthor.get(bookAuthor - 1).getAuthorName();
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Tiêu đề sách: " + this.title);
        System.out.println("Tên tác giả: " + this.author);
        System.out.println("Giá bán sách: " + this.exportPrice);
        System.out.println("Số lượng sách: " + this.quantity);
        System.out.println("Trạng thái: " + this.bookStatus);
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.exportPrice - o.exportPrice);
    }
}
