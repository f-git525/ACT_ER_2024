package com.example.act_er.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.UserSettingForm;
import com.example.act_er.repository.UserSettingRepository;

import lombok.RequiredArgsConstructor;



/**
 * ユーザー設定画面の実処理を行う
 * @author yu-kudo
 *
 */
@RequiredArgsConstructor
@Transactional
@Service
public class UserSettingResourceImpl implements UserSettingResource {

	private final UserSettingRepository mapper = null;

    public List<ActEmployeeList> userSerch(@Param("userSettingForm") UserSettingForm userSettingForm,
    										@Param("yearSearchValue") String yearSearchValue) {

//    	userSettingForm.getUserName();


        return mapper.selectAll();
//        return mapper.userSelect(userSettingForm, "");
    }

    public void execute(){

    }
}