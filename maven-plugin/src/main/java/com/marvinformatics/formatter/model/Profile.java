/**
 * Copyright (C) 2010 Marvin Herman Froeder (marvin@marvinformatics.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marvinformatics.formatter.model;

import java.util.HashMap;
import java.util.Map;

/**
 * A class representing the profile XML element in the Eclipse formatter config
 * file, including the kind attribute and Map of setting id and value.
 * 
 * @author Matt Blanchette
 */
public class Profile {

	/** The kind. */
	private String kind;

	/** The settings. */
	private Map<String, String> settings = new HashMap<String, String>();

	/**
	 * Adds the setting.
	 *
	 * @param setting the setting
	 */
	public void addSetting(Setting setting) {
		this.settings.put(setting.getId(), setting.getValue());
	}

	/**
	 * Gets the settings.
	 *
	 * @return the settings
	 */
	public Map<String, String> getSettings() {
		return this.settings;
	}

	/**
	 * Gets the kind.
	 *
	 * @return the kind
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Sets the kind.
	 *
	 * @param kind the new kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
}
