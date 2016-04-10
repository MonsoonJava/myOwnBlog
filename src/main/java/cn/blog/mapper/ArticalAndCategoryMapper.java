package cn.blog.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.blog.pojo.ArticalAndCategory;

@Repository
public interface ArticalAndCategoryMapper {
    
    public List<ArticalAndCategory> queryAllArticalAndCategory();
    
}
