package net.onpointcoding.clockhud.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.onpointcoding.clockhud.enums.ClockPosition;
import net.onpointcoding.clockhud.enums.DisplayPosition;

@Config(name = "clockhud")
@Config.Gui.Background("minecraft:textures/block/cut_copper.png")
public class ConfigStructure implements ConfigData {
    public boolean clockEnabled = true;
    public boolean iconEnabled = true;

    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public ClockPosition iconPosition = ClockPosition.RIGHT;

    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public DisplayPosition position = DisplayPosition.BOTTOM_RIGHT;


    @ConfigEntry.ColorPicker
    public int colour = 0xffffff;

    public int xOffset = -2;

    public int yOffset = -1;
}
