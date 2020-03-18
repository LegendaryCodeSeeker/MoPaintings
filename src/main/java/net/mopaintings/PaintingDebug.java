package net.mopaintings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PaintingDebug extends AbstractDecorationEntity {

    protected PaintingDebug(EntityType<? extends AbstractDecorationEntity> world, World world2, BlockPos blockPos) {
        super(world, world2, blockPos);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getWidthPixels() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHeightPixels() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void onBreak(Entity entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPlace() {
        // TODO Auto-generated method stub

    }

    @Override
    public Packet<?> createSpawnPacket() {
        // TODO Auto-generated method stub
        return null;
    }

}