package net.icecream.slaycream.sounds;

import net.icecream.slaycream.SlayCream;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {


    public static SoundEvent THE_CORE = registerSoundEvent();

    private static SoundEvent registerSoundEvent() {
        Identifier id = new Identifier(SlayCream.MOD_ID, "the_core");
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
    