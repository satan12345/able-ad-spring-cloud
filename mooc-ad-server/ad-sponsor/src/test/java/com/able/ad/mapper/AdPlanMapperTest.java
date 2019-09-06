package com.able.ad.mapper;

import com.able.ad.entry.AdPlan;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AdPlanMapperTest {
    @Resource
    AdPlanMapper adPlanMapper;

    @Test
    public void test1(){
        List<AdPlan> planList = adPlanMapper.selectAll();
        log.info("查询到的结果为:{}",planList);

    }

}