
package FileIO;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
            FileOutputStream fout=new FileOutputStream("C:\\today.txt");    
            fout.write(65);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    

	}

}
	