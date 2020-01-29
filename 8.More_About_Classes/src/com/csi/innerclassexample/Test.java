package com.csi.innerclassexample;

public class Test {

	public static void main(String[] args) {
		OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();

	innerObj.invoke();
	}

}
