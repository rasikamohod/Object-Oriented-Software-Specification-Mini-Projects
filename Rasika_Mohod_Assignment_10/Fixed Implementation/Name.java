package com.gmu.rmohod;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Name {
	
	private final String first, last;
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	@Override 
	public int hashCode() {
		int result = 1;
		result = result * 31 + first.hashCode(); 
		result = result * 31 + last.hashCode(); 
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name)o;
		return n.first.equals(first) && n.last.equals(last);
	}
	@Override public String toString() {
		String result = "";
		result = first+","+last;
		return result;
	}
	public static void main(String[] args){
		Set s = new HashSet();
		s.add(new Name("Mickey", "Mouse"));
		System.out.println(s.contains(new Name("Mickey","Mouse")));
		System.out.println(s);
	}
}
