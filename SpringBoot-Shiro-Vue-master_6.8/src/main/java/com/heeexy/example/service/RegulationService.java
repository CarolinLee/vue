package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface RegulationService {
	/**
	 * 新增文章
	 */
	JSONObject addArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listRegulation(JSONObject jsonObject);

	JSONObject searchRegulation(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateArticle(JSONObject jsonObject);

}
