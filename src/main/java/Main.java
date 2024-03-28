// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
class f_System{
  File infile;
  File outfile;
  FileReader in;
  FileWriter out;
void Prossecefile (String infilename,String outfilename)throws IOException{
   infile = new File(infilename);
   outfile = new File(outfilename);
   in = new FileReader(infile);
   out = new FileWriter(outfile);
   int c;
   while((c=in.read())!=-1){
     out.write(c);
   }
 }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("welcome to File System!");
    f_System fs = new f_System();
    try{
      fs.Prossecefile("in.txt","out.txt");
    }catch(IOException e){
      System.out.println("Error"+ e);
    }
    finally {
      try{
        fs.in.close();
        fs.out.close();
      }catch(IOException e){
        System.out.println("Error"+ e);
      }
      
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}