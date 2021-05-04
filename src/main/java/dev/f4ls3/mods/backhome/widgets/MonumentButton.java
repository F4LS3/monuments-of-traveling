package dev.f4ls3.mods.backhome.widgets;

import dev.f4ls3.mods.backhome.utils.Monument;
import net.minecraft.client.gui.widget.button.Button;

public class MonumentButton extends Button {

    public MonumentButton(int x, int y, Monument monument, IPressable pressedAction) {
        super(x, y, 200, 20, monument.getMonumentNameComponent(), pressedAction);
    }
}
