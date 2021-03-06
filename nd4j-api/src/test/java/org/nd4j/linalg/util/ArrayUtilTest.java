/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.nd4j.linalg.util;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by agibsonccc on 9/6/14.
 */
public class ArrayUtilTest {

    @Test
    public void testCalcStridesFortran() {
        int[] strides = ArrayUtil.calcStridesFortran(new int[]{1, 2, 2});
    }

    @Test
    public void testStride() {
        int[] strides = new int[] {
                4,4,4,4
        };

        assertEquals(16,ArrayUtil.offsetFor(strides,1));
    }

}
