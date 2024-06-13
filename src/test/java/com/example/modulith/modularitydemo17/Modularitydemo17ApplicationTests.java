package com.example.modulith.modularitydemo17;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;


@SpringBootTest
class Modularitydemo17ApplicationTests {

	@Test
	void contextLoads() {
		var modules = ApplicationModules.of(Modularitydemo17Application.class);
		modules.verify();
	}

}
