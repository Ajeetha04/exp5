/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information;

import information.books.info.*;
import information.journal.jinfo.*;
/**
 *
 * @author ajee
 * 
 */
public class NewClass1 {
    public static void main(String[] args){
    info ob1 = new info("Herbert Schildt" "Complete Reference", "ABC Publication");
    jinfo ob2 = new jinfo("atlas", "234");
    ob1.show();
    ob2.show1();  
    }