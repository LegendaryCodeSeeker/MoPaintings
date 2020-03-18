package net.mopaintings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PBookitem extends Item {

    public PBookitem(Settings settings) {
        super(settings);
    }
    public static final Item Beth_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Bob_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Jas_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Fred_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Smith_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Reboherin_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));
    public static final Item Random_Book = new PBookitem(new Item.Settings().group(MoPaintings.More_Paintings_Items).maxCount(1));

	public static void init() {
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "be_book"), Beth_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "bo_book"), Bob_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "ja_book"), Jas_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "fr_book"), Fred_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "sm_book"), Smith_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "re_book"), Reboherin_Book);
        Registry.register(Registry.ITEM, new Identifier("mopaintings", "ra_book"), Random_Book);
	}

}