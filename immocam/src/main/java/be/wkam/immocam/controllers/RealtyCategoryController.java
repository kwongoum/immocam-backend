package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.RealtyCategory;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.util.Collection;
import java.util.List;

@RestController
        @Table(name = "realty_categories")
public class RealtyCategoryController {

    @Autowired
    private IGenericService<RealtyCategory,Long> realtyCategoryService;

    @RequestMapping( value ="/realtyCategory", method = RequestMethod.POST)
    public  RealtyCategory saveRealtyCategory(RealtyCategory realtyCategory) {
        return realtyCategoryService.save(realtyCategory);
    }

        @RequestMapping(value= "/realtyCategories", method =RequestMethod.GET )
      public Collection <RealtyCategory> listRealtyCategory(){
        return   realtyCategoryService.list();
      }
      

}
