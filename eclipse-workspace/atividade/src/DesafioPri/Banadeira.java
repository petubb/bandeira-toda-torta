package DesafioPri;

public class Banadeira {

	public static void main(String[] args) {

		imprimeBandeira("");
	}

	private static void imprimeBandeira(String a) {
		int width = 90;
		String token = "-";
		int space = (((a.length() + 2) - width) / 2) * -1;

		for(int i = 0; i < 6; i++) {
			System.out.println(token.repeat(space + width - 50));

		}
		for(int i = 0; i < 1; i++) {										 //------------------------------------
			System.out.println(token.repeat(space + width -  96)+ "          ------------------------------------");
			
		}											

	
		System.out.println(token.repeat(space + width - 100)+ "                  --------------------------------");
		System.out.println(token.repeat(space + width - 106)+ "                             ---------------------------");
		System.out.println(token.repeat(space + width - 112)+ "                                         ---------------------");
		System.out.println(token.repeat(space + width - 118)+ "                                                     ---------------");
		System.out.println(token.repeat(space + width - 124)+ "                                                                 ---------");

		for(int i = 0; i < 1; i++) {
			System.out.println(token.repeat(space + width - 128)+ "                                                                        ------");
		}

		for(int i = 0; i < 1; i++) {	
			System.out.println(token.repeat(space + width - 132)+ "                                                                                --");
		}
		System.out.println(token.repeat(space + width - 128)+ "                                                                         -----");
		System.out.println(token.repeat(space + width - 124)+ "                                                                 ---------");
		System.out.println(token.repeat(space + width - 118)+ "                                                     ---------------");
		System.out.println(token.repeat(space + width - 112)+ "                                         ---------------------");
		System.out.println(token.repeat(space + width - 106)+ "                             ---------------------------");
		System.out.println(token.repeat(space + width - 100)+ "                 ---------------------------------");
		System.out.println(token.repeat(space + width - 96) + "          ------------------------------------");

		for(int i = 0; i < 5; i++) {
			System.out.println(token.repeat(space + width - 50));
		}
	}
}
//private static void imprimeBandeira(String a) {
//	int width = 90;
//	String token = "-";
//	int space = (((a.length() + 2) - width) / 2) * -1;
//	
//	for(int i = 0; i < 6; i++) {
//		System.out.println(token.repeat(space + width - 50));
//		
//	}
//	for(int i = 0; i < 1; i++) {										 //------------------------------------
//		System.out.println(token.repeat(space + width -  96)+ "          ooooooooooooooooooooooooooooooooooo");
//		
//	}
//	System.out.println(token.repeat(space + width - 100)+ "                 ooooooooooooooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 106)+ "                             ooooooooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 112)+ "                                         ooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 118)+ "                                                     ooooooooooooooo");
//	System.out.println(token.repeat(space + width - 124)+ "                                                                 ooooooooo");
//	
//	for(int i = 0; i < 1; i++) {
//		System.out.println(token.repeat(space + width - 128)+ "                                                                         ooooo");
//	}
//	
//	for(int i = 0; i < 1; i++) {	
//		System.out.println(token.repeat(space + width - 132)+ "                                                                                oo");
//	}
//	System.out.println(token.repeat(space + width - 128)+ "                                                                         ooooo");
//	System.out.println(token.repeat(space + width - 124)+ "                                                                 ooooooooo");
//	System.out.println(token.repeat(space + width - 118)+ "                                                     ooooooooooooooo");
//	System.out.println(token.repeat(space + width - 112)+ "                                         ooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 106)+ "                             ooooooooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 100)+ "                 ooooooooooooooooooooooooooooooooo");
//	System.out.println(token.repeat(space + width - 96) + "          oooooooooooooooooooooooooooooooooooo");
//	
//	for(int i = 0; i < 5; i++) {
//		System.out.println(token.repeat(space + width - 50));
//	}
//}