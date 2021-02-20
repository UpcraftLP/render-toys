package dev.upcraft.rendertoys;

import io.github.glasspane.mesh.api.annotation.CalledByReflection;
import io.github.glasspane.mesh.api.logging.MeshLoggerFactory;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;

@CalledByReflection
public class RenderToys implements ModInitializer {

    public static final String MODID = "render_toys";
    private static final Logger logger = MeshLoggerFactory.createLogger("RenderToys");

    @Override
    public void onInitialize() {

    }

    public static Logger getLogger() {
        return logger;
    }
}
