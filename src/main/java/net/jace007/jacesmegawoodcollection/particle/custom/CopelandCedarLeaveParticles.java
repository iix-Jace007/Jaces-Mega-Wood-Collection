package net.jace007.jacesmegawoodcollection.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class CopelandCedarLeaveParticles extends TextureSheetParticle {
    protected CopelandCedarLeaveParticles(ClientLevel level, double x, double y, double z, SpriteSet spriteSet,
                                       double xSpeed, double ySpeed, double zSpeed) {
        super(level, x, y, z, xSpeed, ySpeed, zSpeed);

        this.setSprite(spriteSet.get(this.random.nextInt(12), 12));
        this.lifetime = 200;
        this.xd *= 0.05;
        this.zd *= 0.05;
        this.gravity = 0.01F;
        this.yd = -0.02 - random.nextDouble() * 0.02;
        float f = this.random.nextBoolean() ? 0.05F : 0.075F;
        this.quadSize = 0.2f;
        this.setSize(f, f);
        this.friction = 1.0F;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientLevel,
                                                 double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            return new CopelandCedarLeaveParticles(clientLevel, pX, pY, pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
        }
    }
}