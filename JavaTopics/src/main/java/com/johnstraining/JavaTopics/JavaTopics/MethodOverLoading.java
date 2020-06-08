package com.johnstraining.JavaTopics.JavaTopics;

/**
 * Hello world!
 *
 */
public class MethodOverLoading 
{
	public void testA(String a) {
		System.out.println("Inside testA with String type args");
	}
	
	public void testA(int a) {
		System.out.println("Inside testA with int type args");
	}
	
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        MethodOverLoading overLoad = new MethodOverLoading();
        overLoad.testA(30);
        overLoad.testA("Hello World");
    }
}
