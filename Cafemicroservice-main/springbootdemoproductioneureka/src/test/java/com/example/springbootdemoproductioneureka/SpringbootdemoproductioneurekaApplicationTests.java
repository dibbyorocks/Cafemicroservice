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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootdemoproductioneurekaApplicationTests {

	@Autowired
	private Cafe_service cafe_service;
	@MockBean
	private Cafe_Repository cafeRepository;

	/*public void addBank(){
		Bank bank=new Bank(999,"HSBC","Add",800090);
		when(repository.save(bank)).thenReturn(bank);
		assertEquals(bank,service.createBank(bank));
	}*/
	@Test
			public void addCafe()
	{
		Cafe cafe=new Cafe(1,"Shyam","bananashake",2000);
		when(cafeRepository.save(cafe)).thenReturn(cafe);
		assertEquals(cafe,cafe_service.addcafe(cafe));
	}
	@Test
			public void getAll()
	{
		when(cafeRepository.findAll()).thenReturn((List<Cafe>) Stream.of(new Cafe(4,"aman","grapeshake",600)).collect(Collectors.toList()));
assertEquals(2, cafe_service.getAll().size() );
	}

}
