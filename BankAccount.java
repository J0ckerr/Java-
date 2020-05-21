public class BankAccount {
	String account_number;
	int leftmoney;
	void savemoney (int x) {
		 leftmoney=leftmoney+x;
	}
	void getmoney (int y) {
		 int a=leftmoney-y;
		 if (a<0) {
				System.out.println("用户余额不足,无法取钱");
                                                                System.out.println("信息工程171 张智棚");
		 }else {
			 leftmoney=a;
		 }
		 }		 	
   int getleftmoney () {
	 return leftmoney;
	 }	
   void BankAccount (String n,int m) {
	   account_number=n;
	   leftmoney=m;
	}
   public static void main(String[] args) {
		
	   BankAccount ba=new BankAccount();
		ba.BankAccount("123456", 500);
		ba.savemoney(1000);
		ba.getmoney(2000);
		int w=ba.getleftmoney();
		System.out.print("当前余额为"+w);
	}
}
