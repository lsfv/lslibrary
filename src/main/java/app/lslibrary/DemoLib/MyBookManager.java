package app.lslibrary.DemoLib;

import java.util.ArrayList;
import java.util.List;

public abstract class MyBookManager
{
    public static List<MyBook> getAllBooks()
    {
        List<MyBook> books=new ArrayList<>();
        books.add(new MyBook(1, "C++"));
        books.add(new MyBook(2, "JAVA"));
        books.add(new MyBook(3, "C#"));
        return books;
    }
}