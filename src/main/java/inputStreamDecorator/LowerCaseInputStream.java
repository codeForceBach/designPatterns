package main.java.inputStreamDecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		
	}
	
	public int read(byte[] b, int offset, int len) throws IOException{
		
		int result = super.read(b, offset, len);
		
		for (int i = 0 ; i <offset + result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return  result;
		
	}
	
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c: Character.toLowerCase((char)c));
		
	}

}
