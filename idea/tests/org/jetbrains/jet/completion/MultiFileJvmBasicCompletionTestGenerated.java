/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.completion;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.completion.AbstractMultiFileJvmBasicCompletionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/basic/multifile")
public class MultiFileJvmBasicCompletionTestGenerated extends AbstractMultiFileJvmBasicCompletionTest {
    public void testAllFilesPresentInMultifile() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/completion/basic/multifile"), Pattern.compile("^([^\\.]+)$"), false);
    }
    
    @TestMetadata("CompleteImportedFunction")
    public void testCompleteImportedFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/CompleteImportedFunction");
    }
    
    @TestMetadata("CompletionOnImportedFunction")
    public void testCompletionOnImportedFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/CompletionOnImportedFunction");
    }
    
    @TestMetadata("DoNotCompleteWithConstraints")
    public void testDoNotCompleteWithConstraints() throws Exception {
        doTest("idea/testData/completion/basic/multifile/DoNotCompleteWithConstraints");
    }
    
    @TestMetadata("EnumEntry")
    public void testEnumEntry() throws Exception {
        doTest("idea/testData/completion/basic/multifile/EnumEntry");
    }
    
    @TestMetadata("ExtensionFunction")
    public void testExtensionFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/ExtensionFunction");
    }
    
    @TestMetadata("ExtensionFunctionOnImportedFunction")
    public void testExtensionFunctionOnImportedFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/ExtensionFunctionOnImportedFunction");
    }
    
    @TestMetadata("ExtensionOnNullable")
    public void testExtensionOnNullable() throws Exception {
        doTest("idea/testData/completion/basic/multifile/ExtensionOnNullable");
    }
    
    @TestMetadata("InImportedFunctionLiteralParameter")
    public void testInImportedFunctionLiteralParameter() throws Exception {
        doTest("idea/testData/completion/basic/multifile/InImportedFunctionLiteralParameter");
    }
    
    @TestMetadata("JavaInnerClasses")
    public void testJavaInnerClasses() throws Exception {
        doTest("idea/testData/completion/basic/multifile/JavaInnerClasses");
    }
    
    @TestMetadata("NotImportedExtensionFunction")
    public void testNotImportedExtensionFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/NotImportedExtensionFunction");
    }
    
    @TestMetadata("NotImportedJavaClass")
    public void testNotImportedJavaClass() throws Exception {
        doTest("idea/testData/completion/basic/multifile/NotImportedJavaClass");
    }
    
    @TestMetadata("NotImportedObject")
    public void testNotImportedObject() throws Exception {
        doTest("idea/testData/completion/basic/multifile/NotImportedObject");
    }
    
    @TestMetadata("TopLevelFunction")
    public void testTopLevelFunction() throws Exception {
        doTest("idea/testData/completion/basic/multifile/TopLevelFunction");
    }
    
}
