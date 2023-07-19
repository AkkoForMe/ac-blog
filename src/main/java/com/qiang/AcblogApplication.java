package com.qiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// 出现警告：WARNSkipping MapperFactoryBean with name 'blogDao' and 'com.qiang.modules.sys.dao.BlogDao' mapperInterface. Bean already defined with the same name!
// 根据  https://blog.csdn.net/key_xyes/article/details/89382937 注释掉 @MapperScan(basePackages = "com.qiang.modules.sys.dao")

@SpringBootApplication
//@MapperScan(basePackages = "com.qiang.modules.sys.dao")
@EnableCaching
@EnableAsync // 开启异步任务
@EnableScheduling // 开启定时任务
//@EnableElasticsearchRepositories //
public class AcblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcblogApplication.class, args);
    }

}
