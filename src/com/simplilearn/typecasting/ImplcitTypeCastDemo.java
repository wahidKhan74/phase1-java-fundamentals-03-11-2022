package com.simplilearn.typecasting;

public class ImplcitTypeCastDemo {

	public static void main(String[] args) {
		// Implicit Type cast : Automatically type cast
		/**
		 * Widening Typecast : Converts data from lower range value to higher range type.
		 * byte  -> short  -> int  -> long -> float  -> double.
		 */

		byte smallCount = 127; // 1 byte (8bit) => -128 to 127
		
		int intCount = smallCount; // Widening => byte (1byte) -> int (4byte)
		
		long bigCount = intCount; // Widening =>  int (4byte)->  long (8 byte)
		
		float floatCount = intCount;  // Widening =>  int (4byte)->  float (4 byte)
		
		float floatCount2 = bigCount;  // Widening =>  long (8 byte)->  float (4 byte)
		
		double decimalCount = bigCount;  // Widening =>  long (8 byte)->  double (4 byte)
		
		
		System.out.println("Byte Count : "+smallCount);
		System.out.println("Integer Count : "+intCount);
		System.out.println("Long Count : "+bigCount);
		System.out.println("Float Count : "+floatCount);
		System.out.println("Float Count 2: "+floatCount2);
		System.out.println("Double Count : "+decimalCount);
		
		
	}

}
