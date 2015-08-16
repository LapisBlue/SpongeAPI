/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.property.entity;

import org.spongepowered.api.data.property.DoubleProperty;

/**
 * Represents the eye height of an entity. This value should be added
 * as an offset to the Y coordinate of the position when tracing objects
 * in the line of sight.
 */
public class EyeHeightProperty extends DoubleProperty {

    /**
     * Creates a new {@link EyeHeightProperty} with the given
     * eye height offset.
     *
     * @param value eye height offset
     */
    public EyeHeightProperty(double value) {
        super(value);
    }

    /**
     * Creates a new {@link EyeHeightProperty} with the given
     * eye height offset.
     *
     * @param value eye height offset
     * @param operator The operator to compare this property to other properties
     */
    public EyeHeightProperty(double value, Operator operator) {
        super(value, operator);
    }

}
