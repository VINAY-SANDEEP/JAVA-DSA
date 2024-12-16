import java.util.*;
import java.io.*;
public class File_handling {
  public static void main(String[] args) throws IOException {
  File f = new File("C:\\Users\\rsrin\\Desktop\\listening\\vishnu");
   FileInputStream sai = new FileInputStream(f);
   int a;
  while ((a = sai.read()) != -1) {
   System.out.print((char) a);
  }
   FileWriter nuvvu = new FileWriter(f);
  nuvvu.write("priya nuvva leka nenu lenu");
   nuvvu.close();
  }
}
