package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.RealtyCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.util.List;

@RestController
        @Table(name = "realty_categories")
public class RealtyCategoryController {
/*
    @Autowired
    private RealtyCategoryService realtyCategoryService;

    @RequestMapping( value ="/realtyCategory", method = RequestMethod.POST)
    public  RealtyCategory saveRealtyCategory(RealtyCategory realtyCategory) {
        return realtyCategoryService.saveRealtyCategory(realtyCategory);
    }

        @RequestMapping(name = "/realtyCategories", method =RequestMethod.GET )
      public List<RealtyCategory>  listRealtyCategory(){
        return   realtyCategoryService.listRealtyCategory();
      }

*/

}
