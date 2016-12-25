//package package2;

//import package1.*;		//Importing package


public class Assgn4_1
{
	public static void main(String []args)
	{
		//One a=new One();
		Two b=new Two();		//Object creation
		//a.func();
		b.func();				//Function call
	}
}

class Zero
{
	protected void func()
	{
		System.out.println("WORKING");
	}
}

/*class One extends sample 		//Inheriting from class sample
{
   protected void func() 
   {
        sample c = new sample();
        c.Public();						//Function in class sample
        c.Protected();  				//Function in class sample
    }    
}*/

class Two extends Zero			//Inheriting from class Zero
{
	protected void func()
	{
		super.func();			//Calling func of base class
	}
}
