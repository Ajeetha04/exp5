/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package package2;

package package2;
import package3.*;
class pack1 extends pack2{
   
    public static void main(String args[])
     {
         pack1 obj=new pack1();
         obj.msg();
         pack1 obj1=new pack1();
     System.out.println("DEFAULT METHOD CANNOT BE ACCESSED OUTSIDE THE PACKAGE!!");
     }
}

package package3;
public class pack2
{
    protected void msg()
    {
         int a=40;
         int b=30;
         System.out.println(a+b);
         System.out.println("PROTECTED METHODS CAN BE ACCESSED!!");
    }
  void msg1()
    {
         int a=40;
         int b=30;
         System.out.println(a+b);
    }
