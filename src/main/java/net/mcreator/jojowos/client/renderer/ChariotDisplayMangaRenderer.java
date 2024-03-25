
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.ChariotDisplayMangaEntity;
import net.mcreator.jojowos.client.model.ModelSilverChariotAnimeDisplay;

public class ChariotDisplayMangaRenderer extends MobRenderer<ChariotDisplayMangaEntity, ModelSilverChariotAnimeDisplay<ChariotDisplayMangaEntity>> {
	public ChariotDisplayMangaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSilverChariotAnimeDisplay(context.bakeLayer(ModelSilverChariotAnimeDisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChariotDisplayMangaEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/silverchariotmangatexture.png");
	}
}
