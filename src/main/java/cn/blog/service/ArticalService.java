package cn.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blog.mapper.ArticalMapper;
import cn.blog.pojo.Artical;

@Service
public class ArticalService {

    @Autowired
    private ArticalMapper articalMapper;
    
    public List<Artical> queryAllArtical(){
        List<Artical> queryArtica = articalMapper.queryArtica();
        return queryArtica;
    }

    public Artical queryOneArticalById(Integer id) {
        return articalMapper.queryArticalById(id);
    }
}
