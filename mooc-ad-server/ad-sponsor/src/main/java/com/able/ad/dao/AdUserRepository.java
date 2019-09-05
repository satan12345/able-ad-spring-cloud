package com.able.ad.dao;

import com.able.ad.entry.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser,Long>{
    /**
     * 根据用户名查询用户记录
     * @param userName
     * @return
     */
    AdUser findByUsername(String userName);

}
