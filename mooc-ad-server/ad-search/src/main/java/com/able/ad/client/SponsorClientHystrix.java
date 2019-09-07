package com.able.ad.client;

import com.able.ad.client.vo.AdPlan;

import com.able.ad.client.vo.AdPlanGetRequest;
import com.able.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Qinyi.
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
