package net.jace007.jacesmegawoodcollection.block.custom.leaves;

import net.jace007.jacesmegawoodcollection.block.custom.JMWCLeaves;
import net.jace007.jacesmegawoodcollection.particle.JMWCParticles;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class AudrafloraOakLeaves extends JMWCLeaves {
    public AudrafloraOakLeaves(Properties properties) {
        super(properties);

    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!(level instanceof ClientLevel client)) return;

        // Chance per tick
        if (random.nextInt(20) != 0) return;

        // Only if air below
        if (!level.getBlockState(pos.below()).isAir()) return;

        double x = pos.getX() + random.nextDouble();
        double y = pos.getY() - 0.05;
        double z = pos.getZ() + random.nextDouble();

        double vx = (random.nextDouble() - 0.5) * 0.01;
        double vz = (random.nextDouble() - 0.5) * 0.01;

        client.addParticle(
                JMWCParticles.AUDRAFLORA_OAK_LEAVES.get(),
                x, y, z,
                vx, 0, vz
        );
    }
}