package com.nvlad.yii2support.common;

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import org.junit.Test;

import java.io.File;

public class MethodUtilsTest extends LightCodeInsightFixtureTestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        myFixture.configureFromExistingVirtualFile(myFixture.copyFileToProject("methods.php"));
    }

    @Override
    protected String getTestDataPath() {
        return "";
    }


    @Test
    public void getParameter() {

    }

    @Test
    public void isYiiCreateObjectMethod() {

    }
}