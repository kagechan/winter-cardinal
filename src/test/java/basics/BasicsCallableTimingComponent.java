/*
 * Copyright (C) 2019 Toshiba Corporation
 * SPDX-License-Identifier: Apache-2.0
 */

package basics;

import org.wcardinal.controller.annotation.Callable;

public class BasicsCallableTimingComponent {
	@Callable
	String hello(){
		return "hello";
	}
}
