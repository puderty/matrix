package com.tencent.matrix.trace.extension;

public class MatrixTraceExtension {
    boolean transformInjectionForced;
    String baseMethodMapFile;
    String blackListFile;
    String customDexTransformName;
    boolean skipCheckClass = true; // skip by default

    boolean enable;

    boolean enableSystrace;

//    public void setEnable(boolean enable) {
//        this.enable = enable;
//        onTraceEnabled(enable);
//    }

    public String getBaseMethodMapFile() {
        return baseMethodMapFile;
    }

    public String getBlackListFile() {
        return blackListFile;
    }

    public String getCustomDexTransformName() {
        return customDexTransformName;
    }

    public boolean isTransformInjectionForced() {
        return transformInjectionForced;
    }

    public boolean isEnable() {
        return enable;
    }

    public boolean isSkipCheckClass() {
        return skipCheckClass;
    }

    public boolean isEnableSystrace() {
        return enableSystrace;
    }
}
