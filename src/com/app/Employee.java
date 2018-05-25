package com.app;

public class Employee {
int a;
String s;
int d;
String m;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getS() {
	return s;
}
public void setS(String s) {
	this.s = s;
}
@Override
public String toString() {
	return "Employee [a=" + a + ", s=" + s + "]";
}

}
