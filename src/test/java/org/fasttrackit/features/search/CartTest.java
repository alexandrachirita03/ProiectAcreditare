package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin("alexandra_rusitoru@yahoo.com", "Qwerty1$2$3$");
        searchSteps.doSearch("beanie");
        productsSteps.selectProductFromList("Beanie with Logo");
       // cartSteps.clickAddToCart();
    }

}
