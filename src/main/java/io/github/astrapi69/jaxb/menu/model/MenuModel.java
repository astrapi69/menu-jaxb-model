/**
 * The MIT License
 *
 * Copyright (C) 2022 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.jaxb.menu.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * The class {@link MenuModel} is intended for store the information of a menu and on need to
 * restore the menu
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlRootElement(name = "MenuModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class MenuModel
{
	/**
	 * The name of this menu component. The name is used as the menu id and as the action command of
	 * this menu component
	 */
	String name;

	/**
	 * The text of this menu component. The text is used as the label of this menu component
	 */
	String text;

	/**
	 * The keyboard mnemonic of this menu component
	 */
	Integer mnemonic;

	/**
	 * The ordinal of this menu component. The ordinal is used for ordering this menu component
	 */
	int ordinal;

	/**
	 * The {@link KeyStrokeModel} of this menu component
	 */
	KeyStrokeModel keyStrokeModel;

	/**
	 * The {@link MenuType} describes the type of this menu component
	 */
	MenuType type;

	/**
	 * The anchor describes where to position this menu component
	 */
	Anchor anchor;

	/**
	 * If the anchor value is set to {@link Anchor#BEFORE} or {@link Anchor#AFTER} than this value
	 * is the menu id that it will be relatively placed to
	 */
	String relativeToMenuId;

	/**
	 * The action command of this menu component
	 */
	String actionCommand;
}
