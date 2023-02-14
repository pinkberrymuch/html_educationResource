package lesson01;

import java.util.Scanner;

public class Book {
	String bookName;
	String author;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//책 제목과 저자를 입력하고 그것을 출력하는 .. scanner
		//Book[] myBook = null;  //빈 배열.. 대신 Book클래스만 들어갈 수 있음
		System.out.println("몇권의 책을 입력하겠습니까?");
		int bookS = sc.nextInt();
		Book[] myBook =new Book[bookS];
		int run=0;		
		
		for(int i=0;i<myBook.length;i++) {
			System.out.println("책 제목을 입력하세요.");
			String s1 = sc.next();
			Book b1 = new Book();   //1개의 데이터
			b1.bookName = s1;		
	        boolean isNumeric =  b1.bookName.matches("[+-]?\\d*(\\.\\d+)?");
	        
	        if(isNumeric) {
	        	run = 1;
	        	break;
	        }
	        
	        System.out.println("저자를 입력하세요.");
			String s2 = sc.next();
			b1.author =s2;
	        boolean isNumeric2 =  b1.author.matches("[+-]?\\d*(\\.\\d+)?");
	              
	        if(isNumeric2) {
	        	run=2;
	        	break;
	        }	        
	        
			myBook[i] = b1;	  
		}
		if(run==1) {
			
			System.out.println("책 제목이 잘 못 되었습니다.");
		}else if(run==2){
			System.out.println("저자의 이름이 잘 못 되었습니다.");
		}else{
			for(int i=0;i<myBook.length;i++) {
				System.out.println((i+1)+"번째 책 제목은 " + myBook[i].bookName+ " 입니다");
				System.out.println((i+1)+"번째 저자 이름은 " + myBook[i].author+ " 입니다");
			}
		}
		//책의 제목이나 저자의 이름이 잘 못 되었을 경우 일단 책 제목과 저자 이름은 전부 출력한다. 하지만 틀린 라인을 에러검출을 합니다. (n번째 제목/저자의 이름이 잘 못 되었습니다.)
	} //for문을 한번더 쓴다.
}
