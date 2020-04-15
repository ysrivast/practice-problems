package com.jcg.java;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySingeltonTest {
	
	MySingelton ms= null;
	@BeforeEach
	public void create() {
		ms= MySingelton.getInstance();
	}

	private void serilize(MySingelton ms) {
		
	}

	private void reflection() {
		try {
            Constructor<MySingelton> constructor = MySingelton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ms = (MySingelton) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }
		
	}

	@Test
	void test() {
		MySingelton ms1 = MySingelton.getInstance();
		assertThat(ms1).isEqualTo(ms);
	}

	@Test
	void test1() {
		MySingelton ms1 = MySingelton.getInstance();
		assertThat(ms1.hashCode()).isEqualTo(ms.hashCode());
	}
	@Test
	void test2() {
		MySingelton ms1 = ((Object)ms).clone();
		Object o = new Object();
		o.clo
		assertThat(ms1.hashCode()).isEqualTo(ms.hashCode());
	}
}
