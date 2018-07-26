package com.ldtteam.animatrix.entity;

import com.ldtteam.animatrix.model.IModel;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class AbstractEntityAnimatrix extends EntityLiving
{

    public AbstractEntityAnimatrix(final World worldIn)
    {
        super(worldIn);
    }

    /**
     * Returns the model for this entity.
     *
     * @return The model for the entity.
     */
    @SideOnly(Side.CLIENT)
    public abstract IModel getAnimatrixModel();

}
