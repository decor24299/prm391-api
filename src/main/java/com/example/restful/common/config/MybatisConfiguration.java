package com.example.restful.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MybatisConfiguration {

	@Autowired
	@Bean
	public DataSourceTransactionManager transactionManager(
			@Qualifier("dataSource") final DataSource dataSource) {

		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);

		return transactionManager;
	}

	@Autowired
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(final DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);

		ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(
				new DefaultResourceLoader());

		// MyBatis のコンフィグレーションファイル
		bean.setConfigLocation(resolver.getResource(ResourcePatternResolver.CLASSPATH_URL_PREFIX + "config" +
															"/mybatis/mybatis.xml"));
		// MyBatis で使用する SQL ファイル群
		bean.setMapperLocations(resolver.getResources(
				ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "com/example/**/lib/mapper/*.xml"));
		return new SqlSessionTemplate(bean.getObject());
	}
}
