package main;

import java.util.ArrayList;
public class AccountList {
private int count;
private ArrayList<Account>accList;
public  AccountList() {
	this.accList=new ArrayList();
}
public  AccountList(ArrayList accList) {
	this.accList=accList;
}
public void themTK(Account ac) {
	this.accList.add(ac);
}
public void timTK(String tentk) {
	for(Account account: accList) {
		if(account.getTentk().indexOf(tentk)>0) {
			System.out.println(account);
		}
	}
}
public boolean xoatk(Account ac) {
	return this.accList.remove(ac);
	
}
public void tongTK(int n) {
	int sum =0 ;
	  while(n >0){
	   System.out.println("n%2 = " +n%10);
	   sum = sum + n%10;
	    n= n/10;
	    System.out.println("n/2 = " +n);
	  }
	  return;
	 }
public void inDSTK() {
	for(Account account: accList) {
		System.out.println(account);
	}
}
}




	

