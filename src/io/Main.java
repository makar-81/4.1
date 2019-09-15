package io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by emakarov on 27.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        // put your code here
       // try {
            BufferedReader br;
            BufferedWriter bw;
            String temp;

            //BufferedInputStream fr;
            //OutputStream bw;

            //FileReader fr = new FileReader("./test1.txt");
            //FileWriter wr = new FileWriter("./test2.txt");

            //bw = new BufferedWriter(wr);
            //br = new BufferedReader(fr);

            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //Map<String, Integer> store = new HashMap<String, Integer>();
           // Map<Integer, String> keys = new HashMap<Integer, String>();
           // Map<String, Integer> count = new HashMap<String, Integer>();

            try {
                //int key = 1;
                String word1 = "", word2 = "";
                while ((temp = br.readLine()) != null) {
                    int pos1 = temp.indexOf("\t");
                    if (pos1 > 0) {word1 = temp.substring(0, pos1);}
                    temp = temp.substring(pos1+1,temp.length());
                    while (!temp.isEmpty()) {
                    int pos2 = temp.indexOf(",");
                        if (pos2 > 0) {
                        word2 = temp.substring(0, pos2);
                        temp = temp.substring(pos2+1,temp.length());}
                        else {word2 = temp; temp="";}

                   /* if (store.get(word1) != null) {
                        temp_int = store.get(word1) + Integer.parseInt(word2);
                        store.put(word1, temp_int);
                        count.put(word1, count.get(word1) + 1);
                    } else
                        store.put(word1, Integer.parseInt(word2));


                    if (!keys.containsValue(word1)) {
                        keys.put(key, word1);
                        count.put(word1, 1);
                        key = key + 1;
                    }*/
                        //String total = ;
                        System.out.println(word1 + ',' + word2 + "\t" + "1"+ "\n");
                        bw.write(word1 + ',' + word2 + "\t" + "1" + "\n");
                        bw.flush();
                    }

                }

                //keys.clear();
                //store.clear();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    //}
}

