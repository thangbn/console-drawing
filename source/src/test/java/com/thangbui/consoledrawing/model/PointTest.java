/*
 *
 *  * Copyright (c) 2017, Bui Nguyen Thang (Bob), thang.bn@live.com, thangbui.net. All rights reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *
 */

package com.thangbui.consoledrawing.model;

import org.junit.Test;

public class PointTest {
    @Test
    public void create() throws Exception {
        new Point(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create3() throws Exception {
        new Point(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create4() throws Exception {
        new Point(1, -2);
    }
}