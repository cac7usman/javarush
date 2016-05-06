package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file ="";

        while (!file.equals("exit")) {
            file = r.readLine();
            File f = new File(file);
            if (f.exists()) {

                ReadThread rt = new ReadThread(f.getAbsolutePath());
                rt.start();
                rt.join();

            }
        }
        System.out.println(resultMap);

        r.close();



    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;//implement constructor body
        }

        @Override
        public void run() {



            try {
                Map<String, Integer> map = new HashMap<String, Integer>();
                int MaxByte = 0;
                FileInputStream inputStream = new FileInputStream(fileName);

                String s = "";

                while (inputStream.available() > 0) {
                    int buffer = inputStream.read();
                    if (map.containsKey(String.valueOf(buffer))) {
                        int value = map.get(String.valueOf((buffer))) + 1;
                        if (value > MaxByte) {
                            MaxByte = value;
                            s = String.valueOf(buffer);
                        }
                        map.replace(String.valueOf(buffer), value - 1, value);

                    } else {
                        map.put(String.valueOf(buffer), 1);
                    }

                }
                synchronized (resultMap) {
                    resultMap.put(s, MaxByte);
                }
                inputStream.close();

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }


        }


    }

    // implement file reading here - реализуйте чтение из файла тут
}



