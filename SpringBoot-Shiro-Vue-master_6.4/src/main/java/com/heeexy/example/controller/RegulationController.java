package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.RegulationService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author: hxy
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/regulation")
public class RegulationController {

	@Autowired
	private ArticleService articleService;
	@Autowired
	private RegulationService regulationService;

	/**
	 * 查询文章列表
	 */
	@RequiresPermissions("article:list")
	@GetMapping("/list")
	public JSONObject listArticle(HttpServletRequest request) {
		JSONObject jb = request2JsonFun(request);
		System.out.println(jb);
		return regulationService.listRegulation(jb);
	}
	@RequestMapping("/search")
	public JSONObject search(HttpServletRequest request){
		String policyName = request.getParameter("policyName");
		System.out.println(policyName);
		JSONObject jb = request2JsonFun(request);
		System.out.println(jb);
		//System.out.println(searchForm); null String searchForm = request.getParameter("searchForm");
		//System.out.print(request);
		return regulationService.searchRegulation(jb);
	}

	/**
	 * 新增文章
	 */
	@RequiresPermissions("article:add")
	@PostMapping("/addArticle")
	public JSONObject addArticle(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "content");
		return articleService.addArticle(requestJson);
	}

	/**
	 * 修改文章
	 */
	@RequiresPermissions("article:update")
	@PostMapping("/updateArticle")
	public JSONObject updateArticle(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return articleService.updateArticle(requestJson);
	}

	//request2json function start-mwz
	public JSONObject request2JsonFun(HttpServletRequest request) {
		JSONObject requestJson = new JSONObject();
		Enumeration paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();
			String[] pv = request.getParameterValues(paramName);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < pv.length; i++) {
				if (pv[i].length() > 0) {
					if (i > 0) {
						sb.append(",");
					}
					sb.append(pv[i]);
				}
			}
			requestJson.put(paramName, sb.toString());
		}
		return requestJson;
	}
	//request2json function end-mwz
}
