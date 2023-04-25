package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dbquery.DbQueryTR;

@Configuration
public class DbQueryConfigTR {

	@Autowired
	private javax.sql.DataSource dataSource;

	@Bean
	public DbQueryTR dbQuerytr() {
		return new DbQueryTR(this.dataSource);
	}
}
