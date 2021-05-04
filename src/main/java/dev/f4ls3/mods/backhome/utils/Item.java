package dev.f4ls3.mods.backhome.utils;

public class Item extends net.minecraft.item.Item {

    private Properties properties;

    public Item(Properties properties) {
        super(properties);

        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }
}
