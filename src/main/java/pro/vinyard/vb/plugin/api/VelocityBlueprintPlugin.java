package pro.vinyard.vb.plugin.api;

import org.pf4j.Plugin;

public abstract class VelocityBlueprintPlugin extends Plugin {

    protected final PluginContext context;

    protected VelocityBlueprintPlugin(PluginContext context) {
        super();

        this.context = context;
    }
}
