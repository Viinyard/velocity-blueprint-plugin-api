package pro.vinyard.vb.plugin.api;

import org.pf4j.RuntimeMode;

public class PluginContext {

    private final RuntimeMode runtimeMode;

    public PluginContext(RuntimeMode runtimeMode) {
        this.runtimeMode = runtimeMode;
    }

    public RuntimeMode getRuntimeMode() {
        return runtimeMode;
    }
}
