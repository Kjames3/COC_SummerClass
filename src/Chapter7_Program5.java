//import java.util.Scanner;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Chapter7_Program5 {
//    public static void main(String[] args) {
//        FileInputStream fstream = null;
//        String idToFind;
//        String dbId = "-1";
//        String dbFirstName;
//        String dbLastName;
//
//        Scanner scnr = new Scanner(System.in);
//        idToFind = scnr.nextLine();
//
//        // You need not understand the file open and close functions to complete this program. Just know that
//        // fstream can be read just like System.in can be read in a new Scanner.
//
//        fstream = new FileInputStream("CustomerDb.txt");
//        scnr = new Scanner(fstream);
//
//        // File successfully opened, will throw exception otherwise
//
//        // When reaching end of file, hasNext() will evaluate to false
//        while (!(dbId.equals(idToFind)) && scnr.hasNext()) {
//            // Finish this loop
//            if (scnr.hasNextInt()) {
//
//            }
//        }
//
//        // Finish this code
//
//        fstream.close();
//    }
//}
