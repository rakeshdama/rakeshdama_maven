package com.epam.rakesh;

import java.util.*;
import java.lang.*;

interface Choco 
{
	abstract public void myChoco();
}
interface sweets 
{
    abstract public void mysweets();
}
public class a extends g
{
    private static Scanner sc;

	public static void main(String args[]) {
        g gin=new g();
        int option;
        System.out.println("New Year Gift \n1.Chocolates \n2.Sweets ");
        sc = new Scanner(System.in);
        option=sc.nextInt();
        while(true)
        {
        switch(option)
        {
            case 1:
            {
                System.out.println("Chocolates");
                gin.myChoco();
            }break;
            case 2:
            {
                System.out.println("Sweets");
                gin.mysweets();
            }break;
            default:System.exit(0); 
        }
        }
    }
}
