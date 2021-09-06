package com.govin.mp.article.controller;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.*;

@RestController
@RequestMapping("article")
@Api(tags = "文章相关接口")
public class ArticleController {

    @Autowired
    private Jedis jedis;
    @ApiOperation(value = "获取key")
    @RequestMapping(value = "/getAllKeys",method = RequestMethod.GET)
    public String getAllKeys(){
        //Jedis jedis = new Jedis("http://127.0.0.1", 6379);
        Set <String> keys = jedis.keys("*");

        return JSON.toJSONString(keys);
    }
    @ApiOperation(value = "发表文章")
    @RequestMapping(value = "/postArticle",method = RequestMethod.POST)
    public void  postArticle(){
        for (int i = 0; i < 1000; i++) {
            String id = UUID.randomUUID().toString();
            HashMap <String, String> map = new HashMap <>(16);
            map.put("userId",id);
            map.put("userName","james"+i);
            map.put("sex",i%2==0 ?"0":"1");
            map.put("age", new Random(10).nextInt()+"");
            map.put("content", UUID.randomUUID()+"");
            jedis.hmset(id,map);
        }
        //"829ce342-3115-4973-8b0e-fc5fc8f9cadb"

    }

    /**
     * 根据id
     */
    @ApiOperation(value = "查询文章")
    @RequestMapping(value = "/getArticleById",method = RequestMethod.GET)
    public String  getArticle(String id){
        Map <String, String> map = jedis.hgetAll(id);
       /* ObjectMapper objectMapper = new ObjectMapper();
        String articleJson = objectMapper.writeValueAsString(map);
        Article article = objectMapper.readValue(articleJson, Article.class);*/
        //"829ce342-3115-4973-8b0e-fc5fc8f9cadb"
        return map.toString();
    }
    /**
     * 分页+排序
     */
    @ApiOperation(value = "查询文章")
    @RequestMapping(value = "/getArticles",method = RequestMethod.GET)
    public void  getArticle(){
      //  jedis.
        //"829ce342-3115-4973-8b0e-fc5fc8f9cadb"

    }

}
