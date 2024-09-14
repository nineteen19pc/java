package day11;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
	
	public static void writeBytesToFile(File f)
	{
		String s="This file is written using a byte stream";
		try (FileOutputStream fos=new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos))
{
	bos.write(s.getBytes());
	bos.flush();
}catch (IOException e){
	System.out.println(e);
}
		
	}
	public static void readBytesFromFile(File f)
	{
		try (FileInputStream fis=new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis))
{	byte [] b=new byte[fis.available()];
	while(bis.read(b)!=-1)
	{
		System.out.println(new String(b));
	}
}catch (IOException e){
	System.out.println(e);
}
		
	}
	public static void writeCharsToFile(File f)
	{
		String s="This file is wriiten using a char stream";
		try(FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw)){
			bw.write(s);
			bw.flush();
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	public static void readCharsFromFile(File f)
	{
		try(BufferedReader br=new BufferedReader(new FileReader(f)))
		{
			String line="";
			while((line=br.readLine())!=null)
					{
					System.out.println(line);
					}
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		File f = new File("abc.txt");
		writeBytesToFile(f);
		readBytesFromFile(f);
		writeCharsToFile(f);
		readCharsFromFile(f);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;

		try	{
		fis = new FileInputStream(f);
		fos = new FileOutputStream(f);
		fos.write('a');
		System.out.println((char)fis.read());
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			
			
		}catch (IOException e) {
            e.printStackTrace();
        }
	}



	}}
