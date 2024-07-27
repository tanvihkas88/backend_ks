package com.virgingames.testbase;

import com.virgingames.constants.Path;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import com.virgingames.utils.PropertyReader;
/**
 * Created by Kartik Shah
 */
public class TestBase{

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.Currency;
    }

}

