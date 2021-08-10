package ImpJavaSesssion; //package is a keyword

public class DataTypes {

	public static void main(String[] args) {

		/*
		 * primitive data type will take the memory directly from java memory , we wont
		 * create an object to take the same Premitive DataTypes Interger
		 * family---Byte,short,long,int floating family --- float,double Character
		 * Booelan Family--Either true or false
		 */

		/*
		 * Size=8 bits =1 byte range=-128 to 128
		 */
		byte b = 10;
		byte b1 = -10;

		/*
		 * size 16 bits =2 bytes range =-32768 to 32767
		 */
		short s = 105;
		short s1 = -55;

		/*
		 * size=4 bytes = 32 bits range=-2^31 to 2^32-1
		 */
		int i = 100;
		int i1 = -200;

		/*
		 * size=8 bytes =64 bits
		 * 
		 * range=2^63 to 2^63-1
		 */
		long l = 30;
		long distance = 8989898;
		long l1 = -45;

		/*
		 * sixe=4 bytes= 32 bits range=after dot it wil take upto 7 numbers
		 */
		float f = 10.50f;
		float f1 = 20.45f;

		/*
		 * size=8 bytes =64 bits range after dot it wil take upto 15 numbers
		 */
		double d = 104.56;
		double d1 = 10; // by default it will take 10.00

		/*
		 * size =16 bits=2 bytes
		 */
		char c = '3'; // this will be storing the keyword of 3 , as per the ascii value a char is
						// assigned to it
		char c1 = 'a';

		System.out.println(c);
		/*
		 * upto ~1 bit
		 */
		boolean flag = true; // true and false are keyword
		boolean flag1 = false;

	}

}
