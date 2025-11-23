package j102_OCA.Q100.p2;


import j102_OCA.Q100.p1.Acc;

public class Test extends Acc {
		public static void main(String[] args) {
			Test obj = new Test();//Sadece child class türündeki obje procted variable ulaşabilir
			obj.r=12;//protect
			obj.s=12;//public

			Acc  obj2= new Test();
			obj.s=13;
		//	obj2.r=12; obj data türü parent class olduğu için ulaşamaz.

			Acc obj3=new Acc();
			obj3.s=13;

//	        Acc obj2 = new Acc();
//			Test obj3 = new Test();
//			Test obj4 = new Acc();





	//Protected is inheritable to sub class (outside the package) so there for if
	// the sub class’ object was created then you could access to the protected variable.
	// But the object was created from super class

	    }
	}
	/**
	 Which statement is true?
	  A. Both p and s are accessible via obj.
	  B. Only s is accessible via obj.
	  C. Both r and s are accessible via obj.
	  D. p, r, and s are accessible via obj.

	 Answer: B
	 
	 
	 So, public can be reached from anywhere....
	 protected can be reached from the same package,
	 and if we need to reach from another package,
	 it needs to be extend from parent AND needs to
	 create an object from the child class...
	 Default only can be reached from same package...
	 Private only from same class.


	 */

