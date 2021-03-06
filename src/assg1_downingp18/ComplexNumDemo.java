// Patrick Downing
package assg1_downingp18;

public class ComplexNumDemo {

	public static void main(String[] args)
	{
		//Complex Num1
		ComplexNum a1 = new ComplexNum(12,-2);
		//Complex Num2
		ComplexNum a2 = new ComplexNum (4,3);
		
		
		//Tests of all the formulas
		ComplexNum add = a1.add(a2);
		ComplexNum sub = a1.add(a2);
		ComplexNum mul = a1.mul(a2);
		ComplexNum neg = a1.neg(a2);
		
		//print the outcomes of the formula tests
		System.out.println("This is the addition of ComplexNums"+add);
		System.out.println("This is the subtraction of ComplexNum"+sub);
		System.out.println("This is the multiple of ComplexNum"+mul);
		System.out.println("This is the negate of ComplexNum"+neg);
		
		//check if the complex numbers are equal
		if (a2.equals(a2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		if (a2.equals(a1))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		//prints out the get numbers
		System.out.println("this is the getreal of ComplexNum two  "+a2.getReal());
		System.out.println("this is the getimaginary of ComplexNum two  "+a2.getImaginary());
		
		//changes the complex numbers using the set method
		a2.setReal(0);
		a2.setImaginary(0);
		System.out.println("this is the set real ComplexNum 2 changed to zero  "+a2.getReal());
		System.out.println("this is the set imaginary ComplexNum 2 changed to zero  "+a2.getImaginary());
	}
}
