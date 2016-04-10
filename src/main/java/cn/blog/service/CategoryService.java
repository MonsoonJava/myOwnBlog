package cn.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blog.mapper.CategoryMapper;
import cn.blog.pojo.Category;



@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    
    public List<Category> queryAllCategory(){
        return  categoryMapper.queryCategory();
    }
    
}
