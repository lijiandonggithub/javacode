package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2019/1/2 18:42
 * @description 主库数据源配置
 * @modify
 */
@Configuration
@MapperScan(basePackages = "com.example.demo.dao.goods", sqlSessionFactoryRef = "baseSqlSessionFactory")
public class MybatisgoodsConfig {
    @Autowired
    @Qualifier("goodsDataSource")
    private DataSource baseDataSource;

    @Bean
    public SqlSessionFactory baseSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(baseDataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate baseSqlSessionTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(baseSqlSessionFactory());
        return template;
    }
}
