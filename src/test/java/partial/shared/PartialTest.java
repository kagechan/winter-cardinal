/*
 * Copyright (C) 2019 Toshiba Corporation
 * SPDX-License-Identifier: Apache-2.0
 */

package partial.shared;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.PuppeteerTest;

public class PartialTest {
	@Test
	public void partial(){
		test("index.html");
	}

	public void test( final String path ){
		PuppeteerTest.test( "http://localhost:8080/partial/"+path );
	}

	@BeforeClass
	public static void before() {
		PuppeteerTest.start(PartialApplication.class);
	}

	@AfterClass
	public static void after() {
		PuppeteerTest.end();
	}

}
