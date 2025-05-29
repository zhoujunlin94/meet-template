package io.github.zhoujunlin94.meet;

import io.github.zhoujunlin94.meet.tk_mybatis.MeetTkMybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhoujunlin
 * @date 2025-05-29-17:41
 */
@SpringBootApplication(exclude = {
        // 不需要mybatis时排除
        MeetTkMybatisAutoConfiguration.class
})
@EnableAspectJAutoProxy(exposeProxy = true)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
