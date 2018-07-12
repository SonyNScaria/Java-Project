public class Complex
{
private final double real;
private final double imag;

public Complex(double real, double imag)
{
	this.real = real;
	this.imag = imag;
}

public Complex add(Complex b)
{
	//this.real + b.real;
	//this.imag +=b.imag;
	return new Complex(this.real + b.real, this.imag + b.imag);
}
public static Complex add(Complex a, Complex b)
{
	return a.add(b);
}
public static void main(String args[])
{
	Complex a=new Complex(5.5,7.5);
	Complex b=new Complex(4.5,2.5);
	Complex c=a.add(b);
	System.out.println("The value of Real "+c.real+" and the value of Imaginary "+c.imag);
}


}