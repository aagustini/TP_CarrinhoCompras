package com.bcopstein;

import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TestMockito {

	private interface LstString extends List<String>{

	}

	@Test
	public void test() {
		List<String> mockList = (mock(LstString.class));
		mockList.add("First");
		when(mockList.get(0)).thenReturn("Mockito");
		when(mockList.get(1)).thenReturn("JCG");
		assertEquals("Mockito", mockList.get(0));
		assertEquals("JCG", mockList.get(1));
	}

}
