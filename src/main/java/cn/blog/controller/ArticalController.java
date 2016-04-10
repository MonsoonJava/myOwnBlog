package cn.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.blog.pojo.Artical;
import cn.blog.pojo.ArticalAndCategory;
import cn.blog.pojo.Category;
import cn.blog.service.ArticalAndCategoryService;
import cn.blog.service.ArticalService;
import cn.blog.service.CategoryService;

@Controller
@RequestMapping(value="article")
public class ArticalController {

    @Autowired
    private ArticalService articalService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArticalAndCategoryService articalAndCategoryService;
    
    @RequestMapping(value="article")
    public ModelAndView queryAllArtical(){
        ModelAndView mv = new ModelAndView("index");
        
        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("xufujie");
        category.setLevel(5);
        category.setUserId(5);
        
        ArticalAndCategory aac = new ArticalAndCategory();
        aac.setArticelContent("HELLOWORLD");
        aac.setArticelTitle("NULL");
        aac.setArticleId(1);
        aac.setCategoryId(5);
        aac.setCategoryName("fuck");
        aac.setLevel(50);
        aac.setPublishTime(null);
        aac.setUserId("20");
        
        List<Category> categorys=new ArrayList<Category>();
        List<ArticalAndCategory> aacList= new ArrayList<ArticalAndCategory>();
        categorys.add(category);
        categorys.addAll(categoryService.queryAllCategory());
        aacList.add(aac);
        aacList.addAll(articalAndCategoryService.queryAllArticalAndCategory());
        mv.addObject("aac", aacList);
        mv.addObject("categorys", categorys);
        return mv;
    }
    
    @RequestMapping(value="{id}/detail",method=RequestMethod.GET)
    public ModelAndView getOneArtical(@PathVariable(value="id")Integer id){
        ModelAndView mv = new ModelAndView("single");
        Artical artical = articalService.queryOneArticalById(id);
        mv.addObject("artical", artical);
        List<Category> categorys = categoryService.queryAllCategory();
        mv.addObject("categorys",categorys);
        List<ArticalAndCategory> aac = articalAndCategoryService.queryAllArticalAndCategory();
        mv.addObject("aac",aac);
        return mv;
    }
    
}
