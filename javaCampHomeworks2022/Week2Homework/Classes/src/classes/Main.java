package classes;

public class Main {

	public static void main(String[] args) {
		// These Classes is a reference type.
		// "CustomerManager customerManager" This section is store in Stack.
		// "new CustomerManager();" This section is store in Heap.
		CustomerManager customerManager = new CustomerManager(); // Reference number 101
		CustomerManager customerManager2 = new CustomerManager(); // Reference number 102

		customerManager = customerManager2; // The customerManager reference number changed. The new customerManager
											// reference number same that the customerNumber2. It's means the number is
											// 102. 101 will be deleted by the garbage collector.

		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();

		customerManager2.Add();
		customerManager2.Update();
		customerManager2.Remove();

	}

}

// Value type variables are store in Stack.
// Arrays are reference types.

// Try to solve these problems 

// int sayil 10 ;
// int sayi2 = 20 ;
// sayi2 = sayil ;
// sayil -30 ;
// System.out.println ( sayi2 ) ; ?? 

// int [ ] sayilarl = new int [ ] { 1,2,3 ) ;
// int [ ] sayilar2 new int [ ] 14,5,6 ) ;
// sayilar2 = sayilarl ;
// sayilar1 [ 0 ] = 10 ;
// System.out.println ( sayilar2 [ 0 ] ) ;