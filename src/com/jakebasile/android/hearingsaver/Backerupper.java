/* 
 * Copyright 2010-2011 Jake Basile
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jakebasile.android.hearingsaver;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public final class Backerupper extends BackupAgentHelper
{
	private static final String PREFS_KEY = "defaultPrefs";

	private static final String PREFS = "com.jakebasile.android.hearingsaver_preferences";

	@Override
	public void onCreate()
	{
		super.onCreate();
		SharedPreferencesBackupHelper prefsBackup = new SharedPreferencesBackupHelper(
			this, PREFS);
		addHelper(PREFS_KEY, prefsBackup);
	}
}