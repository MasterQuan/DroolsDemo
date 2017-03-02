package com.qqmaster.drools;

import org.kie.api.runtime.KieSession;

import com.qqmaster.drools.util.DroolsUtils;
import com.qqmaster.model.Person;

public class PersonRule {
	public static void main(String[] args) {
		KieSession ks = DroolsUtils.getSession("person-table");

		Person p1 = new Person("奥巴马", 68);
		Person p2 = new Person("普京", 32);
		Person p3 = new Person("朴槿惠", 18);
		Person p4 = new Person("川普", 10);
		Person p5 = new Person("金正恩", 66);

		System.out.println("before p1 : " + p1);
		System.out.println("before p2 : " + p2);
		System.out.println("before p3 : " + p3);
		System.out.println("before p4 : " + p4);
		System.out.println("before p5 : " + p5);

		ks.insert(p1);
		ks.insert(p2);
		ks.insert(p3);
		ks.insert(p4);
		ks.insert(p5);

		int count = ks.fireAllRules();

		System.out.println("总执行了" + count + "条规则------------------------------");
		System.out.println("after p1 : " + p1);
		System.out.println("after p2 : " + p2);
		System.out.println("after p3 : " + p3);
		System.out.println("after p4 : " + p4);
		System.out.println("after p4 : " + p5);

		ks.dispose();
	}

	void printName(String name, String desc){
		System.out.println("name:" + name + "desc:" + desc);
	}
}
