package com.able.ad.controller;

import com.able.ad.client.SponsorClient;
import com.able.ad.client.vo.AdPlan;
import com.able.ad.client.vo.AdPlanGetRequest;
import com.able.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @param
 * @author jipeng
 * @date 2019-09-07 16:18
 */
@Slf4j
@RestController
public class SearchController {
    @Resource
    RestTemplate restTemplate;
    @Resource
    SponsorClient sponsorClient;

    @PostMapping("/getAdPlansByFeign")
    public CommonResponse<List<AdPlan>> getAdplansByFeign(AdPlanGetRequest adPlanGetRequest){
        CommonResponse<List<AdPlan>> adPlans = sponsorClient.getAdPlans(adPlanGetRequest);
        return adPlans;
    }

    @PostMapping("/getAdPlansByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlansByRebbon(AdPlanGetRequest adPlanGetRequest){
       log.info("ad-search:getAdPlansByRebbon");
       String url="http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan";
        ResponseEntity<CommonResponse> commonResponseResponseEntity =
                restTemplate.postForEntity(url, adPlanGetRequest, CommonResponse.class);
        return commonResponseResponseEntity.getBody();
    }
}

