package com.able.ad.service;

import com.able.ad.constant.Constants;
import com.able.ad.dao.AdUserRepository;
import com.able.ad.entry.AdUser;
import com.able.ad.exception.AdException;
import com.able.ad.mapper.AdUserMapper;
import com.able.ad.utils.CommonUtils;
import com.able.ad.vo.CreateUserRequest;
import com.able.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Slf4j
public class UserService {

    @Autowired
    AdUserRepository adUserRepository;
    @Autowired
    AdUserMapper adUserMapper;

    @Transactional
    public CreateUserResponse createUser(CreateUserRequest createUserRequest)
            throws AdException{
        if (createUserRequest.validate()) {
                throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser = adUserRepository.findByUsername(createUserRequest.getUserName());
        if (oldUser!=null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser adUser=new AdUser(createUserRequest.getUserName(),
                CommonUtils.md5(createUserRequest.getUserName()));

        AdUser newUser = adUserRepository.save(adUser);

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
