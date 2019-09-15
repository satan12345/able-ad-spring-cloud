package com.able.ad.index.creativeunit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitObject {
    /**
     * 广告id
     */
    private Long adId;
    /**
     * 推广单元id
     */
    private Long unitId;

    // adId-unitId
}
