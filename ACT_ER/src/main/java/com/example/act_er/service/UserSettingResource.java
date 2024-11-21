package com.example.act_er.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.UserSettingForm;

/**
 * ユーザー設定画面のサービスクラス
 * @author yu-kudo
 *
 */
@Transactional
@Service
public interface UserSettingResource {

	List<ActEmployeeList> userSerch(UserSettingForm userSettingForm, String yearSearchValue);
	public void execute();

}
