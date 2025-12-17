// Copyright Common Workflow Language project contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.commonwl.cwlsdk.cwl1_2;

import org.commonwl.cwlsdk.cwl1_2.utils.LoadingOptions;
import org.commonwl.cwlsdk.cwl1_2.utils.Saveable;

/**
* Auto-generated interface for <I>http://commonwl.org/cwltool#ShmSize</I><BR>This interface is implemented by {@link ShmSizeImpl}<BR>
 */
public interface ShmSize extends ProcessRequirement, Saveable {

  java.util.Map<String, Object> getExtensionFields();
  LoadingOptions getLoadingOptions();

  /**
   * Getter for property <I>http://commonwl.org/cwltool#ShmSize/class</I><BR>
   * <BLOCKQUOTE>
   * cwltool:ShmSize   * </BLOCKQUOTE>
   */

  String getClass_();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#ShmSize/shmSize</I><BR>
   * <BLOCKQUOTE>
   * Size of /dev/shm. The format is `&lt;number&gt;&lt;unit&gt;`. &lt;number&gt; must be greater
   * than 0. Unit is optional and can be `b` (bytes), `k` (kilobytes), `m`
   * (megabytes), or `g` (gigabytes). If you omit the unit, the default is
   * bytes. If you omit the size entirely, the value is `64m`.&quot;
   *    * </BLOCKQUOTE>
   */

  String getShmSize();
}
