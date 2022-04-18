package com.example.springbootdemoproductioneureka;

import com.example.springbootdemoproductioneureka.model.Cafe;
import com.example.springbootdemoproductioneureka.repository.Cafe_Repository;
import com.example.springbootdemoproductioneureka.service.Cafe_service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootdemoproductioneurekaApplicationTests {

	@Autowired
	private Cafe_service cafe_service;
	//@MockBean
	//private Cafe_Repository cafeRepository;

	/*public void addBank(){
		Bank bank=new Bank(999,"HSBC","Add",800090);
		when(repository.save(bank)).thenReturn(bank);
		assertEquals(bank,service.createBank(bank));
	}*/
	@Test
			public void addCafe()
	{
		Cafe cafe=new Cafe(2,"Shyam","bananashake",2000);
		assertEquals(cafe,cafe_service.addcafe(cafe));
	}
	@Test
			public void getAll()
	{
assertEquals(1, cafe_service.getAll().size() );
	}

}
