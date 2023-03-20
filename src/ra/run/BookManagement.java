package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static List<Author> listAuthor = new ArrayList<>();
    public static List<Book> listBook = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả \n" +
                    "2. Nhập số sách và nhập thông tin các sách \n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sách theo tên tác giả sách \n" +
                    "5. Thoát \n");
            System.out.print("Vui lòng nhập số: ");
             choise = sc.nextInt();
            switch (choise){
                case 1:
                    getlistAuthor(sc);
                    displaylistAuthor();
                    break;
                case 2:
                    getBook(sc);
                    displayListBook();
                    break;
                case 3:
                    Collections.sort(listBook);
                    break;
                case 4:
                    searchBook(sc);
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1->5");
            }
        } while (true);
    }
    public static void getlistAuthor(Scanner sc) {
        System.out.println("Nhập số lượng tác giả: ");
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            Author author = new Author();
            author.inputData(sc);
            listAuthor.add(author);
        }
    }
    public static void displaylistAuthor() {
        System.out.println("\n Thông tin tác giả.");
        for (int i = 0; i < listAuthor.size(); i++) {
            listAuthor.get(i).displayData();
        }
    }

    public static void getBook(Scanner sc) {
        System.out.println("Nhập số lượng sách: ");
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            Book book = new Book();
            book.inputData(sc);
            listBook.add(book);
        }
    }
    public static void displayListBook(){
        System.out.println("Thông tin sách: ");
        for (int i = 0; i < listBook.size(); i++) {
            listBook.get(i).displayData();
        }
    }
    public static void searchBook(Scanner sc) {
        sc.nextLine();
        System.out.println("Nhập tên tác giả để tìm kiếm sách: ");
        String searchAuthorName;
         searchAuthorName = sc.nextLine();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getAuthor().contains(searchAuthorName)){
                listBook.get(i).displayData();
            }
        }
    }
}
