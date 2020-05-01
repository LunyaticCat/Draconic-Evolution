package com.brandon3055.draconicevolution.client.render.item;

import codechicken.lib.render.item.IItemRenderer;
import codechicken.lib.util.TransformUtils;
import com.brandon3055.draconicevolution.client.model.ModelReactorStabilizerCore;
import com.brandon3055.draconicevolution.client.model.ModelReactorStabilizerRing;
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.TransformationMatrix;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.item.ItemStack;

/**
 * Created by brandon3055 on 21/11/2016.
 */
public class RenderItemReactorPart implements IItemRenderer {

//    public static ModelReactorStabilizerCore modelBase = new ModelReactorStabilizerCore();
//    public static ModelReactorStabilizerCore modelBaseRotors = new ModelReactorStabilizerCore();
//    public static ModelReactorStabilizerRing modelRing = new ModelReactorStabilizerRing();

    public RenderItemReactorPart() {
//        modelBaseRotors.rotor1R.childModels.clear();
//        modelBaseRotors.rotor2R.childModels.clear();
    }

    //region Unused

    @Override
    public boolean isAmbientOcclusion() {
        return true;
    }

    @Override
    public boolean isGui3d() {
        return false;
    }

    //endregion

    @Override
    public void renderItem(ItemStack stack, ItemCameraTransforms.TransformType transformType, MatrixStack mStack, IRenderTypeBuffer getter, int packedLight, int packedOverlay) {

    }

    @Override
    public ImmutableMap<ItemCameraTransforms.TransformType, TransformationMatrix> getTransforms() {
        return TransformUtils.DEFAULT_BLOCK;
    }

    @Override
    public boolean func_230044_c_() {
        return false;
    }


//    @Override
//    public void renderItem(ItemStack item, ItemCameraTransforms.TransformType transformType) {
//        RenderSystem.pushMatrix();
//        GlStateTracker.pushState();
//        RenderSystem.translate(0.5, 0.5, 0.5);
//
////        ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER_RING);
////        RenderSystem.rotate(90, 1, 0, 0);
////        RenderSystem.translate(0, -0.58, 0);
////        RenderSystem.scale(0.95, 0.95, 0.95);
//
////        RenderTileReactorComponent.renderStabilizer(25, 0, 1F, 0, true, -1);
//
//        switch (item.getItemDamage()) {
//            case 0:
//                ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER);
//                modelBase.basePlate.render(0.0625F);
//                break;
//            case 1:
//                ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER);
//                modelBaseRotors.rotor1R.render(0.0625F);
//                modelBaseRotors.rotor1R_1.render(0.0625F);
//                modelBaseRotors.rotor1R_2.render(0.0625F);
//                modelBaseRotors.rotor1R_3.render(0.0625F);
//                modelBaseRotors.rotor1R_4.render(0.0625F);
//                break;
//            case 2:
//                ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER);
//                modelBaseRotors.rotor2R.render(0.0625F);
//                modelBaseRotors.rotor2R_1.render(0.0625F);
//                modelBaseRotors.rotor2R_2.render(0.0625F);
//                modelBaseRotors.rotor2R_3.render(0.0625F);
//                modelBaseRotors.rotor2R_4.render(0.0625F);
//                break;
//            case 3:
//                ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER);
//                RenderSystem.rotate(30F, 0F, 0F, 1F);
//                modelBase.rotor1R.render(0.0625F);
//                modelBase.hub1.render(0.0625F);
//                RenderSystem.rotate(60F, 0F, 0F, -1F);
//                modelBase.hub2.render(0.0625F);
//                modelBase.rotor2R.render(0.0625F);
//                break;
//            case 4:
//                ResourceHelperDE.bindTexture(DETextures.REACTOR_STABILIZER_RING);
//                RenderSystem.rotate(90F, 0F, 0F, 1F);
//                modelRing.render(null, -30, 1, 1, 0, 0, 1F / 16F);
//                break;
//        }
//        GlStateTracker.popState();
//        RenderSystem.popMatrix();
//    }
}
