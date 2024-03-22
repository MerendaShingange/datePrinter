/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package util;
import java.util.Date;


/**
 *
 * @author Lenovo-User
 */
public class Util {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatePrinter datePrinter = new DatePrinter();{
         @Override
            public void printDate() {
                Date date = new Date();
                System.out.println("The current date and time is: " + date);
            }
        }
        
        datePrinter.printDate();
        
    }
    }
    

