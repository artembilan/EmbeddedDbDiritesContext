package org.springframework.boot.sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class EmbeddedDbDirtiesContextTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void testDataBase1() {
		assertThat(jdbcTemplate.queryForList("SELECT * FROM foo")).isNotEmpty();
	}

	@Test
	public void testDataBase2() {
		assertThat(jdbcTemplate.queryForList("SELECT * FROM foo")).isNotEmpty();
	}

}
