/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.codegen;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.AbstractBytecodeTextTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/bytecodeText")
@InnerTestClasses({BytecodeTextTestGenerated.Statements.class})
public class BytecodeTextTestGenerated extends AbstractBytecodeTextTest {
    public void testAllFilesPresentInBytecodeText() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/bytecodeText"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("annotationRetentionPolicyClass.kt")
    public void testAnnotationRetentionPolicyClass() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/annotationRetentionPolicyClass.kt");
    }
    
    @TestMetadata("annotationRetentionPolicyRuntime.kt")
    public void testAnnotationRetentionPolicyRuntime() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/annotationRetentionPolicyRuntime.kt");
    }
    
    @TestMetadata("annotationRetentionPolicySource.kt")
    public void testAnnotationRetentionPolicySource() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/annotationRetentionPolicySource.kt");
    }
    
    @TestMetadata("componentEvaluatesOnlyOnce.kt")
    public void testComponentEvaluatesOnlyOnce() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/componentEvaluatesOnlyOnce.kt");
    }
    
    @TestMetadata("intConstantNotNull.kt")
    public void testIntConstantNotNull() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/intConstantNotNull.kt");
    }
    
    @TestMetadata("intConstantNullable.kt")
    public void testIntConstantNullable() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/intConstantNullable.kt");
    }
    
    @TestMetadata("intConstantNullableSafeCall.kt")
    public void testIntConstantNullableSafeCall() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/intConstantNullableSafeCall.kt");
    }
    
    @TestMetadata("intConstantSafeCall.kt")
    public void testIntConstantSafeCall() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/intConstantSafeCall.kt");
    }
    
    @TestMetadata("kt2202.kt")
    public void testKt2202() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/kt2202.kt");
    }
    
    @TestMetadata("kt2887.kt")
    public void testKt2887() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/kt2887.kt");
    }
    
    @TestMetadata("privateDefaultArgs.kt")
    public void testPrivateDefaultArgs() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/privateDefaultArgs.kt");
    }
    
    @TestMetadata("topLevelFunWithDefaultArgs.kt")
    public void testTopLevelFunWithDefaultArgs() throws Exception {
        doTest("compiler/testData/codegen/bytecodeText/topLevelFunWithDefaultArgs.kt");
    }
    
    @TestMetadata("compiler/testData/codegen/bytecodeText/statements")
    public static class Statements extends AbstractBytecodeTextTest {
        public void testAllFilesPresentInStatements() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/bytecodeText/statements"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("ifSingleBranch.kt")
        public void testIfSingleBranch() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/ifSingleBranch.kt");
        }
        
        @TestMetadata("ifThenElse.kt")
        public void testIfThenElse() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/ifThenElse.kt");
        }
        
        @TestMetadata("ifThenElseEmpty.kt")
        public void testIfThenElseEmpty() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/ifThenElseEmpty.kt");
        }
        
        @TestMetadata("tryCatchFinally.kt")
        public void testTryCatchFinally() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/tryCatchFinally.kt");
        }
        
        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/when.kt");
        }
        
        @TestMetadata("whenSubject.kt")
        public void testWhenSubject() throws Exception {
            doTest("compiler/testData/codegen/bytecodeText/statements/whenSubject.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("BytecodeTextTestGenerated");
        suite.addTestSuite(BytecodeTextTestGenerated.class);
        suite.addTestSuite(Statements.class);
        return suite;
    }
}
