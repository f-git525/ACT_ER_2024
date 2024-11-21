package com.example.act_er.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.act_er.entity.ActEmployeeList;
import com.example.act_er.form.UserSettingForm;

/**
 * 利用者設定画面で使用するDB接続のmapperクラス
 * @author yu-kudo
 *
 */
@Mapper
public interface UserSettingRepository {

//    @Select("SELECT * FROM act_er.act_employee_list")
//    List<ActEmployeeList> selectAll() ;

	/**
	 * 利用者設定画面で設定された条件に一致するレコードをActEmployeeListテーブルから取得
	 * @param userSettingForm
	 * @return
	 */
    List<ActEmployeeList> userSelect(UserSettingForm userSettingForm, String yearSearchValue);

    /**
     * ActEmployeeListテーブルから前件取得する
     * @return
     */
    List<ActEmployeeList> selectAll();
}
