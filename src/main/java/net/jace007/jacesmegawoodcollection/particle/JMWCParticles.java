package net.jace007.jacesmegawoodcollection.particle;

import net.jace007.jacesmegawoodcollection.JacesMegaWoodCollection;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JMWCParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, JacesMegaWoodCollection.MOD_ID);

    public static final Supplier<SimpleParticleType> AGRABAH_CEDAR_LEAVES =
            PARTICLE_TYPES.register("agrabah_cedar_leaves", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> ALLMEN_OAK_LEAVES =
            PARTICLE_TYPES.register("allmen_oak_leaves", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> AUDRAFLORA_OAK_LEAVES =
            PARTICLE_TYPES.register("audraflora_oak_leaves", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> BLACK_ABORA_LEAVES =
            PARTICLE_TYPES.register("black_abora_leaves", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> CARAVAN_OLIVEWOOD_LEAVES =
            PARTICLE_TYPES.register("caravan_olivewood_leaves", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> COPELAND_CEDAR_LEAVES =
            PARTICLE_TYPES.register("copeland_cedar_leaves", () -> new SimpleParticleType(false));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
