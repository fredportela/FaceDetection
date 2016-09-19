package com.br.service;

import java.awt.image.BufferedImage;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import com.br.util.Util;

public class ServiceDesfoqueImagem {
	
	public BufferedImage DesfocarImagem(Mat mat){
		
		mat = Desfocar(mat);
		
		return Util.converterParaImage(mat);
	}
	
	private Mat Desfocar(Mat image){
			      
		Mat destination = new Mat(image.rows(),image.cols(),image.type());
			      
		Imgproc.GaussianBlur(image, destination,new Size(45,45), 0);
		
		return destination;
	}
	
}
