/* //device/tests/ComplexLayout/src/com/android/complexlayout/ComplexLayout.java
**
** Copyright 2007, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/

package com.android.launchperf;

import java.util.Map;

import android.app.Activity;
import android.os.Bundle;

public class ComplexActivity extends Activity {
   
    /** Called with the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        
        // Inflate our UI from its XML layout description.
        setContentView(R.layout.complex_layout);
    }
}
