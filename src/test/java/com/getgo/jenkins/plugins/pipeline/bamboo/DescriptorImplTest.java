/**
 * The MIT License
 *
 * Copyright (c) 2017, LogMeIn, Inc.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package com.getgo.jenkins.plugins.pipeline.bamboo;

import hudson.model.TaskListener;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Test the {@link BuildBambooStep.DescriptorImpl} class.
 */
public class DescriptorImplTest {
    private BuildBambooStep.DescriptorImpl descriptor;

    @Before
    public void setUp() throws Exception {
        descriptor = new BuildBambooStep.DescriptorImpl();
    }

    @Test
    public void getRequiredContext() throws Exception {
        Set s = descriptor.getRequiredContext();
        assertTrue(s.containsAll(Collections.singleton(TaskListener.class)));
    }

    @Test
    public void getFunctionName() throws Exception {
        assertEquals("buildBamboo", descriptor.getFunctionName());
    }

    @Test
    public void getDisplayName() throws Exception {
        assertEquals("Build Bamboo", descriptor.getDisplayName());
    }
}