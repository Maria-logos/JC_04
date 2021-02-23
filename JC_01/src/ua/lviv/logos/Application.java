package ua.lviv.logos;

public class Application {
public static void main(String[] args) 
	{
	    boolean b = false;
	    int in = 10;
	    byte bt = 7;
	    short s = 15;
	    long lng = 555;
	    float fl = 49.33f;
	    double dbl = 8.9989;
	    char cr = 'e' ;
	    
	    System.out.println("int Min " + Integer.MIN_VALUE);
	    System.out.println("int Max " + Integer.MAX_VALUE);
	    System.out.println("byte Min " + Byte.MIN_VALUE);
	    System.out.println("byte Max " + Byte.MAX_VALUE);
	    System.out.println("short Min " + Short.MIN_VALUE);
	    System.out.println("short Max " + Short.MAX_VALUE);
	    System.out.println("long Min " + Long.MIN_VALUE);
	    System.out.println("long  Max " + Long.MAX_VALUE);
	    System.out.println("float Min " + Float.MIN_VALUE);
	    System.out.println("float Max " + Float.MAX_VALUE);
	    System.out.println("double Min " + Double.MIN_VALUE);
	    System.out.println("double Max " + Double.MAX_VALUE);
	    System.out.println("boolean Min " + Boolean.FALSE);
	    System.out.println("boolean Max " + Boolean.TRUE);
	    
	    int [] array = {10, 2, 45, 85, 11, 9, 1 , 100, 88};
	    boolean isSorted = false;
		int tmp = 0;
		while (!isSorted)
		{
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++)
			if (array[i] > array[i+1])
			{
				isSorted = false;
				tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
			}
		}
		
		System.out.println("min value: " + array[0]);
		System.out.println("max value: " + array[array.length - 1]);
	}
}
