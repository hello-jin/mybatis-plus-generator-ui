package com.github.davidfantasy.mybatisplus.generatorui.configurer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order
@Component
public class OpenBrowser implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("应用已经准备就绪 ... 启动浏览器并自动加载指定的页面 ... ");
        try {
            // 指定自己项目的路径
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8068");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
