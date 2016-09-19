package com.br.util;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;

public class Util {
	
	public static Mat converterParaMat(BufferedImage im) {
		
		byte[] pixels = ((DataBufferByte)im.getRaster().getDataBuffer()).getData();
		Mat mat = new Mat(im.getHeight(), im.getWidth(), CvType.CV_8UC3);
		mat.put(0, 0, pixels);
		
		return mat;
	}
	
	public static BufferedImage converterParaImage(Mat image){

		MatOfByte bytemat = new MatOfByte();

		Highgui.imencode(".jpg", image, bytemat);

		byte[] bytes = bytemat.toArray();

		InputStream in = new ByteArrayInputStream(bytes);

		BufferedImage img=null;

		try {
                    img = ImageIO.read(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return img;
	}

}
