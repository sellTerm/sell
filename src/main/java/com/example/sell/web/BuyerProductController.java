package com.example.sell.web;

import com.example.sell.VO.ProductInfoVO;
import com.example.sell.VO.ProductVO;
import com.example.sell.VO.ResultVO;
import com.example.sell.domain.ProductCategory;
import com.example.sell.domain.ProductInfo;
import com.example.sell.service.CategoryService;
import com.example.sell.service.ProductInfoService;
import com.example.sell.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: ProductInfoController
 * Description:商品管理controller层
 * date: 2020/4/5 13:13
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/buyer/product")
@Slf4j
public class BuyerProductController {

     @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private CategoryService categoryService;

        @GetMapping("/list")
        public ResultVO findAllProductList(){
            log.info("findAllProductList....");

            //1.查询所有上架商品；
            List<ProductInfo> productInfoList = productInfoService.findAll();
            //2.根据类目查询商品
            List<Integer> categoryTypeLsit = productInfoList.stream().map(i -> i.getCategoryType()).collect(Collectors.toList());
            List<ProductCategory> productCategoryList = categoryService.findByCategoryType(categoryTypeLsit);
            //3.封装数据
            List<ProductVO> productVOList = new ArrayList<>();
            for (ProductCategory productCategory: productCategoryList) {
                ProductVO productVO = new ProductVO();
                productVO.setCategoryName(productCategory.getCategoryName());
                productVO.setCategoryType(productCategory.getCategoryType());


                List<ProductInfoVO> productInfoVOList = new ArrayList<>();
                for (ProductInfo productInfo :productInfoList ) {
                    if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                        ProductInfoVO productInfoVO = new ProductInfoVO();
//                        productInfoVO.setProductId(productInfo.getProductId());
//                        productInfoVO.setProductName(productInfo.getProductName());
//                        productInfoVO.setProductPrice(productInfo.getProductPrice());
//                        productInfoVO.setProductDescription(productInfo.getProductDescription());
//                        productInfoVO.setProductIcon(productInfo.getProductIcon());
                        BeanUtils.copyProperties(productInfo,productInfoVO);
                        productInfoVOList.add(productInfoVO);
                    }
                }
                productVO.setProductInfoVOList(productInfoVOList);
                productVOList.add(productVO);
            }
            return   ResultUtils.success(productVOList);
        }



        @RequestMapping("/findByProductId/{productId}")
        public Object findSeller(@PathVariable(value = "productId") String productId){
            log.info("findByProductId....");
            productInfoService.findById(productId);

            ResultVO response = new ResultVO();
            response.setStatus(200);
            response.setMsg("ok");
            response.setData("xxx");
            return response;
         }

}
