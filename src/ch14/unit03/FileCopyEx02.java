package ch14.unit03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileCopyEx02 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String source = null, dest = null;
		byte[] b = new byte[8192]; // 자바 버퍼 크기 : 8192
		int len;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			System.out.print("복사할 원본 파일 ? ");
			source = br.readLine();
			
			System.out.print("복사시킬 대상 파일명 ? ");
			dest = br.readLine();
			
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			while((len = fis.read(b)) != -1) { // 8192 바이트씩 읽어냄 - 파일 크기가 8192 바이트 보다 작으면 읽어낸 바이트 크기를 반환 : len
				fos.write(b, 0, len);
			}
			fos.flush();
			
			System.out.println("파일 복사 완료 !!!");
			
		} catch (FileNotFoundException e) {
			System.out.println(source + " 파일이 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
