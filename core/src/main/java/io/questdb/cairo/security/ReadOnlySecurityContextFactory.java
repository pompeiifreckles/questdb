package io.questdb.cairo.security;

import io.questdb.cairo.SecurityContext;

public final class ReadOnlySecurityContextFactory implements SecurityContextFactory {
    public static final ReadOnlySecurityContextFactory INSTANCE = new ReadOnlySecurityContextFactory();

    @Override
    public SecurityContext getInstance(CharSequence principal, byte authType, byte interfaceId) {
        return ReadOnlySecurityContext.INSTANCE;
    }
}
