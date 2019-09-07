package com.able.ad.service;

import com.able.ad.dao.CreativeRepository;
import com.able.ad.entry.Creative;
import com.able.ad.vo.CreativeRequest;
import com.able.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Qinyi.
 */
@Service
public class CreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeService(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    /**
     * 保存创意
     * @param request
     * @return
     */
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
