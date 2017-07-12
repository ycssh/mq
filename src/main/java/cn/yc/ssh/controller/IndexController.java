package cn.yc.ssh.controller;

import cn.yc.ssh.service.Consumer;
import cn.yc.ssh.service.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuchao
 * @date 2017/7/12
 * @desc：
 */

@RestController
@Slf4j
public class IndexController {

    @Resource
    private Producer producer;

    @Resource
    private Consumer consumer;

    @RequestMapping("/save")
    public @ResponseBody void save(String msg){
        producer.send(msg);
    }

    @RequestMapping("/save1")
    public @ResponseBody void save1(String msg){
        producer.send1(msg);
    }
}
