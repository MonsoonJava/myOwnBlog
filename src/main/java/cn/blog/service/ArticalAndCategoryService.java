package cn.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blog.mapper.ArticalAndCategoryMapper;
import cn.blog.pojo.ArticalAndCategory;

@Service
public class ArticalAndCategoryService {

    @Autowired
    private ArticalAndCategoryMapper articalAndCategoryMapper;
    
    public List<ArticalAndCategory> queryAllArticalAndCategory(){
        return articalAndCategoryMapper.queryAllArticalAndCategory();
    }
}
