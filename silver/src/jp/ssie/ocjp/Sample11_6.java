package jp.ssie.ocjp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Sample11_6 {
	public static void main(String[] args) {
		File inputfile=null;
		File outputFile=null;
		BufferedReader in=null;
		BufferedWriter out=null;
		
		try {
			inputFile=new File(C:\ocjp\ocjp_buf.txt);
			outputFile=new File(C:\ocjp\ocjp_buf.txt);
			in=new BufferedReader(new FileReader(inputFile));
			out=new BufferWriter(new FileWriter(outputFile));
			String line;
			
			while((line=in.readLine())!=null) {
				out.write(line);
				out.newLine();
			}
	}
}
