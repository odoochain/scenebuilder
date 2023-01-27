/*
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.javafx.scenebuilder.kit.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * <a href="https://github.com/MenoData/Time4J/issues/786">...</a>
 * <a href="https://github.com/daocalendar/Time4J/commit/d6ceb400e906f7a29d2bdef36bb3bb6a241e2a8f">...</a>
 * new resource loading architecture
 */
public class I18N {

    private static ResourceBundle bundle;
    private static final ResourceBundle.Control CONTROL =
            ResourceBundle.Control.getNoFallbackControl(
                    ResourceBundle.Control.FORMAT_DEFAULT);
    private static ResourceBundle.Control utf8EncodingControl = new I18NControl();
    
    public static String getString(String key) {
        return getBundle().getString(key);
    }
    
    public static String getString(String key, Object... arguments) {
        final String pattern = getString(key);
        return MessageFormat.format(pattern, arguments);
    }
    /**
     * <a href="https://github.com/edvin/tornadofx/issues/1286">...</a>
     * @author xiaxiaozheng
     * @date 06:28 1/27/2023
     * @return java.util.ResourceBundle
     **/
    public static synchronized ResourceBundle getBundle() {
        if (bundle == null) {
            final String packageName = I18N.class.getPackage().getName();
            try {
                bundle = ResourceBundle.getBundle(packageName + ".SceneBuilderKit", utf8EncodingControl);
            } catch (MissingResourceException e) {
                // Fix for issue of Android refs: https://github.com/nulab/zxcvbn4j/issues/21
                bundle =ResourceBundle.getBundle(packageName + ".SceneBuilderKit", Locale.getDefault());
            } catch (UnsupportedOperationException e) {
                // Fix for issue of JDK 9 refs: https://github.com/nulab/zxcvbn4j/issues/45
                // ResourceBundle.Control is not supported in named modules.
                // See https://docs.oracle.com/javase/9/docs/api/java/util/ResourceBundle.html#bundleprovider for more details
                bundle = ResourceBundle.getBundle("com/oracle/javafx/scenebuilder/kit/i18n/SceneBuilderKit", Locale.ROOT);
            }
        }
        
        return bundle;
    }
}
