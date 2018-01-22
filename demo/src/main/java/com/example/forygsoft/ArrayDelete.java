package com.example.forygsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayDelete {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(Arrays.asList("a","b","c","d"));
		/*for(String s:list){
			//java.util.ConcurrentModificationException
			if("a".equals(s)){
				list.remove(s);
			}
		}*/
		
		//在一个循环中删除一个列表中的元素必须使用迭代器的remove删除方法。
		//否则会抛出并发修改异常ConcurrentModificationException。
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String ss=it.next();
			if("a".equals(ss)){
				it.remove();
			}
			
		}
		for(String s :list){
			System.out.println(s);
		}

	}

}
