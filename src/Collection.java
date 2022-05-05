// ArrayList programs
// Program to perform various actions on Arraylist.

import java.util.*;
import java.util.concurrent.locks.Lock;

/*import java.util.*;
public class Collection{
    public static void main(String[] args){
        ArrayList<String> colourList = new ArrayList<String>();
        colourList.add("white");
        colourList.add("black");
        colourList.add("pink");
        colourList.add("blue");
        colourList.add("orange");

        Iterator itr = colourList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        colourList.add(0,"yellow");
//        System.out.println("list after adding element: ");
//        Iterator itr2 = colourList.iterator();
//        while(itr2.hasNext()){
//            System.out.println(itr2.next());
//        }
//
//        System.out.println("Retriving a specific element in list: ");
//        System.out.println(colourList.get(3));
//
//        colourList.set(4,"green");
//        System.out.println("List after updating the list: ");
//        Iterator itr3 = colourList.iterator();
//        while(itr3.hasNext()){
//            System.out.println(itr3.next());
//        }
//          colourList.remove(2);
//          System.out.println("List after removing element at index 2: ");
//          Iterator itr4 = colourList.iterator();
//          while(itr4.hasNext()){
//              System.out.println(itr4.next());
//          }
          if(colourList.contains("red")){
              System.out.println("Elment present in list");
          }
          else{
              System.out.println("Element not found in the list");
          }
    }
}*/
/*public class Collection {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(2);
        al.add(3);
        al.add(70);
        al.add(65);
        al.add(54);

        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}*/
/*public class Collection {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(2);
        al.add(3);
        al.add(70);
        al.add(65);
        al.add(54);
//        Collections.shuffle(al);
//        Collections.reverse(al);
//        Iterator itr = al.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        al.set(1,77);
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}*/

// Program for treeSet
/*public class Collection{
    public static void main(String[] args){
        TreeSet tr = new TreeSet();
        tr.add(2);
        tr.add(4);
        tr.add(9);
        tr.add(76);

        Iterator itr = tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}*/

// Multithreading

/*public class Collection extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Collection c1 = new Collection();
        c1.start();
    }
}*/

/*public class Collection implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Collection c1 = new Collection();
        Thread t1 = new Thread(c1);
        t1.start();
    }
}*/

//Printing even odd using one thread
/*public class Collection implements Runnable{
    public void run(){
        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println("even number is: "+i);
            }
            else{
                System.out.println("odd number is: "+i);
            }
        }
    }
    public static void main(String[] args){
        Collection c1 = new Collection();
        Thread t1 = new Thread(c1);
        t1.start();
    }
}*/

// Printing even odd using two Threads

 /*class PrintEven implements Runnable {
     static Object lock=new Object();
    public void run(){
        synchronized (lock) {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }
    }
}
class PrintOdd implements Runnable {
    static Object lock=new Object();
    public void run(){
        synchronized (lock) {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }
    }
}
public class Collection {
    public static void main(String[] args){
        PrintEven p1 = new PrintEven();
        PrintOdd p2 = new PrintOdd();
        Thread t1 = new Thread(p1,"Thread1");
        Thread t2 = new Thread(p2,"Thread2");
        t1.start();
        t2.start();
    }
}*/

public class Collection {
    public static void main(String[] args){
        HashMap<Integer,String> newHash = new HashMap<>();
        newHash.put(1,"Ashish");
        newHash.put(2,"Bhagyashree");
        newHash.put(3,"Rachana");
        newHash.put(4,"Krushna");
        newHash.put(5,"Trupti");
        newHash.put(6,"Sunidhi");
        newHash.put(7,"Vaibhav");
        newHash.put(8,"Dharmraj");
        newHash.put(9,"Ganesh");
        newHash.put(10,"Narendra");
        newHash.put(11,"Anant");

        Iterator itr = newHash.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> map = (Map.Entry)itr.next();
            System.out.println(map.getKey()+" : "+map.getValue());
        }
    }
}




































