


package com.day2;

public class parameterizedconstructor {
int x=2;
parameterizedconstructor(int y)
{
	System.out.println("sum of the value :"+(x+y));
}
parameterizedconstructor(int k,int z)
{
	System.out.println("sum of three num:"+(x+k+z));
}
public static void main(String[] args) {

	parameterizedconstructor l=new parameterizedconstructor(8);
	System.out.println("value of x is:"+l.x);
	parameterizedconstructor m=new parameterizedconstructor(4,6);//choice of passing the parameters 

}

}
//note:this is we can also say constructor overloading becouse here the method name is same but the values are different 
