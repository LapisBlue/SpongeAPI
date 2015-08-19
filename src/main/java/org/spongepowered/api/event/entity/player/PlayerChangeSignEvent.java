package org.spongepowered.api.event.entity.player;

import org.spongepowered.api.block.tileentity.Sign;
import org.spongepowered.api.data.manipulator.immutable.tileentity.ImmutableSignData;
import org.spongepowered.api.data.manipulator.mutable.tileentity.SignData;

public interface PlayerChangeSignEvent extends PlayerEvent {

    /**
     * Gets the target {@link Sign} being changed.
     *
     * @return The Sign
     */
    Sign getTarget();

    /**
     * Gets the original {@link ImmutableSignData} before event changes.
     * @return The immutable SignData
     */
    ImmutableSignData getOriginalText();

    /**
     * Gets the {@link SignData} to be applied to the {@link Sign} after event resolution.
     * @return The SignData
     */
    SignData getText();
}
