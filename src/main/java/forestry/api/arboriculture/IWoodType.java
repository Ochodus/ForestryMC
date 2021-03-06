/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.arboriculture;

import net.minecraft.util.IStringSerializable;

/**
 * @see EnumForestryWoodType
 * @see EnumVanillaWoodType
 */
public interface IWoodType extends IStringSerializable {
	int getMetadata();

	float getHardness();

	String getPlankTexture();

	String getDoorLowerTexture();

	String getDoorUpperTexture();

	String getBarkTexture();

	String getHeartTexture();
}
