package com.able.ad.dao;

import com.able.ad.entry.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    AdPlan findByIdAndUserId(Long id, String userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long id, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
