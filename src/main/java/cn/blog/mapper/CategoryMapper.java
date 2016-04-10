package cn.blog.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.blog.pojo.Category;

@Repository
public interface CategoryMapper {

    public List<Category> queryCategory();
}
