package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập mã tác giả: ");
        this.authorId = sc.nextInt();
        System.out.println("Nhập tên tác giả: ");
        this.authorName = sc.nextLine();
        this.authorName = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập năm sinh: ");
        this.year = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã tác giả: " + this.authorId);
        System.out.println("Tên tác giả: " + this.authorName);
        System.out.println("giới tính: " + this.sex);
        System.out.println("Năm sinh: " + this.year);
        System.out.println("-----------------------------------------------------------");
    }
}
