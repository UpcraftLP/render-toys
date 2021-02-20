package dev.upcraft.rendertoys.client;

import io.github.glasspane.mesh.api.annotation.CalledByReflection;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
@CalledByReflection
public class RenderToysClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }
}
