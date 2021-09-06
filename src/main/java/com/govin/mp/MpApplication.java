package com.govin.mp;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.solr.client.solrj.SolrClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.SolrTemplate;
import redis.clients.jedis.Jedis;

import javax.annotation.PostConstruct;


@SpringBootApplication
@MapperScan("com.govin.mp.*.mapper")
public class MpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpApplication.class, args);

	}
    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {

        return new PaginationInterceptor();
    }
    @Bean
    @ConditionalOnMissingBean(SolrTemplate.class)
    public SolrTemplate solrTemplate(SolrClient solrClient) {
        return new SolrTemplate(solrClient);
    }
   /* @Bean
    public ObjectMapper getObejectMapper(){
        return new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }*/
   @Autowired
   private ObjectMapper objectMapper;
    @PostConstruct
    public void setUp() {
        objectMapper.registerModule(new JavaTimeModule());
    }
    @Bean
    public Jedis getJedis(){
        return new Jedis("127.0.0.1",6379);
    }
}
