package com.mesutemre.susa.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringUsingStandAloneDataSourceConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource  ds = new DriverManagerDataSource();
		String url = "jdbc:mysql://localhost:3306/kutuphanesistemi?useUnicode=yes&characterEncoding=UTF-8";
		String username = "root";
		String password = "root";
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		
		return ds;
	}
}
