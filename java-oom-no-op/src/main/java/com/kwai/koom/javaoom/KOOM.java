package com.kwai.koom.javaoom;

import android.app.Application;

/**
 * Copyright 2020 Kwai, Inc. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * KOOM library entry point.
 *
 * @author Rui Li <lirui05@kuaishou.com>
 */
public class KOOM {

  private static KOOM koom;


  private KOOM() {}

  /**
   * KOOM entry point, make sure be called in the main thread!
   *
   * @param application application needed
   */
  public static void init(Application application) {
      koom = new KOOM();
  }

  public static KOOM getInstance() {
    return koom;
  }

  public void manualTrigger() {
    // empty
  }

  public void setProgressListener(KOOMProgressListener progressListener) {
    // empty
  }

  public static void trigger() {
    // empty
  }


}
