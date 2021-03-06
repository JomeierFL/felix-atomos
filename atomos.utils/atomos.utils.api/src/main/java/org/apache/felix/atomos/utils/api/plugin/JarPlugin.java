/*
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
package org.apache.felix.atomos.utils.api.plugin;

import java.net.URLClassLoader;
import java.util.jar.JarFile;

import org.apache.felix.atomos.utils.api.Context;

public interface JarPlugin<T> extends SubstratePlugin<T>
{

    default void initJar(JarFile jar, Context context, URLClassLoader classLoader)
    {
    }

    void doJar(JarFile jar, Context context, URLClassLoader classLoader);

    default void postJars(Context context)
    {
    }

    default void preJars(Context context)
    {
    }
}
