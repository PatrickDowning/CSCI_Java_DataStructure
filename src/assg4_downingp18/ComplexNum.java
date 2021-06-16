//Patrick Downing
package assg4_downingp18;

public class ComplexNum {
	
	public double realNum;
	public double imaginaryNum;
	// I added the two other constructors which were not there in my previous code
	public ComplexNum()
	{
		realNum = 0.0;
		imaginaryNum = 0.0;
	}
	
	public ComplexNum(double realNum)
	{
		this.realNum = realNum;
		imaginaryNum = 0.0;
		
	}
	
	
	

	// This method saves the complex numbers.
	public ComplexNum(double realNum,double imaginaryNum)
	{
		this.realNum = realNum;
		this.imaginaryNum = imaginaryNum;
	}
	
	
	
	//This method adds the two complex number
	public ComplexNum add(ComplexNum addend)
	{
		// This follows the formula (a+bi)+(c+di) = (a+c)+(b+d)i

		double first = this.realNum + addend.realNum;
		double second = this.imaginaryNum + addend.imaginaryNum;
		
		return new ComplexNum(first,second);
		
	}
	
	// This method subtracts the two complex numbers.
	public ComplexNum sub(ComplexNum addend)
	{
		// This follows the formula (a+bi)-(c+di) = (a-c)+(b-d)i
		double first = this.realNum - addend.realNum;
		double second = this.imaginaryNum - addend.imaginaryNum;
	
		return new ComplexNum(first,second);
	}

	//This method multiplies the two complex numbers
	public ComplexNum mul(ComplexNum addend)
	{
		// This follows the formula (a+bi)*(c+di) = (ac-bd)+(ad+bc)i
		double first = this.realNum * addend.realNum - this.imaginaryNum *addend.imaginaryNum;
		double second = this.realNum * addend.imaginaryNum + this.imaginaryNum *addend.realNum;
		
		return new ComplexNum(first,second);
	}
	//This method negates the complex numbers
	public ComplexNum neg(ComplexNum addend)
	{
		// This follows the formula -(a+bi) = -a-bi
		double first = this.realNum = -(addend.realNum);
		double second = this.imaginaryNum  = -(addend.imaginaryNum);
		
		return new ComplexNum(first,second);
	}

	//This method formats the print statements into a+bi form.
	@Override
	public String toString() 
	{
		
	//will only print imaginary number if real is 0
		if (realNum == 0) 
		{
			return imaginaryNum + "i";
		}
	//will only print real number if imaginary is 0
		else if (imaginaryNum == 0) 
		{
			return ""+realNum;
		}
	//Will print 0 if both real and imaginary are 0
		else if (realNum == 0 && imaginaryNum ==0)
		{
			return "0";
		}
	// will print the format a-bi if imaginary is negative
		else if (imaginaryNum < 0) 
		{
			return realNum + " - " + -(imaginaryNum) + "i";
		}
	// will print the format a+bi.
		else 
		{
			return realNum + " + " + imaginaryNum + "i";
			}

	}
	//This method returns the real number of the complex numbers. 
	public double getReal()
	{
		return realNum;
	}
	//This method returns the imaginary number of the complex numbers.
	public double getImaginary()
	{
		return this.imaginaryNum;
	}
	//This method changes the real number of the complex numbers
	public void setReal(double Real)
	{
		realNum = Real;
	}
	//This method changes the imaginary number of the complex number
	public void setImaginary(double Imaginary)
	{
		imaginaryNum = Imaginary;
	}
	// This method checks if the two complex numbers are equal
	@Override
	public boolean equals(Object obj) 
	{	
		ComplexNum lol = (ComplexNum) obj;
		if (obj instanceof ComplexNum) 
		{
	//this does the actual checking
			if ((lol.realNum == this.realNum)&&(lol.imaginaryNum == this.imaginaryNum))
			return true;
		}
		else if (obj == null)
		{ 
			return false;
		}
		else
		{
			return false;
		}
		return false;
	}
}
	
