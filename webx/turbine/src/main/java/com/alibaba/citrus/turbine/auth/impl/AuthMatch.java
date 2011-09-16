package com.alibaba.citrus.turbine.auth.impl;

import static com.alibaba.citrus.util.ObjectUtil.*;

import com.alibaba.citrus.util.ToStringBuilder;
import com.alibaba.citrus.util.ToStringBuilder.MapBuilder;

/**
 * ����һ��patterns��grants��Ȩ����ϡ�
 * 
 * @author Michael Zhou
 */
public class AuthMatch {
    private final static AuthGrant[] NO_GRANTS = new AuthGrant[0];
    private final AuthPattern pattern;
    private final AuthGrant[] grants;

    public AuthMatch(String pattern, AuthGrant[] grants) {
        this.pattern = new AuthTargetPattern(pattern);
        this.grants = defaultIfNull(grants, NO_GRANTS);
    }

    public AuthPattern getPattern() {
        return pattern;
    }

    public AuthGrant[] getGrants() {
        return grants;
    }

    @Override
    public String toString() {
        MapBuilder mb = new MapBuilder();

        mb.append("pattern", pattern);
        mb.append("grants", grants);

        return new ToStringBuilder().append("Match").append(mb).toString();
    }
}