package com.jyh.api.plat.service;

import java.util.List;
import java.util.Map;

import com.jyh.entity.plat.service.AppEntity;
import com.jyh.entity.plat.service.AppTypeEntity;

/**
 * @author jiangyonghua
 * @date 2018年3月5日 下午3:19:45
 */
public interface AppService {

	/**
	 * 加载应用缓存
	 * 
	 * @return 数据结构map<appid,app>
	 */
	public Map<String, AppEntity> loadApp();

	/**
	 * 加载应用树<br>
	 * 两级树，一级大类，二级应用
	 * 
	 * @return
	 */
	List<AppTypeEntity> loadTree();
}
