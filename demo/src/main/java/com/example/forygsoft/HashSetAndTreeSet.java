package com.example.forygsoft;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {

	public static void main(String[] args) {
     //HashSet 允许添加null值,并且元素不能为重复且无序
	/*Set<String> hashSet=new HashSet<String>();
	hashSet.add("a");
	hashSet.add("a");
	hashSet.add("b");
	hashSet.add("c");
	hashSet.add(null);
	for(String ss :hashSet){
		System.out.println(ss);
	}
	System.out.println("\n");
	System.out.println(hashSet);*/
	
	//treeSet不允许添加null,并且元素不能重复，且数据有序
	Set<String> set = new TreeSet<String>();
	set.add("s4");
	set.add("s3");
	set.add("s4");
	 //set.add(null); //--TreeSet元素不允许null
	for (String i : set) {
	    System.out.println(i);
	}
	//[s3, s4]
	System.out.println(set);

	}
}
