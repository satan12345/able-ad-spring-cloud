package com.able.ad.index.interest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitItObject {
    //推广单元id
    private Long unitId;
    //兴趣标签
    private String itTag;
}
