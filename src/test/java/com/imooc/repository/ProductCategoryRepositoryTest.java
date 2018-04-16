package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByCategoryTypeInTest(){

    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(1);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(2);
        ProductCategory saveResult = repository.save(productCategory);
        System.out.println("-----"+saveResult);

        Assert.assertNotNull(saveResult);
//        Assert.assertNotEquals(null,saveResult);   与上一个等价
    }


    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.println("----------result::"+result);
        Assert.assertNotEquals(0,result);
    }

}