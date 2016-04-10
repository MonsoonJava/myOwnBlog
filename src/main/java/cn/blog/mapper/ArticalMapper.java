package cn.blog.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.blog.pojo.Artical;

@Repository
public interface ArticalMapper {

    public List<Artical> queryArtica();
    
    public Artical queryArticalById(Integer id);
}
