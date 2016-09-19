package com.br.model;

import java.awt.image.BufferedImage;

public class PropriedadesFace {
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage imageCortada;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage getImageCortada() {
		return imageCortada;
	}
	public void setImageCortada(BufferedImage imageCortada) {
		this.imageCortada = imageCortada;
	}
}
