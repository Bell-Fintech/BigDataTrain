package cn.edu360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class MyScanner {
	private BufferedReader br;

	public MyScanner(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
	}

	public String nextLine() {
		String result;
		try {
			result = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			result = null;
		}
		if (result == null)
			throw new NoSuchElementException();
		else
			return result;
	}

	public int nextInt() {
		String value = nextLine();
		return Integer.parseInt(value);
	}
	
	public void close(){
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
