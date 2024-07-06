package com.chait.eureka.service.registry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EurekaServiceRegistryApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		assertThat(context).isNotNull();
	}

}
