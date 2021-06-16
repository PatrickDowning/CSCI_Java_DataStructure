//Patrick Downing
package assg4_downingp18;

import junit.framework.TestCase;




public class TestComplexNum extends TestCase {
	//calling the variables
	private ComplexNum b;
	private ComplexNum e;
	private ComplexNum f;
	private ComplexNum g;
	private ComplexNum h;
	private ComplexNum i;
	
	// Variables that I tested
	protected void setUp() {
	
	 b = new ComplexNum(5,5);		
	e = new ComplexNum();
	f = new ComplexNum(0);
	g = new ComplexNum(0,0);
	h = new ComplexNum (7);
	i = new ComplexNum (-8,-9);
	}
	// Tests constructor without any parameters
	public void testDefaultConstructor()
	{
		assertEquals("Constructor",0.0, e.getReal());
	}
	// Tests constructor with one parameter
	public void testOneParameterConstructor()
	{
		assertEquals("One Parameter Constructor",0.0, f.getReal());
		assertEquals("One Parameter Constructor",7.0, h.getReal());
	}
	public void testTwoParameterConstructor()
	{
		assertEquals("Two Parameter Constructor",0.0, g.getReal());
		assertEquals("Two Parameter Constructor",5.0, b.getReal());
	}
	//addition check
	public void testAdd()
	{
		// tests positive
		assertEquals ("addition check",new ComplexNum(10,10), b.add(b));
		// tests negatives
		assertEquals ("addition check",new ComplexNum(-3.0,-4.0), i.add(b));
		
	}
	//subtraction check
	public void testSub()
	{
		assertEquals ("subtratction check",new ComplexNum(0,0), b.sub(b));
		assertEquals ("subtratction check",new ComplexNum(-13.0,-14.0), i.sub(b));
	}
	//multiplication check
	public void testMul()
	{
		assertEquals ("Multiplication check",new ComplexNum(0,50), b.mul(b));
		assertEquals ("Multiplication check",new ComplexNum(5.0,-85.0), i.mul(b));
		
	}
	
	//negation check
	public void testNeg()
	{
		assertEquals ("Negation check",new ComplexNum(-5,-5), b.neg(b));
		assertEquals ("Negation check",new ComplexNum(8,9), i.neg(i));
	}
	
	//toString check
	public void testtoString()
	{
		assertEquals ("toString check","5.0 + 5.0i", b.toString());
		
	}
	//getReal check
	public void testgetReal()
	{
		assertEquals ("getReal check",5.0, b.getReal());
		
	}
	//getImaginary check
	public void testgetImaginary()
	{
		assertEquals ("getImaginary check", 5.0, b.getImaginary());
		
	}
	//setReal check
	public void testsetReal()
	{
		b.setReal(8);
		assertEquals ("setRealtest",8.0,b.getReal());
		
	}
	//setImaginary check
	public void testsetImaginary()
	{
		b.setImaginary(12);
		assertEquals ("setImaginary check",12.0, b.getImaginary());
		
	}
	//equals check
	public void testequals()
	{
		assertEquals("equals test",true,b.equals(b));
		assertEquals("equals test",false,i.equals(b));
		
	}
	
}
