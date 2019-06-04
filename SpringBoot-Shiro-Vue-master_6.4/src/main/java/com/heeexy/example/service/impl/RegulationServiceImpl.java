package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ArticleDao;
import com.heeexy.example.dao.regulationMapper;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.RegulationService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hxy
 * @date: 2017/10/24 16:07
 */
@Service
public class RegulationServiceImpl implements RegulationService {

	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private regulationMapper regulationDao;

	/**
	 * 新增文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addArticle(JSONObject jsonObject) {
		articleDao.addArticle(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 文章列表
	 */
	@Override
	public JSONObject listRegulation(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = regulationDao.countRegulation(jsonObject);
		List<JSONObject> list = regulationDao.listRegulation(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	@Override
	public JSONObject searchRegulation(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		System.out.println("jsonObject"+jsonObject);
		int count = regulationDao.countRegulation(jsonObject);
		List<JSONObject> list = regulationDao.searchRegulation(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新文章
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateArticle(JSONObject jsonObject) {
		articleDao.updateArticle(jsonObject);
		return CommonUtil.successJson();
	}
}
