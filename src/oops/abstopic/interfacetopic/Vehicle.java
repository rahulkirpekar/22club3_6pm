package oops.abstopic.interfacetopic;

public interface Vehicle 
{
//	1) Dm's---constant---[public static final]
	
	// 1) Dm's
	public static final int NO = 10;// [public static final]
	
//	2) Mf's
//	---Abstract methods

	public void getSpec();//public abstract 

//	---NonAbstract Methods
//		1) static method:-
//		------------------
			static void test2()
			{

			}	
//		2) default method:---interface--->child object--default call
//		------------------		
			default void test3()
			{
				test4();
			}
//		3) private method:-
//		------------------
			private void test4()
			{

			}
}
