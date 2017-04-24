package com.fenchtose.lithogifsearch.models;

import com.google.gson.JsonObject;

public class GifItem {

	private final String id;
	private final String image;
	private final int width;
	private final int height;
	private final boolean isLiked;

	public GifItem(JsonObject json, boolean isLiked) {
		this.id = json.get("id").getAsString();
		JsonObject image = json.get("images").getAsJsonObject().get("original").getAsJsonObject();
		this.image = image.get("url").getAsString();
		this.width = image.get("width").getAsInt();
		this.height = image.get("height").getAsInt();
		this.isLiked = isLiked;
	}

	public String getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public boolean isLiked() {
		return isLiked;
	}

}
