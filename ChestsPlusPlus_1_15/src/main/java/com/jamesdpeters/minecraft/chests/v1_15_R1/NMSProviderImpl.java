package com.jamesdpeters.minecraft.chests.v1_15_R1;

import com.jamesdpeters.minecraft.chests.*;
import com.jamesdpeters.minecraft.chests.v1_14_R1.EntityEventListener_1_14;
import org.bukkit.entity.ItemFrame;

public class NMSProviderImpl implements NMSProvider {
    @Override
    public ChestOpener getChestOpener() {
        return new ChestOpener_1_15();
    }

    @Override
    public MaterialChecker getMaterialChecker() {
        return new MaterialChecker_1_15();
    }

    @Override
    public CraftingProvider getCraftingProvider() {
        return new Crafting();
    }

    @Override
    public EntityEventListener getEntityEventListener() {
        return new EntityEventListener_1_14();
    }

    @Override
    public void setItemFrameVisible(ItemFrame itemFrame, boolean visible) {
        //Not supported in 1.15
    }
}
