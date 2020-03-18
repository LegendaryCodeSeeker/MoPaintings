package net.mopaintings;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoPaintings implements ModInitializer {

    public static final ItemGroup More_Paintings_Items = FabricItemGroupBuilder.build(new Identifier("more_paintings", "items"), () -> new ItemStack(MoPaintings.Sketch_Kit));
    public static final ItemGroup More_Paintings_Blocks = FabricItemGroupBuilder.build(new Identifier("more_paintings", "blocks"), () -> new ItemStack(MoPaintings.MPBookshelf));

    //public static final Item Painting_Debug = new PaintingDebug(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Bundle_Paper = new BundlePaper(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(32));
    public static final Item Sketch_Kit = new SketchKit(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));

    public static final Block MPBookshelf = new MP_BookShelf();

    @Override
    public void onInitialize() {
        PBookitem.init();
        //Registry.register(Registry.ITEM, new Identifier("mopaintings", "painting_debug"), Painting_Debug);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "paper_bundle"), Bundle_Paper);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "sketch_kit"), Sketch_Kit);

        Registry.register(Registry.ITEM, new Identifier("mopaintings", "mp_bookshelf"), new BlockItem(MPBookshelf, new Settings().group(MoPaintings.More_Paintings_Blocks)));
        Registry.register(Registry.BLOCK, new Identifier("mopaintings", "mp_bookshelf"), MPBookshelf);
    }


}