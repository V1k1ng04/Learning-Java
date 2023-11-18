package javer;


class InsufficientFundsException extends Exception{
	
	InsufficientFundsException(String msg)
	{
		super(msg);
	}
}

class BankThreadsa extends Thread {
	
	int bal;
	int withdrawAmount;
	int depositAmount;
	
	BankThreadsa(int bal, int withdrawAmount, int depositAmount){
		this.bal = bal;
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
	}
	
	void deposit(int depositAmount)
	{
		this.bal += depositAmount;
		System.out.println("Thread " + Thread.currentThread().getId() + " deposited: " + depositAmount + "\t\tBalance: " + bal);

	}
	
	void withdraw(int withdrawAmount) throws InsufficientFundsException
	{
		if(this.bal < withdrawAmount)
		{
			throw new InsufficientFundsException("Insufficient funds!!!!!!!");
		}
		else {
		this.bal -= withdrawAmount;
		System.out.println("Thread " + Thread.currentThread().getId() + " withdrew: " + withdrawAmount + "\t\tBalance: " + bal);
		}
	}
	
	public void run()
	{
		for (int i = 0; i < 2; i++) {
	        
	        
	        deposit(depositAmount);
	        
	        
	        try {
				withdraw(withdrawAmount);
			} catch (InsufficientFundsException e) {
				System.out.println(e);
			}

	    }
	}
}

class BankThreads{
	public static void main(String args[]) throws InterruptedException
	{
		BankThreadsa bt1 = new BankThreadsa(10000, 15000, 5000);
		BankThreadsa bt2 = new BankThreadsa(20000, 5000, 10000);
		
		bt1.start();
		bt1.join();
		bt2.start();
		bt2.join();
	}
}

