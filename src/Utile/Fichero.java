package Utile;

import java.io.IOException;
import java.io.RandomAccessFile;

public abstract class Fichero {
	public static  void save(Object obj){
		
		try(RandomAccessFile raf = new RandomAccessFile("fichero.dat", "rw")){
			byte[] objBytes = Convert.toBytes(obj);
			raf.writeLong(objBytes.length);
			raf.write(objBytes);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static Object load(){
		Object o = null;
		
		try(RandomAccessFile raf = new RandomAccessFile("fichero.dat", "rw")){
			byte[] objBytes = new byte[(int)raf.readLong()];		
			raf.read(objBytes);
			o = Convert.toObject(objBytes);
			
		}catch(IOException | ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		return o;
	}
}
