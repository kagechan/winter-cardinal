/*
 * Copyright (C) 2019 Toshiba Corporation
 * SPDX-License-Identifier: Apache-2.0
 */

package basics;

import org.springframework.beans.factory.annotation.Autowired;

import org.wcardinal.controller.annotation.Component;
import org.wcardinal.controller.data.SString;
import org.wcardinal.controller.data.annotation.NonNull;

@Component
public class BasicsInitializedComponent {
	@Autowired
	@NonNull
	SString uninitialized;
}
