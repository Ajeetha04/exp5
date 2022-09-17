/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information.journal;

/**
 *
 * @author ajee
 */
public class jinfo {
    String name;
    int id;
    jinfo(String s,int i)
    {
        name=s;
        id=i;
    }
    
}
 class jInfo extends jinfo
{
    jInfo(String s,int i)
    {
        super(s,i);
    }
public void show1()
{
   System.out.println("journal Details:");
   System.out.println("journal name: " +name);
   System.out.println("journal id: " +id);
}
}