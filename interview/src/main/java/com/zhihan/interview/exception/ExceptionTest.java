package com.zhihan.interview.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try{
			try{
				int a = 0;
				int b = 10 / a;
			}catch(Exception e){
			}finally{
				System.out.println("finally");
			}
			
		}catch(Exception e){
			System.out.println("外部try");
		}
	
	}
}
