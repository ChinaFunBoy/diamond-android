/*
 *  Diamond Android - Diamond filters for the Android platform
 *
 *  Copyright (c) 2013-2014 Carnegie Mellon University
 *  All Rights Reserved.
 *
 *  This software is distributed under the terms of the Eclipse Public
 *  License, Version 1.0 which can be found in the file named LICENSE.
 *  ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS SOFTWARE CONSTITUTES
 *  RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT
 */

package edu.cmu.cs.diamond.android.token;

import edu.cmu.cs.diamond.android.TagEnum;

public class LogToken extends Token {
    public int level;
    public String msg;
    public LogToken(int level, String msg) {
        super(TagEnum.LOG);
        this.level = level;
        this.msg = msg;
    }
}
