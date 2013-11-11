/*
 * Copyright 2013 Storm Zhang.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.storm.ui;

import android.app.Activity;
import android.os.Bundle;

import com.storm.customloading.R;

public class MainActivity extends Activity {

	private ProgressWheel pwOne, pwTwo;
	int progress = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		pwOne = (ProgressWheel) findViewById(R.id.progressBarOne);
		pwTwo = (ProgressWheel) findViewById(R.id.progressBarTwo);

		pwOne.spin();
		Thread s = new Thread(r);
		s.start();
	}

	final Runnable r = new Runnable() {
		public void run() {
			while (progress < 361) {
				pwTwo.incrementProgress();
				progress++;
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}
