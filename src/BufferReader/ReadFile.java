package BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String path="/Users/ashorouali/IdeaProjects/JavaPractice2020/src/DataReaderFile";
        try {fileReader=new FileReader(path);
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }

        }catch (Exception e){
            e.fillInStackTrace();
        }
//        finally {
//            try {
//                fileReader.close();
//                bufferedReader.close();
//            }catch (Exception e){
//                e.fillInStackTrace();
//                System.out.println("file already close");
//            }}



}}
