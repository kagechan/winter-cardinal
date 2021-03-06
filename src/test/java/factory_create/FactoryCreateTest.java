/*
 * Copyright (C) 2019 Toshiba Corporation
 * SPDX-License-Identifier: Apache-2.0
 */

package factory_create;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.PuppeteerTest;

public class FactoryCreateTest {
	@Test
	public void index(){
		test("index.html");
	}

	public void test( final String path ){
		PuppeteerTest.test( "http://localhost:8080/factory-create/"+path );
	}

	@BeforeClass
	public static void before() {
		PuppeteerTest.start(FactoryCreateApplication.class);
	}

	@AfterClass
	public static void after() {
		PuppeteerTest.end();
	}

}
