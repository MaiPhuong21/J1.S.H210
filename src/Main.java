
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List sentence = new ArrayList();
            Scanner sc = new Scanner(System.in);
            flipLine(sc, sentence);       
        for (int i = 0; i < sentence.size(); i++) {
            System.out.println(sentence.get(i));
        }
    }
    public static void readFile(Scanner sc, List sentence)  {
        File myObj = new File("D:\\input.txt");        
        try{
            sc = new Scanner(myObj);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            sentence.add(data);
        }
        sc.close();
        }catch(FileNotFoundException e){
            System.out.println("hello");
        }
    }
    public static void flipLine(Scanner sc, List sentence) throws FileNotFoundException{  
        readFile(sc, sentence);
        for (int i = 0; i < sentence.size() - 1; i += 2) {
            Collections.swap(sentence, i, i + 1);
        }
    }
}
