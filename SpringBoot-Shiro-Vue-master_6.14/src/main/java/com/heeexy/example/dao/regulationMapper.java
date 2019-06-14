package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.entity.regulationWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface regulationMapper {
    int insert(regulationWithBLOBs record);

    int insertSelective(regulationWithBLOBs record);

    /**
     * 新增文章
     */
    int addArticle(JSONObject jsonObject);

    /**
     * 统计文章总数
     */
    int countArticle(JSONObject jsonObject);

    int countRegulation(JSONObject jsonObject);

    /**
     * 文章列表
     */
    List<JSONObject> listArticle(JSONObject jsonObject);

    List<JSONObject> listRegulation(JSONObject jsonObject);

    List<JSONObject> searchRegulation(JSONObject jsonObject);

    /**
     * 更新文章
     */
    int updateArticle(JSONObject jsonObject);
}