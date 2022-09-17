/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information.books;

/**
 *
 * @author ajee
 */
public class info {
    String author,bookname,publisher;
    info(String a,String b,String p)
    {
        author=a;
        bookname=b;
        publisher=p;
    }

   
}
class bookinfo extends info
{
    int accno;
    bookinfo(String a,String b,String p,int n)
    {
        super(a,b,p);
        accno=n;
    }

    public void show()
{
   System.out.println("Book Details:");
   System.out.println("name of the book: " +bookname);
   System.out.println("Author: " + author);
   System.out.println("Publisher: " + publisher);
}
}