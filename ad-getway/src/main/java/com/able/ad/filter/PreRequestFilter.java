package com.able.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PreRequestFilter extends ZuulFilter{
    //过滤器类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    //定义执行顺序 越小越先被执行
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否需要执行过滤器
    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
    }

    //具体的执行操作
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        requestContext.set("startTime",System.currentTimeMillis());
        return null;
    }
}
