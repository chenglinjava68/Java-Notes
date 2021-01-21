/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.control;

/**
Builder class for javafx.scene.control.SeparatorMenuItem
@see javafx.scene.control.SeparatorMenuItem
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class SeparatorMenuItemBuilder<B extends javafx.scene.control.SeparatorMenuItemBuilder<B>> extends javafx.scene.control.CustomMenuItemBuilder<B> {
    protected SeparatorMenuItemBuilder() {
    }

    /** Creates a new instance of SeparatorMenuItemBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.control.SeparatorMenuItemBuilder<?> create() {
        return new javafx.scene.control.SeparatorMenuItemBuilder();
    }

    /**
    Make an instance of {@link javafx.scene.control.SeparatorMenuItem} based on the properties set on this builder.
    */
    public javafx.scene.control.SeparatorMenuItem build() {
        javafx.scene.control.SeparatorMenuItem x = new javafx.scene.control.SeparatorMenuItem();
        applyTo(x);
        return x;
    }
}
