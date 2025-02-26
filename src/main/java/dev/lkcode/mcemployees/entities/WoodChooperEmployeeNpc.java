package dev.lkcode.mcemployees.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;

public class WoodChooperEmployeeNpc {
    public static InteractionResult spawn(UseOnContext context) {
        if (!context.getLevel().isClientSide) {
            Zombie employeeNpc = EntityType.ZOMBIE.create(context.getLevel());
            if (employeeNpc != null) {
                BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
                employeeNpc.moveTo(pos.getX(), pos.getY(), pos.getZ(), 0.0F, 0.0F);
                employeeNpc.setCustomName(Component.translatable("entity.mcemployees.employee_wood_chooper"));
                employeeNpc.setCustomNameVisible(true);

                // Set leather armor
                employeeNpc.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET));
                employeeNpc.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
                employeeNpc.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.LEATHER_LEGGINGS));
                employeeNpc.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.LEATHER_BOOTS));
                employeeNpc.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_AXE));


                context.getLevel().addFreshEntity(employeeNpc);
                context.getItemInHand().shrink(1);
            }
        }
        return InteractionResult.SUCCESS;
    }
}