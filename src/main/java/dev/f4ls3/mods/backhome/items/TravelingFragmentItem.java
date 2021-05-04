package dev.f4ls3.mods.backhome.items;

import dev.f4ls3.mods.backhome.BackHome;
import dev.f4ls3.mods.backhome.lists.Sounds;
import dev.f4ls3.mods.backhome.utils.UsableItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class TravelingFragmentItem extends UsableItem {

    public TravelingFragmentItem() {
        super(new Properties()
                .group(BackHome.ITEM_GROUP));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        if(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            tooltip.add(new TranslationTextComponent("tooltip.backhome.items.traveling_fragment.lore"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.backhome.items.traveling_fragment.hold_shift"));
            tooltip.add(new TranslationTextComponent("tooltip.backhome.items.traveling_fragment.tooltip"));
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        player.playSound(Sounds.TRAVELING_SOUND.get(), SoundCategory.VOICE, 1.0f, 1.0f);
        

        // TODO: Open GUI and display all registered monuments of traveling as buttons

        return new ActionResult<>(ActionResultType.SUCCESS, player.getHeldItem(hand));
    }
}
