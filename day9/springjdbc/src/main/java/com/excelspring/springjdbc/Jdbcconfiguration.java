package com.excelspring.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"com.excelspring.springjdbc"})
public class Jdbcconfiguration {

	@Bean("ds")
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?createDatabaseIfNotExist=true");
		ds.setUsername("root");
		ds.setPassword("Sa123");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
	}
}
