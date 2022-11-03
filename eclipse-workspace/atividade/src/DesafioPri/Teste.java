package DesafioPri;


public class Teste {

	public static void main(String[] args) {

		int linhas = 10;

		for (int i=1; i<= linhas ; i++)   
		{  
			for (int j = linhas; j >= i ; j--)   
			{  
				System.out.print("*");   // so esses mano aqui
			}  
			for (int k = 1; k < 2*(i -1) ;k++){   
				System.out.print(" ");   
			}  

			if( i == 1) {   
				System.out.println("*********");  
			}  

			else if( i == 2) {   
				System.out.println("*********");  
			}  

			else if( i == 3) {   
				System.out.println("********");  
			}  
			else if( i == 4) {  
				System.out.println("*******");  
			}  
			else if( i == 5) {   
				System.out.println("******");  
			}  
			else if( i == 6) {   
				System.out.println("*****");  
			}  
			else if( i == 7) {   
				System.out.println("****");  
			}  
			else if( i == 8) {   
				System.out.println("***");  
			}  
			else if( i == 9) {   
				System.out.println("**");  
			}  

			else {  
				System.out.println("*");
			}  
		}   

		for (int i=linhas-1; i>= 1; i--) {

			for (int j = linhas; j > i ; j--){  
				System.out.print("*");  
			}  
			System.out.print("");  

			for (int k = 1; k < 2*(i -1) ;k++){  
				System.out.print(" ");  
			}  
			if(i==1)  
				System.out.println("**********");

			else if( i == 2) {  
				System.out.println("**********");  
			}  

			else if( i == 3) {   
				System.out.println("*********");  
			}  

			else if( i == 4) {   
				System.out.println("********");  
			}  

			else if( i == 5) {   
				System.out.println("*******");  
			}  

			else if( i == 6) {   
				System.out.println("******");  
			}  

			else if( i == 7) {   
				System.out.println("*****");  
			}  

			else if( i == 8) {   
				System.out.println("**");  
			}  

			else if( i == 9) {   
				System.out.println("  *");  
			}  
		}  
	}  
}  
