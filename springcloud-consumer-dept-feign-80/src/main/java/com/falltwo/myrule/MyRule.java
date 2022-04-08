package com.falltwo.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule lzhMyRule() {
        //默认是轮循，现在我们自定义
        return new MyRandomRule();
    }
}
