package com.epam.rakesh;
public class g implements sweets,Choco
{
    
	@Override
	public void myChoco() {
		// TODO Auto-generated method stub
		int price=20,weight=250,p=0,w=0,count=0;
		
		p=p+price;
        w=w+weight;
        ++count;
		System.out.printf("The Chocolates in Gift are %d \nthe price is %d \nThe weight of chocolates is %d  ",count,p,w);

		
	}
	@Override
	public void mysweets() {
		// TODO Auto-generated method stub
		int price=10,weight=100,p=0,w=0,count=0;
        {
            p=p+price;
            w=w+weight;
            ++count;
            System.out.printf("The Sweets in Gift are %d \nThe price of Sweets is %d \nThe weight of Sweets is %d  ",count,p,w);
        }
	}
}
