/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author acer
 */
public class Multix implements Runnable{
    public void run(){
        System.out.println("Thread implements is running");
    }
    public static void main(String args[]){
        Multix m1 = new Multix();
        Thread t1 = new Thread(m1);
                t1.start();
    }
}
